# Listas

Listas têm a mesma finalidade de arrays: armazenar elementos de um mesmo tipo.
No entanto, um aspecto interessante é que listas podem mudar de tamanho.
Elas podem crescer seus tamanhos de acordo com nossa conveniência.
Enquanto arrays jamais podem crescer ou diminuir em sua capacidade, as listas fazem isso de forma transparente.
Uma característica comum é que listas e arrays só armazenam um tipo de objeto por vez.

## Principais Métodos

Vamos ver os principais métodos de listas no exemplo a seguir:

```java
	List<String> nomes = new ArrayList<String>();
		
	nomes.add("Eduardo");	//adiciona objeto String com conteúdo "Eduardo"
	nomes.add("Mariana");
	nomes.add("Joao");
		
	System.out.println("Nomes: "+nomes);	//toString
	System.out.println("Tamanho da lista de nomes: "+nomes.size());	
	System.out.println("A lista nomes contém a String \"Eduardo\"? "+nomes.contains("Eduardo"));
	System.out.println("Em que posição se encontra a String \"Eduardo\"? "+nomes.indexOf("Eduardo"));
	System.out.println("Qual objeto está na posição 2 da lista? "+nomes.get(2));
		
	//remove é um método sobrecarregado
	nomes.remove(0);		//remove objeto no índice 0
	nomes.remove("Joao");	//remove objeto String com conteúdo João				
	System.out.println("Nomes: "+nomes+"\n\n");
		
	//for each
	for(String nome : nomes) {
		System.out.println("Nome: "+nome);
	}
		
	nomes.clear();			//remove todos os objetos da lista 		
	System.out.println("Nomes: "+nomes);
```

Na primeira linha, vemos que para criar uma lista, precisamos definir o tipo de objeto que poderá entrar nela.
Neste caso, *nomes* representa uma lista de Strings, e apenas Strings podem ser inseridas nesta lista.
Em seguida, usamos uma série de métodos na lista.

Os principais métodos são:
- add(Object o): permite adicionar um objeto ao fim da lista
- size(): retorna o tamanho da lista
- contains(Object o): verifica se a lista contém o objeto especificado
- indexOf(Object o): retorna o índice do objeto especificado
- get(int index): retorna o objeto no índice especificado
- remove(int index): remove o objeto no índice especificado
- remove(Object o): remove o objeto especificado (usando a função equals do objeto em questão)
- clear(): remove todos os objetos da lista

## Listas só Armazenam Objetos

O segundo aspecto das listas é que elas não armazenam tipos primitivos.
Listas só guardam objetos.
Mas isso não é um problema, pois todos os tipos primitivos básicos podem ser instanciados na forma de objeto.
É o que chamamos de *wrappers* (podemos traduzir para *empacotadores*).

Segue exemplo com *wrappers* (classes):
```java
Boolean b = new Boolean(true);
Character c = new Character('c');
Byte by = new Byte((byte) 10);
Short sh = new Short((short) 10);
Integer i = new Integer(10);
Long l = new Long(10l);
Float f = new Float(10.0f);
Double d = new Double(10.0);
```

Todas as variáveis acima apontam para objetos que servem como uma espécie de invólucro para os primitivos.
Ou seja, é uma alternativa para que um valor de tipo primitivo apareça na forma de objeto.

Note que tipos primitivos são mais rápidos e consomem menos memória, afinal não tem implementação de métodos ou qualquer outro algoritmo complexo que venha a consumir mais tempo da JVM.
Porém, em algumas situações, como por exemplo na utilização de listas, usar tipos primitivos não é possível.

Apesar do código citado anteriormente funcionar, a utilização de construtores para criar os *wrappers* não é recomendada: está depreciada.
A solução é o que chamamos de **boxing**.

## Autoboxing e Unboxing

**Boxing** significa encaixotar, ou envolver.
Quando fazemos um boxing? Quando pegamos um tipo primitivo e o envolvemos dentro de um *wrapper*.
Em algumas situações isso é feito de forma automática, daí o nome **autoboxing**.

Veja o exemplo a seguir:
```java
	List<Integer> numerosPares = new ArrayList<Integer>();	//uma lista de objetos Integer
	
	for(int i = 0; i <= 1000; i++){
		if(i%2 == 0){
			numerosPares.add(i);
		}
	}
```

