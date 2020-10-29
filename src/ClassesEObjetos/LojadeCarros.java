package advanced;
public class LojadeCarros {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("Fiat Pálio", "Fiat", 35000);
		c1.imprimir();
		c1.calculaPreco();
		Carro c2 = new Carro("Fiat Pálio", "Fiat", "prateada", 2, false, false, false, false,35000);
		c2.imprimir();
		c2.calculaPreco();
		Carro c3 = new Carro("Honda Civic", "Honda", "azul", 4, true, true, true, true,110000);
		c3.imprimir();
		c3.calculaPreco();
		Carro c4 = new Carro("Corolla", "Toyota", "azul", 4, true, true, false, true,110000);
		c4.imprimir();
		c4.calculaPreco();
		Carro c5 = new Carro("Gol", "Volkswagen", "azul", 4, true, true, true, true,55000);
		c5.imprimir();
		c5.calculaPreco();

	}

}
