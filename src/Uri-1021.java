import java.util.Locale;
import java.util.Scanner;


public class Uri1021 {
	
	public static void main(String [] args) { 
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double valor = input.nextDouble();
		int valorInt = 0;
		
		System.out.println("NOTAS:");
		valorInt = (int) valor / 100;
		System.out.printf("%d nota(s) de R$ 100.00%n", valorInt);
		valor = valor % 100;
		
		valorInt = (int) valor / 50;
		System.out.printf("%d nota(s) de R$ 50.00%n", valorInt);
		valor = valor % 50;
		
		valorInt = (int) valor / 20;
		System.out.printf("%d nota(s) de R$ 20.00%n", valorInt);
		valor = valor % 20;
		
		valorInt = (int) valor / 10;
		System.out.printf("%d nota(s) de R$ 10.00%n", valorInt);
		valor = valor % 10;
		
		valorInt = (int) valor / 5;
		System.out.printf("%d nota(s) de R$ 5.00%n", valorInt);
		valor = valor % 5;
		
		valorInt = (int) valor / 2;
		System.out.printf("%d nota(s) de R$ 2.00%n", valorInt);
		valor = valor % 2;
		
		valor = valor * 100;
		System.out.println("MOEDAS:");
		
		valorInt = (int) valor / 100;
		System.out.printf("%d moeda(s) de R$ 1.00%n", valorInt);
		valor = valor % 100;
		
		valorInt = (int) valor / 50;
		System.out.printf("%d moeda(s) de R$ 0.50%n", valorInt);
		valor = valor % 50;
		
		valorInt = (int) valor / 25;
		System.out.printf("%d moeda(s) de R$ 0.25%n", valorInt);
		valor = valor % 25;
		
		valorInt = (int) valor / 10;
		System.out.printf("%d moeda(s) de R$ 0.10%n", valorInt);
		valor = valor % 10;
		
		valorInt = (int) valor / 5;
		System.out.printf("%d moeda(s) de R$ 0.05%n", valorInt);
		valor = valor % 5;
		
		valorInt = (int) valor / 1;
		System.out.printf("%d moeda(s) de R$ 0.01%n", valorInt);
		
		input.close();

	}
} 