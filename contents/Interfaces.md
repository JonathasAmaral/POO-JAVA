# Interfaces

## Coesão e Acoplamento

Para entender a importância das Interfaces, primeiro precisamos entender o que é **coesão e acoplamento**.

**Coesão** é o grau em que uma classe tem um único e bem focado propósito.
Classes coesas geralmente são enxutas e legíveis.
Uma  consequência disso são classes com poucas funções, e funções fáceis de serem compreendidas.

**Acoplamento** é o grau com que uma classe conhece a outra.
Isso gera dependência, o que é ruim, pois quando uma classe precisa ser alterada isso gera um efeito cascata de alteração de código nas classes dependentes.
Duas formas comuuns de acoplamentos são a *composição* e a *herança*.

Um dos mantras do desenvolvimento OO é prezar pela **alta coessão e baixo acoplamento**

Note, no entanto, que os sistemas, especialmente aqueles escritos em uma linguagem OO, precisam de relacionamentos.
Os relacionamentos são a base da programação OO, pois os objetos de um programa têm o mesmo comportamento do mundo real: os objetos se relacionam e interagem, provocando mudança de estado no mundo (outros objetos).

Portanto, se os relacionamentos são inevitáveis, o que precisamos buscar é relacionamentos menos suscetíveis a mudanças.
**Relacionamentos estáveis e duradouros**.
E uma das formas de se fazer isto é usando **Interfaces**.

## Interfaces

**Interface** é como uma espécie de *contrato*.
Elas **definem quais funções/métodos** devem ser implementadas, **mas não especificam como** devem ser implementadas.

As interfaces, assim como os contratos, precisam ser minuciosamente pensadas e escritas.
Isto é verdade pois contratos geram fortes vínculos, são difíceis de mudar ou de serem quebrados (pelo menos em teoria).

Vamos examinar uma interface que vocês certamente já usaram até aqui, a [interface List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html).
Aqui estão algumas das funções definidas no contrato de *List*:
- boolean	add(E e): appends the specified element to the end of this list.
- void	add(int index, E element): inserts the specified element at the specified position in this list.
- void	clear(): removes all of the elements from this list.
- boolean	contains(Object o): returns true if this list contains the specified element.
- boolean	equals(Object o): compares the specified object with this list for equality.
- E	get(int index): returns the element at the specified position in this list.
- int	indexOf(Object o): returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
- boolean	isEmpty(): returns true if this list contains no elements.
- int	lastIndexOf(Object o): returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
- E	remove(int index): removes the element at the specified position in this list.
- boolean	remove(Object o): removes the first occurrence of the specified element from this list, if it is present.
- E	set(int index, E element): replaces the element at the specified position in this list with the specified element.
- int	size(): returns the number of elements in this list.

Portanto, o código da interface List é mais ou menos assim:

```java
interface List<E>{
  boolean add(E e);
  void add(int index, E element);
  void clear();
  boolean contains(Object o);
  boolean equals(Object o);
  E get(int index);
  int indexOf(Object o);
  boolean isEmpty();
  int lastIndexOf(Object o);
  E remove(int index);
  boolean remove(Object o);
  E set(int index, E element);
  int size();
  //outra funçes
}
```

Note que para definir uma interface, basta mudar o **class** por **interface**, e criar as funções sem o corpo do código.
Além disso, interfaces só podem ter variáveis constantes (modificador **final**), ou seja, variáveis com valores defininidos que nunca mudam.

As classes que implementam as interfaces são ditas classes que assinaram o contrato.
As classes que assinam o contrato devem implementar todos os métodos do contrato, senão estariam quebrando o contrato, e assim o programa não compilaria.

<p align="center">
  <img src="https://github.com/eduardolfalcao/P2-Unifacisa/blob/master/conteudo/imgs/list-interface.png"/ width="750" height="250">
</p>

