package basic;

import java.util.Scanner;

public class desconto {

	public static void main(String[] args) {
		
		System.out.println("Escolha um Produto:");
		System.out.println("Teclado Multilaser USB = R$ 79.99");
		System.out.println("SSD Sandisk plus, 240GB = R$ 270.00");
		System.out.println("Geforce rtx 2080 ti = 11981.61");
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual o produto você deseja comprar? teclado = 1/ ssd = 2/ rtx_2080 = 3");
		int nome = input.nextInt();
		
		if (nome == 1) {
			double d = (79.99 * 0.5);
			double valorFinal = (79.99 - d); 
			System.out.printf("Teclado = %.2f \n", valorFinal);
			
		}
		
		else if (nome == 2) {
			double d = (270.00 * 0.10);
			double valorFinal = (270.00 - d); 
			System.out.printf("SSD = %.2f \n", valorFinal);
			
		}
		
		else if (nome == 3) {
			double d = (11981.61 * 0.15);
			double valorFinal = (11981.61 - d); 
			System.out.printf("rtx 2080 = %.2f \n", valorFinal);
			
		}
		
		else {
			
			System.out.println("Produto não existe");
		}
		
		input.close();
	}
	
}
