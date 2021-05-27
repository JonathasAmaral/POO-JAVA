package exceptions.exception;

public class ContaCorrente {
    
    private float limite;
    private float saldo;
    private float valorLimite;

    public void sacar(float valor) throws ValorAcimaException, ValorInvalidoException { 

        if (valor <= 0) {
            throw new IllegalArgumentException("Voce colocou um valor negativo ou 0");
        }

        if (valor > valorLimite) {
            throw new ValorAcimaException("Voce nao possui esse valor na sua conta");
        }
        
        if (valor > saldo) {
            throw new ValorInvalidoException("Voce nao possui esse valor na sua conta");
        }

        saldo -= valor;
    }

    public void depositar(float valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException("Voce colocou um valor menor que negativo ou 0");
        }

        saldo += valor; 
       
    }

    public void setValorLimite(float valor) {
        
        if (valor <= 0) {
            throw new IllegalArgumentException("Voce colocou um valor menor que negativo ou 0");
        }

        this.valorLimite = valor;
    }  
    
    public float getLimite() {
        return limite;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getValorLimite() {
        return valorLimite;
    }
    
}
