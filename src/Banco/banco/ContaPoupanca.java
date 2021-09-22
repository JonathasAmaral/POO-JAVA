package banco;

import exceptions.ValorAcimaException;
import exceptions.ValorInvalidoException;

public final class ContaPoupanca extends Conta {

	private double taxa;
	
	public ContaPoupanca(Agencia agencia, int numConta, String titular, double credLimite, double saldo,
			double valorLimite, Banco banco) {
		super(agencia, numConta, titular, credLimite, saldo, valorLimite, banco);
		// extends de Conta;

	}
	
	public ContaPoupanca(Agencia agencia, int numConta, String titular, double credLimite, double saldo,
			double valorLimite, Banco banco, double taxa) {
		super(agencia, numConta, titular, credLimite, saldo, valorLimite, banco);
		// extends de Conta;
		this.taxa = taxa;
	}
	
	@Override
	public final void sacar(double valor) throws ValorAcimaException, ValorInvalidoException {

		if (valor <= 0) {
			throw new IllegalArgumentException("Valor negativo ou 0 não aceitos pelo sistema");
		}

		if (valor > getValorLimite()) {
			throw new ValorAcimaException("Voce nao possui esse limite de saque disponivel na conta");
		}

		if (valor > getSaldo() + taxa) {
			throw new ValorInvalidoException("Voce nao possui esse valor em conta");
		}

		setSaldo(getSaldo() - valor - taxa);

	}
	

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

}
