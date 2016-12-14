package br.com.cea.ecommerce.command;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.xml.namespace.QName;

import br.com.cea.ebo.cea.v1.MetaInfType;
import br.com.cea.ebs.cea.ecommerce.bankslip.v1.BankSlip;
import br.com.cea.ebs.cea.ecommerce.bankslip.v1.BankSlipPortType;
import br.com.cea.ebs.cea.ecommerce.bankslip.v1.BankSlipRequest;
import br.com.cea.ebs.cea.ecommerce.bankslip.v1.BankSlipService;
import br.com.cea.ecommerce.util.LogUtil;

public class ReadFileCNABCommand extends AbstractCommand{

	private Properties properties = null;
	
	private File fileCNAB = null;
	
	private LogUtil logUtil = null;
	
	public ReadFileCNABCommand() throws Exception{
		
	}
	
	public void execute() throws Exception{
		properties = getProperties();
		fileCNAB = getFile(properties.getProperty("file.base.dir") + properties.getProperty("file.separator") + properties.getProperty("file.ecommerce.dir"), properties.getProperty("extension.file.name.ecommerce"));
		
		if(fileCNAB == null || !fileCNAB.isFile()){
			throw new Exception("Arquivo CNAB nao encontrado.");
		}
		
		logUtil = LogUtil.getInstance();
		logUtil.setProperties(getProperties());
		
		logUtil.info("Processo de CNAB iniciado dos arquivos " + fileCNAB.getName() + " e " + fileCNAB.getName());
		
		BufferedReader brCNAB = new BufferedReader(new FileReader(fileCNAB));
		String line = null;				
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String prefix = df.format(new Date()).replaceAll("[^0-9]", "_") + "_";
		int quantity = 0;
		
		while((line = brCNAB.readLine()) != null){
			if(line.startsWith("1")){
				BankSlipRequest request = new BankSlipRequest();
				BankSlip bankSlip = new BankSlip();
				bankSlip.setDateOccurrence(line.substring(110, 116));
				bankSlip.setOrderId(Long.valueOf(line.substring(126, 134))+"");
				bankSlip.setDueDate(line.substring(146, 152));
				bankSlip.setValueBankSlip(new BigDecimal(line.substring(152, 165)).divide(new BigDecimal(100)));
				bankSlip.setValuePayment(new BigDecimal(line.substring(253, 266)).divide(new BigDecimal(100)));
				bankSlip.setDepositDate(line.substring(295, 301));
				bankSlip.setPayer(line.substring(324, 354));
				bankSlip.setLineDetail(line);
				
				BankSlipService service = new BankSlipService(new URL(properties.getProperty("url.service")), new QName("http://www.cea.com.br/EBS/CEA/ecommerce/bankslip/v1", "BankSlip_Service"));
				BankSlipPortType bankSlipPortType = service.getBankSlipService();
				
				MetaInfType header = new MetaInfType();
				header.setTransacaoId(System.currentTimeMillis() + "");
				header.setCodigoAplicacaoOrigem("JSE");
				header.setCodigoAplicacaoOrigem("JSE");
				header.setEnderecoAplicacaoOrigem("localhost");
				header.setUsuarioIdOrigem("123");
				request.setBankSlip(bankSlip);
				bankSlipPortType.bankSlip(request, header);
				quantity++;
				logUtil.info("Pedido [" + bankSlip.getOrderId() + "] enviado com sucesso.");
			}
		}
		
		brCNAB.close();
		
		logUtil.info("Quantidade de boletos enviados " + quantity);
		
		transferFile(fileCNAB, properties.getProperty("file.base.dir") + properties.getProperty("file.separator") + properties.getProperty("file.copy.dir"), prefix);
	}
	
	public File getFile(String pathDir, String extension){
		File list = new File(pathDir);
		File file = null;

		for(String s: list.list()){
			if(s.toLowerCase().endsWith(extension.toLowerCase())){
				file = new File(pathDir + properties.getProperty("file.separator") + s);
				break;
			}
		}
		return file;
	}
	
	private void transferFile(File from, String to, String prefix) throws Exception{
		File fileCopy = new File(to + properties.getProperty("file.separator") + prefix + from.getName());
		InputStream inStream = new FileInputStream(from);
		OutputStream outStream = new FileOutputStream(fileCopy);
 
		byte[] buffer = new byte[1024];
 
		int length;

		while ((length = inStream.read(buffer)) > 0){ 
			outStream.write(buffer, 0, length); 
		}
 
		inStream.close();
		outStream.close();
		
		from.delete();
		
		logUtil.info("Arquivo tranferido de: " + from.getAbsoluteFile());
		logUtil.info("Arquivo tranferido para: " + fileCopy.getAbsoluteFile());		
	}

}