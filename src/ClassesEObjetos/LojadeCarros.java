package ClassesEObjetos;
public class LojadeCarros {

	public static void main(String[] args) {
		
		Carro.promocao = false;
		
		Carro c1 = new Carro("Fiat Pálio", "Fiat", 35000);
		Carro c2 = new Carro("Fiat Pálio", "Fiat", "prateada", 2, false, false, false, false,35000);
		Carro c3 = new Carro("Honda Civic", "Honda", "azul", 4, true, true, true, true,110000);
		Carro c4 = new Carro("Corolla", "Toyota", "azul", 4, true, true, false, true,110000);
		Carro c5 = new Carro("Gol", "Volkswagen", "azul", 4, true, true, true, true,55000);
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		System.out.print(c4);
		System.out.print(c5);

		Carro.promocao = true;
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		System.out.print(c4);
		System.out.print(c5);
		
		
	}

}
