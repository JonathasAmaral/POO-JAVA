package basic;
import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
	
		
		System.out.print("Digite numeros da sua escolha: \n");		
		int contadorPares = 0;
		int media = 0;
		
		Scanner input = new Scanner(System.in);
		int numero = 0;
		
		while (numero != 100) {
			numero = input.nextInt();
			if (numero % 2 == 0 && numero != 100) {
				contadorPares ++;
				media += numero;
			}
		}
		
		System.out.print("Quantidade de numeros pares positivos = " + contadorPares + "\n");
		System.out.print("A media dos numeros pares digitados é = " + media/contadorPares + "\n");
		
		input.close();
	}

}
