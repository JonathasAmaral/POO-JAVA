import java.util.Scanner;

public class mediaAritmetica {

  public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Write three values:");
    double valor1 = input.nextDouble();
    double valor2 = input.nextDouble();
    double valor3 = input.nextDouble();
    
    double media = (valor1 + valor2 + valor3) / 3;
    
    System.out.printf("The arithmetic mean is: %.2f \n", media);
    
  }
  

}