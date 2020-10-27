package basic;

import java.util.Scanner;

public class SomaMultiplos3 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int valores = 0;
		
		System.out.print("Digite 50 numeros da sua escolha \n");
		
		for (int i = 1 ; i <= 50 ; ++i ) {
			
			int valor = input.nextInt();
			
			if (valor % 3 == 0 && valor > 0) {
				
				valores += valor;
			}
		}
		input.close();
		
		System.out.print("A soma de dos multiplos de 3 é = " + valores + "\n");
	}
}
