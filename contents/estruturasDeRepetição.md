# Estruturas de repetição 


## for 

- O for é usado geralmente quando se sabe a quantidade de interações
- Sintaxe do for:
	- for (//Iniciar um contador; //Condição de parada; //Comando executado no fim da execução do for) {}
                        
### Ex:

```java
  for (int i = 0; i <= 100; i++) {
      // Comandos
  }
```

## while 

- o while é usado geralmente quando não se sabe de interações
- A diferença do while para o do-while é que o while não executa o primeiro comando sem verificar a condição, enquanto o do-while o faz
- sintaxe do while: 
	- while (//Condição de parada) {}

### Ex:

```java
  
  Scanner input = new Scanner(System.in);
  int valor = input.nextInt();
  
  while (valor <= 0) {
    //Comandos 
  }
```

## do - while

- Comando usado em poucas ocasiões
- Quando queremos que um código execute pelo menos uma vez, e posteriormente continue executando somente se uma condição for verdadeira, usamos o do-while.

### Ex:

```java 

Scanner scanner = new Scanner(System.in);
int notaAluno = 0;
double media = 0;
int contador = 0;
do{		  
  notaAluno = scanner.nextInt();      //recebe a nota a partir do teclado
  if(notaAluno>=0) {
	  media += notaAluno;
	  contador++;
  }
} while(notaAluno>=0); 				  //pára quando a nota for negativa;
if(contador!=0)
	media /= contador;
System.out.println("Media: "+media);

```
 