No exemplo de List, todas as implementações (que também podem ser chamadas de subclasses) proveem uma implementação de todos os métodos do contrato: *add, clear, contains, equals, get, indexOf, isEmpty, lastIndexOf, remove, set, e size*.
Já havíamos comentado na [aula sobre Lists](Listas.md#performance-arraylist-e-linkedlist) que o ArrayList e o LinkedList fazem as mesmas tarefas, mas de formas diferentes: o ArrayList usa um array por debaixo dos panos, e o LinkedList usa uma série de objetos encadeados, o que chamamos de lista encadeada.

O que é interessante aqui é perceber que a Interface List existe desde os primórdios de Java (25 anos?).
Imagina o que aconteceria se esquecessem de criar o método **remove**?
Teríamos listas que apenas cresceriam...
Mas isso não aconteceu, pois a criação da Interface List envolveu uma reflexão conjunta (diversos engenheiros de software) de todas as funções que seriam necessárias para Listas.
De lá pra cá, essa interface nunca mudou. 
De outro modo, se houvesse uma mudança, os milhares de programa iriam parar de compilar, pois não estariam respeitando a interface.

É por este motivo, **o fato de interfaces serem entidades estáveis, que mudam pouco, ou não mudam,** que quando classes se relacionam com interfaces, as classes tem um acoplamento (pois é uma relação), mas esse **acoplamento com uma interface é considerado baixo**.


## Interfaces e a "Herança múltipla" em Java

No exercício de Polimorfismo, implementamos uma versão simplificada do MortalKombat.
Ficamos com o seguinte diagrama de classes:

<p align="center">
  <img src="https://github.com/eduardolfalcao/P2-Unifacisa/blob/master/conteudo/imgs/mk2.png"/ width="650" height="550">
</p>

Uma coisa que alguém pode ter achado estranho, a princípio, é que todo lutador atira e lança magia.
Socar e chutar é algo comum, mas não tenho certeza que todo lutador tem uma magia.

Uma boa solução seria criar interfaces para esses comportamentos que são mais específicos.
Desse modo, cada lutador poderia implementar cada interface, mas somente se ele de fato tiver aquela habilidade.

<p align="center">
  <img src="https://github.com/eduardolfalcao/P2-Unifacisa/blob/master/conteudo/imgs/mk2-interface.png"/ width="750" height="650">
</p>

Nesse caso, poderíamos ter uma classe implementando duas interfaces:

```java
class NightWolf extends Lutador implements Atirador, Bruxo{
    //implementações da função atirar e lancar magia
}
```

## Polimorfismo com Interfaces

Antes de conhecermos interfaces, achávamos que polimorfismo só era possível com herança e sobrescrita.
Na verdade, o requisito indispensável do polimorfismo é a sobrescrita.
Quando estamos implementando interfaces, na verdade estamos temos que implementar as funções definidas na interface.
Portanto, de algum modo, estamos reescrevendo a função (mesmo que antes ela não tivesse uma implementação).

Aqui vai um exemplo de polimorfismo:

```java
class MortalKombatWitcher{
    //construtor
    public void atacar(Bruxo b1, Bruxo b2){
      b1.lancarMagia(b2);
    }
}
```

Na classe acima, um MortalKombat só de bruxos, eu tenho certeza que b1 sabe lançar magia, pois ele é um bruxo.
No entanto, não sei a princípio quanto de dando esse golpe irá desferir, pois eu não sei qual é o Bruxo exato que estará lançando magia.
Poderia ser SubZero, Rayden, LiuKan, ou até mesmo o NightWolf.
É possível descobrir o tipo específico do objeto com **instanceof**, assim como fizemos anteriormente com herança.

## Interfaces podem Herdar outras Interfaces

Para promover um melhor reuso e facilitar até mesmo a aplicação do polimorfismo, interfaces podem herdar outras interfaces.
Quando uma **interface A** herda uma **interface B**, o que acontece é que todas as funções existentes (mas não implementadas) em B passam a coexistir em A.
É comum dizer que A herda as responsabilidades (funções) de B.
Neste caso, uma classe qualquer que implementar a interface A deve fornecer implementações para os métodos definidos na interface A e na interface B.

Um exemplo disso é a interface List.
List herda da interface Collection.

```java
public interface Collection<E>{
  int size();
  boolean isEmpty();
  boolean contains(Object o);
  boolean add(E e);
  boolean remove(Object o);
  void clear();
  boolean equals(Object o);
  //outras funções
}

interface List<E> extends Collection<E>{
  void add(int index, E element);
  E get(int index);
  int indexOf(Object o);
  int lastIndexOf(Object o);
  E remove(int index);
  E set(int index, E element);
  //outra funçes
}
```

Note que as funções que já existiam em Collection são herdadas por List, mas não precisam aparecer de forma explícita na interface List.

## Alguns fatos sobre Interfaces

1. **Nós jamais conseguiremos instanciar uma Interface**. As interfaces não contém código funcional, portanto, não sabem executar funções, que é o principal objetivo de objetos.
2. Todos os métodos de uma interface são, por padrão, **abstract** (não tem corpo de função) e **public**.
3. Variáveis de interfaces são por padrão **public**, **static** e **final**, ou seja, são constantes.

## Herança causa maior Acoplamento do que Interfaces 

Com a herança nós herdamos código, e isto aumenta o acoplamento do nosso projeto.

Com interfaces nós herdamos *responsabilidades* – as implementações dos métodos.
Isto não gera tanto acoplamento quanto um código concreto. 
Isto gera facilidade de manutenção porque as subclasses concretas da interface implementarão todos os métodos do contrato, e com isso nós podemos usar o polimorfismo a vontade.

LEMBRE-SE: para isso, é importante que nós programemos para a superclasse (interface), assim podemos adicionar novas subclasses sem precisar mudar códigos de outras classes (isto é fraco acoplamento!).
