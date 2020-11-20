# Reúso de Código

Uma das práticas que todo programador deve abominar é escrever código duplicado.
Código duplicado é ruim porque sempre que houver alguma mudança em um determinado algoritmo, o programador deverá procurar ocorrências daquele algoritmo em seu programa e realizar a mudança.
No mundo do desenvolvimento de software, **mudança é quase uma certeza**.
Os programadores têm alguma resistência em realizar mudanças em seu programa, por causa do retrabalho.
Mas a mudança do código do programa vai acontecer com certa frequência.
Programas mudam porque:
1. o programador implementou uma funcionalidade errada (entendeu mal os requisitos listados pelos clientes)
2. O programador encontrou um bug no programa que precisa ser corrigido
3. O cliente mudou de ideia a respeito de uma funcionalidade que havia solicitado
4. O gerente do projeto pressionou a equipe para entregar funcionalidades do programa e, diante da pressão, a equipe não respondeu bem e implementou as funcionalidades com más práticas de design
5. Dentre outras situações.

No paradigma de programação orientada a objetos existem duas formas de promover o  reúso de código: composição e herança.

## Composição

Sempre que uma determinada classe A tiver uma variável de referência cujo tipo é de uma outra classe B, dizemos que **A tem B**.
Quando **A tem B**, a classe A tem acesso a todas as variáveis e funções públicas de B.
Por essa razão, A reusa o código de B.
Nesse caso, A reusa B através da *composição*.

Suponha que você esteja criando um aplicativo como o Uber.
Poderíamos ter as seguintes classes, por exemplo: Motorista, Passageiro, Corrida.
Imagine que Motorista e Passageiro possuam variáveis para armazenar a data de ingresso no Uber.
Também considere que a classe Corrida deve ter variáveis para armazenar a data de acontecimento daquele serviço.
Se não usarmos composição, poderíamos ter classes parecidas com estas:
```java
class Motorista{
  private String nome;
  private String cpf;
  private int diaIngresso, mesIngresso, anoIngresso, horaIngresso, minutoIngresso;
  private Conta contaRecebimento;
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Passageiro{
  private String nome;
  private String cpf;
  private Conta contaPagamento;
  private int diaIngresso, mesIngresso, anoIngresso, horaIngresso, minutoIngresso;
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Corrida{
  //inicio da corrida
  private int diaInicio, mesInicio, anoInicio, horaInicio, minutoInicio;
  //fim da corrida
  private int diaFim, mesFim, anoFim, horaFim, minutoFim;
  private double km;
  
  //demais atributos e funções
}
```

Se criarmos a classe Data, podemos por composição evitar a duplicação de código.

```java

class Data{
  private int dia, mes, ano, hora, minuto;
  //construtor e funções
}

class Motorista{
  private String nome;
  private String cpf;
  private Data dataIngreso;
  private Conta contaRecebimento;
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Passageiro{
  private String nome;
  private String cpf;
  private Conta contaPagamento;
  private Data diaIngreso;
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Corrida{
  private Data dataInicio;  //inicio da corrida
  private Data dataFim;     //fim da corrida
  private double km;
  
  //demais atributos e funções
}
```

No exemplo que usamos a composição como estratégia de reúso de código nós temos uma facilidade maior para se adaptar às mudanças.
Nosso programa se torna flexível.
Nessa situação, uma mudança qualquer referente à datas, de modo geral, se restringe à classe data.

Imagine que o atributo *segundos* é importante para o nosso programa.
Basta acrescentar na classe Data, em vez de acrescentar em todas as classes (Motorista, Passageiro, e Corrida).

```java
class Data{
  private int dia, mes, ano, hora, minuto, segundo;
  //construtor e funções
}

class Motorista{
  private String nome;
  private String cpf;
  private Data dataIngreso;
  private Conta contaRecebimento;
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Passageiro{
  private String nome;
  private String cpf;
  private Conta contaPagamento;
  private Data diaIngreso;
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Corrida{
  private Data dataInicio;  //inicio da corrida
  private Data dataFim;     //fim da corrida
  private double km;
  
  //demais atributos e funções
}
```

