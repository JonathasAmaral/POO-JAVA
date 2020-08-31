# Variáveis

## São representadas 

```java
(Tipo) (Nome) = (Valor inicial);

Ex: 
    String x = "Hello";
    int x = 100;
    double x = 1.123;
```
## Para modificar o separrador 

```java
  Utilizamos: Locale.setDefault(Locale.US);

US é usado para o separador ser representado por um " . "
Para utilizar o Locale é necessário importa a class... " import java.util.Locale; "
```

## Para concatenar vários elementos em uma mesmo comando de escrita

```java

  Regra para print e Prinln:

Colocamos o sinal de " + " entre a variavel
    Ex:
        System.out.println("Texto1" + x + "Texto2");
  
  Regra geral para printf: 

Usamos marcadores como " %f, %d, %s, %n "
    EX:
        System.out.printf(" %s tem %d anos e ganha R$ %f reais \n", nome, idade, renda);
```
```java
%f = Ponto flutuante
%d = Inteiro 
%s = Texto
%n ou \n = Quebra de linha 
```
