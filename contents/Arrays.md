# Arrays

Arrays (ou arranjos/matrizes, em português) servem para armazenar um conjunto de valores.
Esses valores podem ser de tipos primitivos (int, long, float, double, boolean) bem como de tipos não-primitivos, que são as classes.

Para declarar arrays, usamos colchetes:

```java
  int [] notasProva1; //um array de inteiros
  String [] alunos;   //um array de Strings
 ```
 
 No exemplo acima o array foi apenas declarado, mas ainda não foi criado.
 Podemos criar os arrays sem conteúdo, mas definindo o tamanho do array.
 E também podemos criá-los com conteúdo.
 
 Observem o exemplo a seguir.
 
 ```java
    int[] notasProva1 = new int [6]; 
    String[] alunos = new String[] {"Joao", "Joana", "Andre", "Gustavo", "Mariana", "Aline"};
 ```
 
 Neste exemplo, o array *notasProva1* foi criado com tamanho 6.
 Nesse caso, cada posição do array assumiu o valor padrão do int que é 0.
 O array *alunos* foi criado e ao mesmo tempo populado com os seguintes valores: "Joao", "Joana", "Andre", "Gustavo", "Mariana", "Aline".
 Por essa razão, o array *alunos* tem tamanho 6.
 
 ## Percorrendo Arrays
 
 Uma vez que o array *notasProva1* foi inicializado com valores padrão, em algum momento desejaremos alterar esses valores.
 De forma semelhante, possa ser que desejemos alterar o nome de algum aluno no array *alunos*.
 
 Isto é feito da seguinte forma:
 
 ``` java
    notasProva1[0] = 10;
    notasProva1[1] = 8;
    notasProva1[2] = 9;
    notasProva1[3] = 4;
    notasProva1[4] = 1;
    notasProva1[5] = 5;
    
    alunos[3] = "Adriano";
 ```
 
 No código anterior, atribuímos notas para a primeira prova relacionada aos 6 alunos.
 Note que a indexação dos arrays sempre começa em 0.
 Portanto, um array de tamanho 6 terá índices 0, 1, 2, 3, 4, 5.
 No exemplo anterior, também alteramos o nome do quarto aluno: Gustavo foi modificado para Adriano.
 
 Uma vez que tenhamos preenchido os arrays, em algum momento desejaremos percorrê-lo para fazer algumas verificações.
 Podemos fazer isto com um *for indexado*, ou com um *for-each*.
 
 For indexado:
  ``` java
    //imprimindo alunos
    for(int i = 0; i < 6; i++) {
      System.out.println("Aluno: "+alunos[i]);			
    }
		
    //imprimindo notas
    for(int i = 0; i < 6; i++) {
      System.out.println("Nota: "+notasProva1[i]);			
    }
 ```
 
  For-each:
  ``` java
    //imprimindo alunos
    for(String aluno : alunos) {
      System.out.println("Aluno: "+aluno);
    }
		
    //imprimindo notas
    for(int nota : notasProva1) {
      System.out.println("Nota: "+nota);
    }
 ```
 
 Para essa situação, os dois tipos de for têm o mesmo efeito.
 Portanto, nesse tipo de situação, use o que você preferir.
 
 Entretanto, em outras situações, o for-each não é indicado.
 Por exemplo, se assumirmos que a nota no índice i é referente ao aluno no índice i, poderíamos querer imprimir o nome do aluno e sua nota.
 O for-each não permite você fazer isto, mas o for indexado permite.
 
 Observe:
  ``` java
    //for indexado
    for(int i = 0; i < 6; i++) {
      System.out.println("Aluno: "+alunos[i]);			
      System.out.println("Nota: "+notasProva1[i]);
    }
 ```
 
 ## Arrays Multi-Dimensionais
 
 Também é possível criar arrays de arrays.
 Podemos criar arrays bidimensionais que, por exemplo, podem representar uma matriz.
 Também Podemos criar arrays tridimensionais, e arrays n-dimensionais, a depender do problema a ser solucionado.
 
 Poderíamos representar as 3 notas de 6 alunos em um bimestre da seguinte forma:
 ```java
 String[] alunos = new String[] { "Joao", "Joana", "Andre", "Gustavo", "Mariana", "Aline" };
 int[][] notasBimestre = new int [][] {{10, 5, 6, 8, 8, 5}, {9, 6, 5, 7, 8, 10}, {8, 8, 4, 9, 10, 9}};
 
 //notas de Joao: notasBimestre[0][0], notasBimestre[1][0], notasBimestre[2][0]
 for(int i = 0; i < 6; i++){
 	System.out.println("Aluno: "+alunos[i]+"; média: "+
		(notasBimestre[0][i] + notasBimestre[1][i] + notasBimestre[2][i])/3);
 }
 ```
 
 O array bidimensional *notasBimestre* pode ser representado pela seguinte tabela:
 
 linhas/colunas | 0 | 1 | 2 | 3 | 4 | 5 |
