CREATE TABLE cnab_bank_slip(
    id_bank_slip 	NUMBER PRIMARY KEY,	
	date_occurrence 	CHAR(6) NOT NULL,
	sequence_order      CHAR(8) NOT NULL,
	order_id 			VARCHAR2(128) NOT NULL,
	due_date     		CHAR(6) NOT NULL,
	value_bank_slip		NUMBER(13, 2) NOT NULL,
	value_payment		NUMBER(13, 2) NOT NULL,
	deposit_date 		CHAR(6) NOT NULL,
	payer 				VARCHAR2(30),
	line_detail 		CHAR(400) NOT NULL,
	payment_id 			CHAR(128) NOT NULL,
	creation_date 		DATE NOT NULL,
	operation_type 		VARCHAR2(20) NOT NULL,
	status 				NUMBER NOT NULL,
	action_description 	VARCHAR2(255) NOT NULL,
	return_callback 	VARCHAR2(4000)
);

COMMENT ON COLUMN cnab_bank_slip.id_bank_slip IS 'Identificador unico.';
COMMENT ON COLUMN cnab_bank_slip.date_occurrence IS 'DATA DE OCORRÊNCIA NO BANCO.';
COMMENT ON COLUMN cnab_bank_slip.sequence_order IS 'CONFIRMAÇÃO DO NÚMERO DO TÍTULO NO BANCO (Pedido).';
COMMENT ON COLUMN cnab_bank_slip.order_id IS 'Identificador do pedido no E-Commerce.';
COMMENT ON COLUMN cnab_bank_slip.due_date IS 'DATA DE VENCIMENTO DO TÍTULO.';
COMMENT ON COLUMN cnab_bank_slip.value_bank_slip IS 'VALOR NOMINAL DO TÍTULO.';
COMMENT ON COLUMN cnab_bank_slip.value_payment IS 'VALOR LANÇADO EM CONTA CORRENTE.';
COMMENT ON COLUMN cnab_bank_slip.deposit_date IS 'DATA DE CRÉDITO DESTA LIQUIDAÇÃO.';
COMMENT ON COLUMN cnab_bank_slip.payer IS 'NOME DO PAGADOR.';
COMMENT ON COLUMN cnab_bank_slip.line_detail IS 'Informacoes completa do registro enviado pelo banco.';
COMMENT ON COLUMN cnab_bank_slip.payment_id IS 'Id do pagamento.';
COMMENT ON COLUMN cnab_bank_slip.creation_date IS 'Data que foi inserido o registro.';
COMMENT ON COLUMN cnab_bank_slip.operation_type IS '(CALLBACK) Enviado para dar baixa (EMAIL) Enviado e-mail para o SAC.';
COMMENT ON COLUMN cnab_bank_slip.status IS '(1) Enviado com sucesso para baixa (2) Enviado e-mail para o SAC.';
COMMENT ON COLUMN cnab_bank_slip.action_description IS 'Breve descricao da acao.';
COMMENT ON COLUMN cnab_bank_slip.return_callback IS 'Retorno do servico chamado.';

CREATE SEQUENCE sqn_cnab_bank_slip MINVALUE 1 MAXVALUE 999999999999999999999999999 START WITH 1 INCREMENT BY 1 NOCACHE;