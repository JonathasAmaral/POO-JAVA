# Classes e Objetos

Classes definem a especificação de entidades, trazendo consigo uma série de atributos e comportamentos (funções).
Objetos são criados a partir de classes, e quando criados tipicamente assumem diferentes valores para atributos, e podem executar as funções.

Analogia:
 - Planta baixa seria uma **classe**, e a casa seria o **objeto**. Note que várias casas (objetos) com detalhes (valores de atributos) diferentes podem ser construídas a partir de uma planta baixa (classe).
 - Uma refeição pode ser representada em uma **classe**, e o almoço/jantar feito pronto seria o **objeto**. Note que várias almoços/jantares (objetos) com detalhes (valores de atributos) diferentes podem ser construídos a partir de uma especificação de refeição alterando alguns detalhes.
 
```java
class Refeicao{
	String nome;
	String carboidrato;
	int gramasCarboidrato;
	String proteina;
	int gramasproteina;
	int tempoCozimento; 
	double preco;  
}

class MainRefeicao{
	public static void main(String [] args){
		Refeicao almoco = new Refeicao();
		almoco.nome = "feijão com bife";
		almoco.carboidrato = "feijao";
		almoco.gramasCarboidrato = 100;
		almoco.proteina = "bife";
		almoco.gramasProteina = 80;
		almoco.tempoCozimento = 30;    
		almoco.preco = 10;
	}
}
```
A palavra chave **new** permite a criação de novos objetos. 
No main, criamos um objeto de Refeição, que basicamente é um almoço. 
Poderíamos criar vários objetos almoços, iguais ou diferentes (em termos de comida), bem como também poderíamos criar outros tipos de refeição como jantar e café da manhã.

Quando acionamos **new Refeicao()**, estamos chamando o contrutor da classe Refeicao. 
Contrutores são métodos que permitem a criação de objetos, e são acionado pela palavra reservada **new**.
Embora a classe Refeicao não apresente um contrutor de forma explícita, a JVM injeta o construtor padrão (ou default).
Construtores padrões não têm argumento.
De forma resumida, para a JVM, a classe Refeicao aparece da seguinte forma:

```java
class Refeicao{
	String nome;
	String carboidrato;
	int gramasCarboidrato;
	String proteina;
	int gramasproteina;
	int tempoCozimento; 
	double preco;  
  
  	public Refeicao(){}
}
```

Se for do interesse, é possível criar construtores com argumentos, como a seguir:
```java
class Refeicao{
	String nome;
	String carboidrato;
	int gramasCarboidrato;
	String proteina;
	int gramasProteina;
	int tempoCozimento; 
	double preco; 
	
	public Refeicao(String nome, String carboidrato, int gramasCarboidrato, String proteina, int gramasProteina, int tempoCozimento, double preco) {
		this.nome = nome;
		this.carboidrato = carboidrato;
		this.gramasCarboidrato = gramasCarboidrato;
		this.proteina = proteina;
		this.gramasProteina = gramasProteina;
		this.tempoCozimento = tempoCozimento;
		this.preco = preco;
	}
}

class MainRefeicao{
	public static void main(String [] args){
		Refeicao almoco = new Refeicao("feijão com bife", "feijao", 100, "bife", 80, 30, 10);
		Refeicao jantar = new Refeicao("inhame com ovo", "inhame", 80, "ovo", 40, 15, 7);
	}
}
```

Esse construtor permitiria instanciar uma Refeicao com valores passados via argumentos. 
Construtores com argumentos podem ter diferentes quantidade de argumentos -- não há uma regra específica.
Quando o nome de um argumento é igual ao nome de uma variável da instância (var global), o uso do **this** se faz necessário para remover a ambiguidade.
Nesse caso, o this se refere à variável global da instância. 
No entanto, se o nome de um argumento não é igual ao nome de uma variável da instância, o *this* não é mandatório (embora seja uma boa prática).
**Importante:** Quando um construtor com argumentos é adicionado, o construtor default deixa de existir.

Também é possível criar vários construtores, se assim for desejado.
O nome disto é **sobrecarga**.
No exemplo anterior poderíamos criar um construtor adicional que cria a refeição apenas com nomes da proteína e carboidrato.
Em seguida, os demais valores poderiam ser atribuídos diretamentes, pois nesse exemplo os atributos são acessíveis (modificador default).
O que diferencia qual construtor será chamado é a quantidade, ordem, e tipo dos parâmetros no momento de instanciação do objeto.

```java
class Refeicao{
	String nome;
	String carboidrato;
	int gramasCarboidrato;
	String proteina;
	int gramasProteina;
	int tempoCozimento; 
	double preco; 
	
  	public Refeicao(){ }
  
  	public Refeicao(String nome, String carboidrato, int gramasCarboidrato, String proteina, int gramasProteina, int tempoCozimento, double preco){
		this.nome = nome;
    		this.carboidrato = carboidrato;
		this.gramasCarboidrato = gramasCarboidrato;
		this.proteina = proteina;
		this.gramasProteina = gramasProteina;
		this.tempoCozimento = tempoCozimento;
		this.preco = preco;
	}
  
  	public Refeicao(String carboidrato, String proteina){
		this.carboidrato = carboidrato;
		this.proteina = proteina;
		this.nome = carboidrato + " com " + proteina;
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
  	}
}
```

Também é interessante ressaltar que um construtor pode se utilizar do código de outro construtor, para evitar duplicação de código.
Tomando como exemplo o construtor que recebe dois argumentos, um carboidrato e uma proteína, poderia ser interessante que ele inicializasse as demais variáveis com valores padrão, para isso utilizando outro construtor já existente.
Por exemplo, poderia ser de nosso interesse que toda vez que um cliente falasse o nome do carboidrato e da proteina, sem especificar pesos de cada, atribuíssemos 100g para o carboidrato, 150g para a proteína, um tempo de cozimento de 15 minutos, e um valor base de 15 reais.
Vejam o exemplo abaixo:


```java
class Refeicao{
	String nome;
	String carboidrato;
	int gramasCarboidrato;
	String proteina;
	int gramasProteina;
	int tempoCozimento; 
	double preco; 
  
  	public Refeicao(){ }
  
  	public Refeicao(String nome, String carboidrato, int gramasCarboidrato, String proteina, int gramasProteina, int tempoCozimento, double preco){
		this.nome = nome;
		this.carboidrato = carboidrato;
		this.gramasCarboidrato = gramasCarboidrato;
		this.proteina = proteina;
		this.gramasProteina = gramasProteina;
		this.tempoCozimento = tempoCozimento;
		this.preco = preco;
	}
  
  	public Refeicao(String carboidrato, String proteina){
		this(carboidrato+" com "+proteina, carboidrato, 100, proteina, 150, 15, 15);
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
	}
}
```

Por fim, para concluirmos nosso exemplo, é interessante que criemos uma função toString.
Uma função toString tem como objetivo retornar uma representação textual do objeto.
Em outras palavras, no toString você retornará os valores de variáveis, para que você possa ver, por exemplo, no terminal.
Sempre que chamamos a função **System.out.println()**, com uma variável de referência a um objeto qualquer, a JVM executa a função toString() daquele objeto.

Vejam o exemplo a seguir:


```java
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
```
---

[Programas utilizando POO.](../src/advanced/)

---

Dessa forma, com classes (com atributos, funções e construtores) e objetos é possível criar programas que representem o mundo real.
Essa organização de entidades em classes e respectivos objetos é o que rege o paradigma de programação orientada a objetos.
