package br.com.cea.ecommerce.affiliated.vo;

import java.util.Date;

public class DependentVO {

	private Long idPessoa;
	
	private String codEmpresa;
	
	private Long chapa;
	
	private Date dataAdmissao;
	
	private Date dataDemissao;
	
	private String nome;
	
	private String cpf;
	
	private Long quantidadeDependente;
	
	private Date dataUltimaAcao;
	
	private String situacao;
	
	private String situacaoDependente;

	public DependentVO() {
		super();
	}

	public Long getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(String codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public Long getChapa() {
		return chapa;
	}

	public void setChapa(Long chapa) {
		this.chapa = chapa;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Date getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Long getQuantidadeDependente() {
		return quantidadeDependente;
	}

	public void setQuantidadeDependente(Long quantidadeDependente) {
		this.quantidadeDependente = quantidadeDependente;
	}

	public Date getDataUltimaAcao() {
		return dataUltimaAcao;
	}

	public void setDataUltimaAcao(Date dataUltimaAcao) {
		this.dataUltimaAcao = dataUltimaAcao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getSituacaoDependente() {
		return situacaoDependente;
	}

	public void setSituacaoDependente(String situacaoDependente) {
		this.situacaoDependente = situacaoDependente;
	}
	
}
