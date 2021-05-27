package exceptions.exception;

public class Main{

    public static void main(String[] args) {
        
        
        ContaCorrente teste1 = new ContaCorrente();

        teste1.depositar(10000);
        teste1.setValorLimite(200);

        try{
            teste1.sacar(100);
        } catch (ValorAcimaException e) {
            System.out.println(e.getMessage());
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        } finally {
            //Encerrar
        }
        
    

    }
}