No exemplo anterior, instanciamos uma lista de Integer para guardar números pares.
Uma vez que não é possível instanciar uma lista de inteiros, instanciamos uma lista de Integer, que é o wrapper do inteiro.
Note que, *embora a lista não seja do tipo primitivo int*, são adicionados valores inteiros à lista.
É aí que acontece o **autoboxing**, ou seja, a conversão automática de **int** para **Integer**, visto que não é possível adicionar int em listas.

Autoboxing é aplicado pelo compilador do Java nas seguintes condições:
1. Quando um valor primitivo é passado como um parâmetro para um método que espera um objeto. (o caso do exemplo anterior)
2. Quando um valor primitivo é atribuído a um wrapper. (o caso exibido a seguir)

```java
	Integer um = 1;		//é mais recomendado em comparação a usar o construtor
	Long dois = 2l;		
	Float tres = 3.0f;
	Double quatro = 3.0;
	Boolean ligado = true;
```

O **unboxing** representa o processo inverso.
Quando fazemos um unboxing? Quando pegamos um objeto wrapper e atribuímos a uma variável de tipo primitivo.

Vejam o exemplo a seguir:

```java
	List<Integer> divisoresDez = new ArrayList<Integer>();	
	divisoresDez.add(1);	//autoboxing
	divisoresDez.add(2);	//autoboxing
	divisoresDez.add(5);	//autoboxing
	divisoresDez.add(10);	//autoboxing
	
	for(int i : divisoresDez){	//unboxing: acontece uma atribuição de Integer para int
		System.out.println(i);
	}
	
	//outra forma
	int dois = divisoresDez.get(1);	//unboxing: acontece uma atribuição de Integer para int
```

## Performance: ArrayList e LinkedList

Podemos usar dois tipos de lista: o **ArrayList** e a **LinkedList**.

Ex: ArrayList

```java
	List<Integer> pares = new ArrayList<Integer>();	
	pares.add(2);
	pares.add(4);
	pares.add(8);
	pares.add(10);
	pares.add(12);
	pares.add(14);
	pares.add(16);
	pares.add(18);
	pares.add(20);
```

Ex: LinkedList

```java
	List<Integer> pares = new LinkedList<Integer>();	
	pares.add(2);
	pares.add(4);
	pares.add(8);
	pares.add(10);
	pares.add(12);
	pares.add(14);
	pares.add(16);
	pares.add(18);
	pares.add(20);
```


O ArrayList é implementado com arrays para armazenar os objetos.
O LinkedList usa uma lista ligada, ou seja, objetos apontando para outros objetos.

 ![alt text](Imagens/listas1.png)
 
 Inicialmente, o array do ArrayList tem capacidade 10.
 Se inicializarmos *pares*, a princípio ele terá 10 espaços para int, espaços estes não utilizados (na cor vermelho).
 
 ![alt text](Imagens/listas2.png)
 
 Na medida em que adicionarmos elementos, estes elementos são adicionados ao fim da lista.
 
 ![alt text](Imagens/listas3.png)
 
 Lembram que arrays não mudam de tamanho?
 Se em algum momento, adicionarmos mais elementos, o ArrayList aumentará pela metade (em vez de lançar Exceção).
 
 Por ArrayLists se utilizarem de array, eles alocam blocos contíguos de memória.
 Por um lado, isso traz uma eficiência no acesso e mudança de valores dos elementos do array.
 Por outro, pode causar desperdício de memória.
 
 LinkedList, por outro lado, usam listas ligadas.
 Listas ligadas não armazenam blocos contíguos de memórias, como arrays.
 
 Observem:
 
 ![alt text](Imagens/ligada1.png)
 
 A princípio, apenas 8 bytes são utilizados: 4 bytes para armazenar o int, e 4 bytes para armazenar o endereço do próximo nó (elemento), quando for adicionado.
 
 ![alt text](Imagens/ligada2.png)
 
 Note que existe um trade-off.
 Listas ligadas nunca terão memória ociosa.
 Em uma situação em que tenhamos uma LinkedList e um ArrayList ambos com capacidade *n* e totalmente preenchidas, a lista ligada ocupará o dobro de espaço de memória do ArrayList.
 Em contrapartida, há situações em que a LinkedList pode economizar mais memória do que o ArrayList.
 Para finalizar, vale salientar que por ArrayLists serem implementados com arrays, eles se valem dos benefícios dos arrays: conseguem chegar ao elemento desejado de forma instantânea, enquanto que no LinkedList é preciso percorrer toda a lista para chegar a um elemento específico.
 
 
