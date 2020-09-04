# Estruturas Condicionais

## if - else - else if

### Sintaxe do if, else e else if: 
Usamos:
   
```java  
  if ( //Condição ) {
     
     // Comandos 
     
   }
```
```java
  else if ( //Condição ) {
     
     // Comandos 
     
     }
 ```

### Para que serve o if, else e else if: 

É utilizado para fazer varias comparações.

## Switch - case

O switch case é um pouco mais restrito do que comandos if else. Ele serve apenas para comparar (==) valorer primitivos inteiros ou String (não pode ser usado com double ou float). Também não pode ser usado para comparações mais elaboradas, envolvendo por exemplo >=, <=, e combinações de comparações mais complexas usando operadores lógicos (&&, ||). No entanto, é notório que os programadores os utilizam com mais frequência para comparar uma variável que pode assumir níveis/categorias com valores bem definidos. Note que a palavra chave ''default'' funciona de forma parecida a um ''else''.

### Ex:

```java

class Programa{

    public static void main (String [] args) {

       Scanner scanner = new Scanner(System.in);

int dia = scanner.nextInt();      //recebe dia a partir do teclado
switch (dia) {

  case 1:
    System.out.println("Segunda-feira");
    break;                        // O break para o programa
    
  case 2:
    System.out.println("Terca-feira");
    break;
    
  case 3:
    System.out.println("Quarta-feira");
    break;
    
  case 4:
    System.out.println("Quinta-feira");
    break;
    
  case 5:
    System.out.println("Sexta-feira");
    break;
    
  case 6:
    System.out.println("Sabado");
    break;
    
  case 7:
    System.out.println("Domingo");
    break; 
    
  default:                        //caso não for nenhum desses casos usamos default
    System.out.println("O valor de dia não está entre 1 e 7."); 
    
    }
}

```
