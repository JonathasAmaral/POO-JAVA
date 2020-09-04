import java.util.Scanner;

public class paresPositivos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int contadorPares = 0;
		
		for (int i = 0; i <= 24; i++) {
		
			System.out.println("Digite um número: ");
			int numero = input.nextInt();
			
			if (numero % 2 == 0 && numero > 0) 
				contadorPares++;
		}

		System.out.printf("Quantidade de numeros pares positivos: %d \n", contadorPares);
		
	}

}
