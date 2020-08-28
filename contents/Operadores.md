# Operadores              

## Operadores Básicos

**Aritméticos:** +, -, *, /, % (módulo)

```java
int a = 1 + 1;      //o valor de a será 2
a = a - 1;          //o valor de a será 1
a = a * 10;         //o valor de a será 10
a = a / 2;          //o valor de a será 5
a = a / 2;          //o valor de a será 2 (o inteiro armazena apenas a parte inteira, desprezando a decimal

int resto = 10 % 3; //o valor de resto será 1
```
<br/>

**Unários:** ++, --, !

```java
int a = 10;      

//primeiro examinemos os pós-fixados
int b = a++;          //a é atribuído para b (10), e depois a é incrementado (11)
int c = a--;          //a é atribuído para c (11), e depois a é dencrementado (10)

//depois examinemos os pré-fixados
int d = ++a;          //a é incrementado (11), e depois a é atribuído para d (11)
int e = --a;          //a é decrementado (10), e depois a é atribuído para d (10)

//booleano
boolean f = true;
f = !f;               //inverti o valor de f para false
f = !true;            //mantive o valor de f em false
f = !false;           //alterei o valor de f para true
```

**Relacionais de comparação e igualdade:** <, >, <=, >=,, ==, !=

```java
int a = 10, b = 15, c = 5, d = 10;

boolean res1 = a > b;     //res1 é false
res1 = a >= b;            //res1 é false
res1 = a < b;             //res1 é true
res1 = a <= b;            //res1 é true

boolean res2 = a > c;     //res2 é true
res2 = a >= c;            //res2 é true
res2 = a < c;             //res2 é false
res2 = a <= c;            //res2 é false

boolean res3 = a > d;     //res3 é false 
res3 = a >= d;            //res3 é true
res3 = a < d;             //res3 é false
res3 = a <= d;            //res3 é true

boolean res4 = a==5;      //res4 é false
res4 = a==10;             //res4 é true
```


**Lógicos:** &&, ||

```java
boolean v1 = true;
boolean v2 = false;

boolean v3 = v1 && v2;    //v3 é false
v3 = v1 || v2;            //v3 é true
```

**Ternário:** ? : (tem o mesmo efeito de um comando condicional if-else)

```java
int altura = 180;
String classificacao = altura > 160 ? "alto" : "baixo";  //classificacao é "alto"

//equivale ao seguinte comando if-else
String classificacao = "";
if(altura > 160)
  classificacao = "alto";
else
  classificacao = "baixo";
```

**Atribuição:** =, +=, -=, *=, /=, %=, &=, ^=, |=
```java
int idade = 18;   
idade += 20;      //idade é 38
idade -= 8;       //idade é 30
idade *= 2;       //idade é 60
idade /= 2;       //idade é 30
idade %= 28;      //idade é 2
idade ^= 2;       //idade é 4
```

## Operadores Avançados

**Relacional:** instanceof

**Deslocamento (shift):** <<, >>, >>>=

**Atribuição com deslocamento:** <<=, >>=, >>>=

**Bitwise:** &, |, ^ (and, or e xor)

**Unário:** ~


-------------
## Exemplo 
```java
public class TesteOperadores{
	
  public static void main(String[] args){
		int a = 10;
		int b = a++;
		System.out.println(b);
		System.out.println(a);
    
    // deslocamento de bit à esquerda
		byte valor = 8;
		System.out.println("Valor: "+(valor<<1));*/
		
		int c = 10;
		int d = 20;
		//if(c<5 && ++d<10){	//short-circuit: tenta terminar a execução dessa comparação com o mínimo de informação possível
		if(c<5 & ++d<10){	    //long-circuit: avalia a expressão completa, independente de ser necessário ou não
			System.out.println("entrei no if");
		}

		System.out.println("C: "+c);
		System.out.println("D: "+d);
	
	}
}
```
