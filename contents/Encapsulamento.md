# Encapsulamento

Aprendemos anteriormente a criar Classes, para representar entidades do mundo, e cada classe tem uma série de atributos que representa suas características.
**Encapsulamento** trata de uma ponderação do desenvolvedor sobre quais informações (atributos e métodos) podem/devem ser visíveis à outras classes.
Portanto, podemos resumir que o encapsulamento tem basicamente três objetivos:
1. **Esconder** aspectos de funcionamento de uma classe que, por alguma razão, não precisa ser acessível por outra classe.
2. Criar uma **abstração** que proveja **baixo acoplamento** entre diferentes classes de um programa.
3. **Proteger** o acesso a informações confidenciais e sensíveis.

Algumas afirmações de Grady Booch (1991) que corroboram com os três pontos citados acima:
1. "*Encapsulamento* é o processo de *esconder todos os detalhes* de um objeto *que não contribuem* para suas características essenciais."
2. "*Nenhuma parte* de um sistema complexo *deve depender* dos *detalhes internos* das outras partes."

<p align="center">
  <img width="400" height="275" src="imgs/encapsulamento.png">
</p>

O que nos permite implementar encapsulamento nos programas são os **modificadores de acesso**.
Até este ponto de nossa disciplina, eu evitei focar neste aspecto, e não colocava modificador de acesso nos atributos e métodos.
Isto permitia que outras classes/objetos pudessem alterar os valores de atributos que são considerados críticos.

Observe o exemplo a seguir:

```java
class ContaCorrente {
	double limite;			
	double saldo;	
	int numero;
	String cliente;
	
	ContaCorrente(double limite, int numero, String cliente) {
		if(limite < 0) {
			limite = 0;
		}
		this.limite = limite;
		this.numero = numero;
		this.cliente = cliente;
	}
	
	void depositar(double quantia) {
		saldo += quantia;
	}
	
	void debitar(double quantia) {
		saldo -= quantia;
	}
}
```

Todos os atributos e métodos da classe ContaCorrente estão sem um modificador de acesso explícito.
Apesar da classe ter funções para depositar e debitar, qualquer outra classe poderia modificar o limite e saldo de qualquer conta diretamente, o que é indesejado.

Para tornar este código mais protegido podemos encapsular as informações que são críticas, e permitir seu acesso apenas via funções adequadamente escritas.

Primeiramente, vamos entender como funcionam os modificadores de acesso.

| Modificador  | Descrição |
| ------------------- | ------------------- |
| **public** | acesso global, a partir de qualquer outra classe |
| **protected** | acesso permitido à todas as classes do mesmo pacote, e às suas sub-classes (herança) |
| sem modificador explícito (default ou package-private) | acesso permitido à todas as classes do mesmo pacote |
| **private** | acesso restrito aos membros da classe |

Sabendo disto, poderíamos melhorar o encapsulamento do exemplo anterior tornando os atributos privados.
Mas note que criar funções públicas para acesso (*getter*) e modificação (*setter*) não deve ser praticado de forma indiscriminada para todo tipo de variável.
Por exemplo, não faz sentido ter um getter para um atributo *senha* e um setter para um atributo *saldo*, pois isto exporia de forma crítica valores que devem permanecer oculto (senha), ou criaria uma vulnerabilidade (permitindo mudar o saldo de contas corrente).

```java
class ContaCorrente {
	
	private double limite;			
	private double saldo;	
	private int numero;
	private String cliente;
	
	public ContaCorrente(double limite, int numero, String cliente) {
		if(limite < 0) {
			limite = 0;
		}
		this.limite = limite;
		this.numero = numero;
		this.cliente = cliente;
	}
	
	public void depositar(double quantia) {
		saldo += quantia;
	}
	
	public void debitar(double quantia) {
		saldo -= quantia;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public String getCliente(){
		return this.cliente;
	}
}
```

Embora no exemplo anterior consigamos melhorar o nível de encapsulamento, a função *debitar* contém vulnerabilidades.
O encapsulamento não está perfeito.
O que aconteceria se alguém tentasse debitar uma quantia superior ao saldo?
O que aconteceria se alguém tentasse debitar um valor negativo?

```java
public class ContaCorrente {
	
	private double limite;
	private double saldo;	
	private int numero;
	private String cliente;
	
	public ContaCorrente(double limite, int numero, String cliente) {
		if(limite < 0) {
			limite = 0;
		}
		this.limite = limite;
		this.numero = numero;
		this.cliente = cliente;
	}
	
	public void depositar(double quantia) {
		saldo += quantia;
	}
	
	public double debitar(double quantia) {
		if(verificaRetirada(quantia)) {
			saldo -= quantia;
			return quantia;
		} else {
			return 0;
		}		
	}
	
	public boolean transferir(double quantia, ContaCorrente conta2) {
		//se eh possivel sacar dessa conta, então
		//eh possivel transferir
		double valor = debitar(quantia);
		if(valor>0) {
			conta2.depositar(valor);
			return true;
		}
		
		return false;		
	}
	
	private boolean verificaRetirada(double quantia) {
		if(quantia > 0 && quantia <= (saldo + limite)) 
			return true;
		else
			return false;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
```

No código anterior, ajustamos o funcionamento da função debitar.
Para isto, criamos uma função adicional chamada *verificaRetirada*.
A função *verificaRetirada* basicamente avalia se é possível retirar uma determinada quantia de uma Conta, independente da finalidade (transferir ou sacar).
Note que a função *verificaRetirada* é privada, pois não faz sentido que outras classes/objetos utilizem esta função.
Neste caso, estamos observando o fundamento 1, explicado no início desta página: "1. **Esconder** aspectos de funcionamento de uma classe que, por alguma razão, não precisa ser acessível por outra classe."

E é isto.
Encapsulamento é um conceito fundamental na criação de programas com o paradigma de Orientação a Objetos.
Vai além de simplesmente "tornar atributos privados e criar funções públicas setters e getters".
Se trata de omitir o que deve ser omitido, tornar público o que precisa ser acessado por outras entidades, e com isto, criar uma abstração que diminua o acoplamento entre as classes.

---
