import java.util.Scanner;

public class maiorVontoFlutuante {
    
    public static void main(String [] args) {
     
      Scanner valor = new Scanner(System.in);
      
      System.out.println("Digite um valor flutuante");
      double valor1 = valor.nextDouble();
      System.out.println("Digite o segundo valor flutuante");
      double valor2 = valor.nextDouble();
      
      if (valor1 > valor2) {
        
        System.out.printf("O maior valor é o primeiro valor digitado: %.2f \n", valor1);
        
      }
      
      else if (valor2 > valor1) {
        
        System.out.printf("O maior valor é o segundo valor digitado: %.2f \n", valor2);
      }
      
    }

}