Note que a composição permite um relacionamento **1 para N** (1 classe pode reutilizar múltiplas outras classes).
A classe Corrida, por exemplo, contém 2 datas (e poderia conter mais datas, se fosse o código).
Além disto, Corrida poderia conter outras classes.

Com respeito ao exemplo anterior, ainda existem variáveis duplicadas: nome, cpf, conta.
Também é possível usar a composição para essa situação (no entanto, eu acho que o código fica um pouco estranho em termos de legibilidade de relacionamentos).
Para evitar a duplicação de *nome, cpf, conta*, podemos jogar essas variáveis em uma classe chamada Pessoa.

```java
class Data{
  private int dia, mes, ano, hora, minuto, segundo;
  //construtor e funções
}

class Pessoa{
  private String nome;
  private String cpf;
  private Conta conta;
  //construtor e funções
}

class Motorista{
  private Pessoa pessoa;
  private Data dataIngreso;  
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Passageiro{
  private Pessoa pessoa;
  private Data diaIngreso;
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Corrida{
  private Data dataInicio;  //inicio da corrida
  private Data dataFim;     //fim da corrida
  private double km;
  
  //demais atributos e funções
}
```

Através do atributo *pessoa*, Motorista e Passageiro podem obter informações como nome, cpf, e conta, possivelmente através de métodos públicos getters.
Portanto, temos um reúso.
Por outro lado, dizer que *Motorista tem uma Pessoa* e *Passageiro tem uma Pessoa*, é algo que não soa bem.
Parece não fazer sentido.
Bem... se o nome da classe Pessoa fosse mudado para DadosPessoa, talvez nessa situação a legibilidade de relacionamentos tivesse mais sentido: *Motorista tem um DadosPessoa* e *Passageiro tem um DadosPessoa*.

Não estou dizendo que essa abordagem está incorreta.
Na verdade, ela funciona bem, e é bastante poderosa (entenderemos melhor a razão quando estudarmos Interfaces).

Em seguida, veremos outra forma de reutilizar código.

## Herança

Na herança, podemos estabelecer relações hierárquicas entre classes.
Teremos uma classe mãe (ou pai) e várias classes filhas, que são as classes que herdam.
A saber, todas as classes de Java são filhas de Object, ou netas de Object, ou tataranetas de Object, etc.
Resumindo, todas as classes tem algum relacionamento direto ou indireto com Object.

A herança é estabelecida através da palavra-chave **extends**.
Se uma determinada classe não declara explicitamente que herda de outra classe, então aquela classe herda da classe Object.

No exemplo utilizado, podemos fazer as classes Motorista e Passageiro herdarem a classe Pessoa.
Pessoa, Data, e Corrida, por suas vezes, são classes que herdam de Object.
```java
class Data{
  private int dia, mes, ano, hora, minuto, segundo;
  //construtor e funções
}

class Pessoa{
  protected String nome;
  protected String cpf;
  protected Conta conta;
  //construtor e funções
}

class Motorista extends Pessoa{
  private Data dataIngreso;  
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Passageiro extends Pessoa{
  private Data diaIngreso;
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Corrida{
  private Data dataInicio;  //inicio da corrida
  private Data dataFim;     //fim da corrida
  private double km;
  
  //demais atributos e funções
}
```

Nesse código, **Motorista é uma Pessoa** e **Passageiro é uma Pessoa**.
A legibilidade de relacionamentos faz total sentido.
Note que o modificador de acesso dos atributos de Pessoa é *protected*, que permite a visibilidade daqueles atributos por sub-classes.

Nessa situação nós temos o reúso do código de Pessoa por Motorista e Passageiro.
Note que, para o reúso de Data, a herança não faria sentido pois seria estranho dizer que *Motorista é uma Data* e *Passageiro é uma Data*, e *Corrida é uma Data*.

A herança permite apenas um relacionamento **1 para 1** (1 classe pode reusar apenas o código de 1 outra classe).
Portanto, a representação da classe Corrida com duas datas não seria possível de alcançar apenas com herança.
Diz-se que em Java temos apenas herança simples, ou seja, um classe não pode herdar de mais de uma classe (enquanto na composição, isto é possível).

### Sobrescrita