---- | ---- | ---- |  ---- | ---- | ---- | ---- |
0 | 10 | 5 | 6 | 8 | 8 | 5 |
1 | 9 | 6 | 5 | 7 | 8 | 10 |
2 | 8 | 8 | 4 | 9 | 10 | 9 |
 
Para acessar um elemento desse array bidimensional, é preciso fornecer o índice da linha e o índice da coluna desejadas.
Note que, no exemplo que estamos utilizando, a linha 0 representa a primeira nota, a linha 1 representa a segunda nota, e a linha 2 representa a terceira nota.
De forma semelhante, a coluna 0 representa o aluno "Joao", a coluna 1 representa a aluna "Joana", a coluna 2 representa o aluno "Andre", a coluna 3 representa o aluno "Gustavo", a coluna 4 representa a aluna "Mariana", e a coluna 5 representa a aluna "Aline".
Portanto, se quisermos saber a primeira nota de Joao, basta acessarmos notasBimestre[0][0], e se quisermos saber a segunda nota de Gustavo, basta acessarmos notasBimestre[1][3]. Se tivermos interesse na terceira nota de Mariana, conseguiremos acessá-la da seguinte maneira: notasBimestre[2][5].

O código provido no exemplo varre o array de alunos e impime a média de cada um. 
 
 ## Arrays também são Objetos
 
 Arrays também **são objetos**.
 Isto traz algumas consequências:
 1. Arrays tem variáveis (como é comum em objetos)
 2. Arrays tem métodos (como é comum em objetos)
 3. Se compararmos dois arrays com *==*, os endereços de memória dos arrays são comparados, e não seu conteúdo
 
 **Ponto 1:**
 Uma variável importante em arrays é *length*, que determina seu comprimento.
 Com esta informação, podemos tornar o nosso for indexado mais inteligente.
 
 Veja a seguir:
 ``` java
    //for indexado
    for(int i = 0; i < alunos.length; i++) {
      System.out.println("Aluno: "+alunos[i]);			
      System.out.println("Nota: "+notasProva1[i]);
    }
 ```
 
 Desta forma, se o tamanho de array de alunos mudasse, não precisaríamos mudar o for, pois ele inteligentemente sabe o comprimento do array.
 
 **Ponto 2:**
 Três métodos interessantes são o *clone*, *toString* e *equals*.
 O clone permite criar uma cópia do array com conteúdo idêntido.
 
 ``` java
 String[] alunos = new String[] {"Joao", "Joana", "Andre", "Gustavo", "Mariana", "Aline"};
 String[] alunosClone = alunos.clone();
 // for-each
 for (String aluno : alunosClone) {
    System.out.println("Aluno clone: " + aluno);
 }
 ```
 
 Os três métodos são herdados da classe Object.
 Por essa razão, o *toString* retorna identificador da classe + representação do endereço de memória, e *equals* basicamente compara com *==*.
 
  **Ponto 3:**
 No exemplo acima temos dois arrays: alunos e alunosClone.
 Cada array aponta para um objeto distinto, porém, ambos os objetos possuem mesmo conteúdo.
 Por esta razão, uma comparação entre alunos e alunosClone com *==* retorna *false*, e uma comparação com *equals* também retorna *false* (visto que acabamos de discutir que o equals é herdado de Object, e em Object a comparação é implementada com *==*).
 
 
 ``` java
 String[] alunos = new String[] {"Joao", "Joana", "Andre", "Gustavo", "Mariana", "Aline"};
 String[] alunosClone = alunos.clone();
 
 System.out.println(alunos.toString());
 System.out.println(alunos==alunosClone);
 System.out.println(alunos.equals(alunosClone));
 ```
 
 ## A Classe Arrays e alguns de seus métodos Estáticos
 
 No Java, existe uma classe utilitária de nome **Arrays** que nos provê alguns métodos estáticos bastante úteis.
 Os principais são: Arrays.equals(Object o1, Object o2), Arrays.sort(variavel) e Arrays.toString(variavel).
 
 - Arrays.equals(Object o1, Object o2): compara os conteúdos dos arrays
 - Arrays.sort(variável): ordena o array
 - Arrays.toString(variável): retorna uma representação textual do array
 
  ``` java
 String[] alunos = new String[] {"Joao", "Joana", "Andre", "Gustavo", "Mariana", "Aline"};
 String[] alunosClone = alunos.clone();
 
 System.out.println(Arrays.equals(alunos, alunosClone));
 
 System.out.println("Antes de ordenar notas: "+Arrays.toString(notasProva1));
 Arrays.sort(notasProva1);
 System.out.println("Depois de ordenar notas: "+Arrays.toString(notasProva1));
 ```
 
 ## Exceções
 
 As exceções mais comuns quando usamos arrays são: ArrayIndexOutOfBoundsException e NullPointerException.
  - ArrayIndexOutOfBoundsException: quando você tenta acessar um elemento do array em um índice inexistente (ex: índice negativo, ou índice que extrapola o limite do array)
  - NullPointerException: quando você tenta fazer qualquer operação em um objeto (que neste caso é um array) mas o objeto não foi instanciado
  
   ``` java
 String[] alunos = new String[] {"Joao", "Joana", "Andre", "Gustavo", "Mariana", "Aline"};
 
 System.out.println(alunos[10]);	//ArrayIndexOutOfBoundsException:
 int [] arrayNaoInstanciado = null;
 System.out.println(arrayNaoInstanciado[0]);	//NullPointerException
 ```
 
 ## Performance
 
 Considere um programa que para cada dia armazena sua temperatua em um array.
 Esse programa quer armazenar as temperaturas de 100 milhões de  dias, ou seja, 10^8 dias.
 Um array com 100 milhões de inteiros ocupa bastante espaço na memória (aproximadamente 400 MB).
 No entanto, o aspecto interessante de arrays é que eles têm acesso extremamente rápido, mesmo que você esteja buscando o último elemento do array.
 
 Observe a ilustração:
 
 ![alt text](Imagens/arrays.png)
 
 Na imagem estão ilustrados o endereço de memória do array, seus índices, e o tamanho de cada elemento do array (que por ser int é de 4 bytes).
 Note que se temos um array com 10^8 elementos, o último elementos estará no índice (10^8) - 1, pois o primeiro elemento fica no índice 0.
 
 Assuma que o índice usado para obter um valor do array é a variável **pos**.
 O que quero deixar claro pra vocês é que quando tentarmos acessar o último elemento, *temp[pos]* onde *pos = 100000000-1*, a JVM não irá percorrer elemento por elemento do array, mas ela irá direto ao elemento desejado, de forma instantânea.
 
 A gente consegue fazer isso com arrays porque **arrays são armazenados em blocos contíguos de memória**.
 Portanto, se o endereço do array é 327623, e o elemento buscado é o primeiro elemento, ou seja, *temp[pos]* onde *pos = 0*,  então sua posição de memória seria 327623 + pos * 4 (visto que um inteiro ocupa 4 bytes). Como *pos = 0*, nesse caso, a JVM iria para o endereço 327623.
 No caso de estarmos acessando o último elemento do array, *temp[pos]* onde *pos = 100000000-1*, a JVM acessaria o endereço de memória 327623 + pos * 4, ou seja, 327623+(100000000-1) * 4 = 400327619.
 
 É por esta razão que arrays são estruturas de rápido acesso, mesmo que seu tamanho seja absurdamente grande.
