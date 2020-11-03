package ClassesEObjetos;

public class Carro {
	
	static boolean promocao;
	
	String nome;
	String marca;
	String cor;
	
	int portas;
	double precoBase;
	
	boolean vidroEletrico;
	boolean arCondicionado;
	boolean cambioAutomatico;
	boolean direcaoEletrica;
	
	public Carro() {}
		
	public Carro(String nome, String marca, double precoBase) {
		
		this.nome = nome;
		this.marca = marca;
		this.cor = "branca";
		this.portas = 2;
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
		this.precoBase = precoBase;
		
	}
	
	public Carro(String nome, String marca, String cor, int portas, boolean vidroEletrico, boolean arCondicionado, boolean cambioAutomatico, boolean direcaoEletrica, double precoBase) {
		
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
		
	}
	double calculaPreco() {
		
		double preco = 0;
		preco += precoBase;
		
			switch (cor) {
		
		case "branca":
			preco += 0.00;
			break;
		case "azul":
			preco += 0.00;
			break;
		case "vermelho":
			preco += 0.00;
			break;
		case "preto":
			preco += 0.00;
			break;
		default:
			preco += 1000.00;
				
		}
			
		if (this.vidroEletrico == true) 
			preco += 1250.00;
		
		if (this.arCondicionado == true) 
			preco += 1250.00;
		
		if (this.cambioAutomatico == true) 
			preco += 1250.00;
		
		if (this.direcaoEletrica == true) 
			preco += 1250.00;
		
		
		if (Carro.promocao) 
			preco = 0.9 * preco;
			
		
		return preco;
	}
	
	public String toString() {
		String desc = "";
		desc += "Nome: " + nome + ", marca: " + marca + ", cor: " + cor + "\n";
		desc += "Portas: " + portas + "\n";
		desc += "Vidro eletrico: " + (vidroEletrico? "X":"") + ", Ar condicionado: " + (arCondicionado? "X":"") +"\n";
		desc += "Cambio automatico: " + (cambioAutomatico? "X":"") + ", Direcao eletrica: " + (direcaoEletrica? "X":"") +"\n";
		desc += "Preço: " + calculaPreco() + ", Promoção: "+ (promocao?"X":"") +"\n";
		return desc;
	}
	
}



