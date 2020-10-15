# Variáveis e Métodos de Instância e de Classes

## Variaveis de instancia

* Instancia é quando criamos um objeto com a variavel. (As variaveis de instancia pertecem ao objeto);
* Posso atribuir valores a variaveis de classes sem que exista objeto algum;
* Toda variavel que não é declarada com a palavra Static é uma variavel de instancia (ou objeto);

## Variaveis de classes 

* Variaveis que ficam junto a classe. (Elas não nascem de objeto, elas pertencem a classe como um todo);
* Toda variavel que é declarada com a palavra Static é uma variavel de classe;

## Métodos de Instância e de Classe

A mesma ideia básica se aplica aos métodos.
Métodos de instância pertencem aos objetos.
Métodos de instância só podem ser executados sobre um objeto, depois que ele for criado.
Métodos estáticos pertencem à classe.
Portanto, métodos estáticos não dependem da existência de um objeto para serem executados.

Para exemplificar uma situação que talvez fizesse sentido usar um método estático vamos usar nossa imaginação :)
Imagine que exista um método que sirva de cardápio.
O método exibirCardápio simplesmente retorna todos os carboidratos, proteínas e bebidas, com seus respectivos valores.
Note que para pedir um cardápio, não precisa existir nenhuma refeição, a princípio.
Mas, de algum modo, exibirCardápio é relacionado a refeições, e por isso, queremos colocar dentro da classe Refeicao.

Nosso código ficaria da seguinte maneira:


```java
class Refeicao{

  	//variáveis estáticas
	static double precoBase;
  
  	//variáveis de instância
  	String nome;
	String carboidrato;
	int gramasCarboidrato;
	String proteina;
	int gramasProteina;
	int tempoCozimento; 
	double precoAdicional; 
	
	public Refeicao(String nome, String carboidrato, int gramasCarboidrato, String proteina, int gramasProteina, int tempoCozimento, double precoAdicional) {
		this.nome = nome;
		this.carboidrato = carboidrato;
		this.gramasCarboidrato = gramasCarboidrato;
		this.proteina = proteina;
		this.gramasProteina = gramasProteina;
		this.tempoCozimento = tempoCozimento;
		this.precoAdicional = precoAdicional;
	}
	
	public static String exibirCardapio(){
		String cardapio = "Carboidratos: \n";
		cardapio += "Inhame - R$5\n";
		cardapio += "Batata doce - R$5\n";
		cardapio += "Feijão - R$7\n";
		cardapio += "Cuscuz - R$4\n";
		cardapio += "\n";
		cardapio += "Proteínas:\n";
		cardapio += "Ovo - R$2\n";
		cardapio += "Bife - R$6\n";
		cardapio += "Maminha - R$7\n";
		cardapio += "Picanha - R$15\n";
		cardapio += "\n";
		cardapio += "Bebidas:\n";
		cardapio += "Refrigerante lata - R$5\n";
		cardapio += "Refrigerante 1l - R$9\n";
		cardapio += "Refrigerante 2l - R$15\n";
		cardapio += "Suco - R$5\n";
		cardapio += "Café - R$2\n";
		cardapio += "Picanha - R$15\n";
		return cardapio;
	}
}

class MainRefeicao{
	public static void main(String [] args){
		Refeicao.precoBase = 10;
		
		System.out.println(Refeicao.exibirCardapio());
		
		Refeicao almoco = new Refeicao("feijão com bife", "feijao", 100, "bife", 80, 30, 2);
		Refeicao jantar = new Refeicao("inhame com ovo", "inhame", 80, "ovo", 40, 15, 0);
	}
}
```

Note que neste exemplo nós conseguimos exibir o cardápio sem ter um objeto da classe Refeicao.
Isto acontece porque o método **exibirCardapio()** é estático, não requerindo a existência de um objeto para ser executado.
O método estático, assim como a variável estática, também pertence à classe, e poderia ser representado da seguinte forma:

![metodos-classe](https://user-images.githubusercontent.com/69598952/96195838-47a27300-0f24-11eb-8b21-dd686b4f216c.png)

É interessante também perceber que não faria muito sentido a função exibirCardapio() ser uma função de instância.
Se assim o fosse, primeiro seria preciso criar um objeto de Refeicao, mas nesse caso o cliente ainda não saberia quais seriam as opções disponíveis.
