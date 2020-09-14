class Refeicao{

	// variáveis de instância (objeto)
	String nome;
	String carboidrato;
	int gramasCarboidrato;
	String proteina;
	int gramasProteina;
	int tempoCozimento;
	double preco;

	// construtor default
	public Refeicao() { }

	// construtor com argumentos
	public Refeicao(String nome, String carboidrato, int gramasCarboidrato, String proteina, int gramasProteina, int tempoCozimento, double preco) {
		this.nome = nome;
		this.carboidrato = carboidrato;
		this.gramasCarboidrato = gramasCarboidrato;
		this.proteina = proteina;
		this.gramasProteina = gramasProteina;
		this.tempoCozimento = tempoCozimento;
		this.preco = preco;
	}

	// contrutor com 2 strings como argumento
	public Refeicao(String carboidrato, String proteina) {
		this(carboidrato + " com " + proteina, carboidrato, 100, proteina, 100, 10, 10);
	}

	// função para retornar os valores dos atributos em forma de string
	public String toString() {
		String output = "";
		output += "Nome: " + this.nome + "\n";
		output += "Carboidrato: " + this.carboidrato + "\n";
		output += "Gramas carboidrato: " + this.gramasCarboidrato + "\n";
		output += "Proteina: " + this.proteina + "\n";
		output += "Gramas proteina: " + this.gramasProteina + "\n";
		output += "Tempo de cozimento: " + this.tempoCozimento + "\n";
		output += "Preço: " + this.preco + "\n";
		return output;
	}
}

class MainRefeicao{
	public static void main(String [] args){
		Refeicao almoco1 = new Refeicao();
		almoco1.nome = "feijão com bife";
		almoco1.carboidrato = "feijao";
		almoco1.gramasCarboidrato = 100;
		almoco1.proteina = "bife";
		almoco1.gramasProteina = 80;
		almoco1.tempoCozimento = 30;
		almoco1.preco = 10;

    		Refeicao almoco2 = new Refeicao("feijão com bife", "feijao", 100, "bife", 80, 30, 10);
		Refeicao jantar = new Refeicao("inhame com ovo", "inhame", 80, "ovo", 40, 15, 7);
		Refeicao cafeDaManha = new Refeicao("batata doce", "ovo");
    
    		System.out.println(almoco1);
		System.out.println(almoco2);
		System.out.println(jantar);
		System.out.println(cafeDaManha);
	}
}