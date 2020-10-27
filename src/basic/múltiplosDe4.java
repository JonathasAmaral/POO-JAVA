package basic;

import java.util.Scanner;

public class múltiplosDe4 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro: \n");
		int valor1 = input.nextInt();
		
		System.out.print("Didite outro valor inteiro: \n");
		int valor2 = input.nextInt();
		
		input.close();
		
			
		for (int i = 1 ; i <= valor1 ; ++i ) {
			
			if (valor1 % 4 == 0) {
				
				if (i % 4 == 0) {
				
					System.out.print("(" + valor1 + ") Os multiplo de 4 são =" + i + "\n");
				}
			
			}
		}
		
		for (int i = 1 ; i <= valor2 ; ++i ) {
			
			if (valor2 % 4 == 0) {
				
				if (i % 4 == 0) {
				
					System.out.print("(" + valor2 + ") Os multiplo de 4 são =" + i + "\n");
				}
			}
		}
		
	}
}