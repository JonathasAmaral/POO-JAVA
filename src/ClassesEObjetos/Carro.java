package ClassesEObjetos;

public class Carro {
	
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
	void calculaPreco() {
		
		double preco = 0;
		
		if (vidroEletrico == true) {
			preco += 1250.00;
		}
		if (arCondicionado == true) {
			preco += 1250.00;
		}
		if (cambioAutomatico == true) {
			preco += 1250.00;
		}
		if (direcaoEletrica == true) {
			preco += 1250.00;
		}
		
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
		precoBase += preco;	
		System.out.printf("O Valor total é = %.2f \n",precoBase);
		System.out.println("_______________________________________________________________");
	}
	
	void imprimir() {
		
		System.out.printf("Nome do carro = %s \n",this.nome);
		System.out.printf("Marca do carro = %s \n",this.marca);
		System.out.printf("Cor do carro = %s \n",this.cor);
		
		System.out.printf("O carro possui %d portas\n",this.portas);
		System.out.printf("O carro possui vidor eletrico = %s \n",this.vidroEletrico);
		System.out.printf("O carro possui ar condicionado = %s \n",this.arCondicionado);
		System.out.printf("O carro possui cambio automatico = %s \n",this.cambioAutomatico);
		System.out.printf("O carrp possui direção eletrica = %s \n",this.direcaoEletrica);
		
	}
	
}



