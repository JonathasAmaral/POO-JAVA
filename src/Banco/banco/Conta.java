package banco;

import exceptions.ValorAcimaException;
import exceptions.ValorInvalidoException;

public abstract class Conta {

	/**
	 * agencia: representa o n�mero da ag�ncia;
	 * 
	 * numConta: representa o n�mero da conta;
	 * 
	 * titular: representa o titular da conta (o usuario);
	 * 
	 * credLimite: armazena a quantidade atual dispon�vel... de credito da conta;
	 * 
	 * saldo: � o valor que realmente � pertencente ao usu�rio;
	 * 
	 * valorLimite: consiste no valor m�ximo que o banco lhe fornece para sacar;
	 */
	
	private Banco banco;
	private Agencia agencia;
	private int numConta;
	private String titular;
	private double credLimite, saldo, valorLimite;

	/**
	 * Construtor da classe;
	 */

	public Conta(Agencia agencia, int numConta, String titular, double credLimite, double saldo, double valorLimite, Banco banco) {
		super();
		this.setAgencia(agencia);
		this.numConta = numConta;
		this.titular = titular;
		this.credLimite = credLimite;
		this.saldo = saldo;
		this.valorLimite = valorLimite;
		this.banco = banco;
	}

	public void sacar(double valor) throws ValorAcimaException, ValorInvalidoException {

		if (valor <= 0) {
			throw new IllegalArgumentException("Valor negativo ou 0 n�o aceitos pelo sistema");
		}

		if (valor > getValorLimite()) {
			throw new ValorAcimaException("Voce nao possui esse limite de saque disponivel na conta");
		}

		if (valor > getSaldo()) {
			throw new ValorInvalidoException("Voce nao possui esse valor em conta");
		}

		setSaldo(getSaldo() - valor);

	}

	public final void depositar(double valor) {

		if (valor <= 0) {

			throw new IllegalArgumentException("N�o � posivel deposita um valor menor ou igual a 0");
		}

		setSaldo(getSaldo() + valor);
	}

	public void setValorLimiteDeSaque(double valor) {

		setValorLimite(valor);
	}

	/*
	 * getters and setters;
	 */

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCredLimite() {
		return credLimite;
	}

	public void setCredLimite(double credLimite) {
		this.credLimite = credLimite;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

}