Na herança, uma classe herda atributos e métodos de outra classe (a depender da visibilidade).
Os métodos herdados podem ser utilizados livremente pelas sub-classes.

Sempre que houver herança, e métodos de uma superclasse ficarem disponíveis para sub-classes, é possível haver **sobrescrita**.
A sobrescrita (ou reescrita) acontece quando uma sub-classe especializa um método herdado.
Especializar quer dizer prover um funcionamento mais específico para aquele método (na sub-classe).
Isto é feito codificando um método na sub-classe que contenha a mesma assinatura (tipo de modificador, tipo de retorno, nome de método, e mesma quantidade e mesmos tipos de argumentos).

No exemplo anterior, imagine que tenhamos 3 tipos de Corrida.
1. Corrida convencional (UberX) com carros populares: pagamos o preço base normal de R$5 e um custo de R$1.6 por km
2. Corrida mais cara (UberVip) com carros de luxo: pagamos o preço base normal de R$5, um custo de R$2.3 por km
3. Corrida compartilhada (UberPool): pagamos o preço base normal de R$4.5 e um custo de R$1.3 por km, e recebemos um desconto de 10% por cada passageiro extra (a Uber se encarrega de encontrar passageiros que estejam no trajeto e compartilhem o mesmo destino, de modo que possam dividir os custos da viagem)

Poderíamos representar estas peculiaridades com herança e sobrescrita.
```java
class Corrida{
  private Data dataInicio;  //inicio da corrida
  private Data dataFim;     //fim da corrida
  protected double km;
  protected List<Passageiro> passageiros;
  
  public double getCusto(){
    return getPrecoBase() + getCustoKm() * km;
  }
  
  protected double getPrecoBase(){
    return 5;
  }
  
  protected double getCustoKm(){
    return 1.6;
  } 
}

class CorridaVip extends Corrida{    
  
  @Override
  protected double getCustoKm(){
    return 2.3;
  }  
}

class CorridaPool extends Corrida{    
  
  @Override
  protected double getPrecoBase(){
    return 4.5;
  }
  
  @Override
  protected double getCustoKm(){
    return 1.3;
  }
  
  @Override
  public double getCusto(){
    double custo = super.getCusto();
    return custo - (super.passageiros.size()/10 * custo);
  }
}
```

Detalhes acerca do exemplo.
1. A anotação @Override é opcional, mas recomendada, pois indica ao compilador que o programador tem a intenção de sobrescrever aquele método. Se o método anotado não estiver dentro das regras de reescrita, então um erro de compilação é lançado.
2. Usamos o modificador de acesso protected para permitir que as sub-classes consigam acessar alguns atributos. Outra opção seria deixar os atributos privados e criar métodos acessadores getters públicos.
3. Usamos super para se referir à uma variável/método da superclasse. No nosso exemplo, *super.getCusto()* é obrigatório, pois de outro modo estaríamos nos referindo à função *getCusto()* da classe CorridaPool. No caso de *super.passageiros*, o super não é obrigatório pois não existe ambiguidade a ser removida. Por exemplo, se existisse uma variável local dentro do método getCusto() com identificação *passageiros*, o que poderia gerar ambiguidade entre a variável local (do método) e a variável da superclasse.

#### Regras da Sobrescrita

As regras da sobrescrita dizem respeito à assinatura da função.
Por assinatura, considere: modificador de acessor, tipo de retorno, nome da função, quantidade de argumentos, e tipos dos argumentos (a ordem dos argumentos importa)

Opção 1: assinatura exatamente igual.

Opção 2: assinatura não é exatamente igual, embora seja parecida.

&nbsp;  &nbsp; 2.1. nome de função igual

&nbsp;  &nbsp; 2.2. tipo de retorno pode ser diferente, contanto que o tipo da função sobrescrita respeite o relacionamento *É-UM* com o tipo de retorno da função na superclasse (lembrar que a palavra reservada *instanceof* é usada para o teste)

&nbsp;  &nbsp; 2.3. modificador de acesso menos restritivo (ex: se na superclasse tivermos protected, na sub-classe podemos ter public)

Lembre-se que para haver sobrescrita deve haver herança!

----------
