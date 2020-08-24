# Tipos Primitivos 

Conteudo: 


## Tipo Booleano
Boolean: É representado pelos valores True e False e, é armazenado em 1 bit

## Tipos Numéricos

 - 1 bit
 - 1 byte ==> 8 bits
 - 1 kilobyte ==> 1000 bytes
 - 1 megabyte ==> 1000000 bytes
 - 1 gigabyte ==> 1000000000 bytes
 - 1 terabyte ==> 1000000000000 bytes
 
 Obs: O bit mais à esquerda é usado para determinar o sinal (0 positivo/1 negativo)
 

### Como converter um número binário para decimal...

   0    |   0 |    1  |   1 |    1|  1 | 0 |  0
   
   ^    |   ^ |    ^  |   ^ |    ^|  ^ | ^ |  ^
   
  128   |  64 |   32  |  16 |  8  | 4  | 2 |  1

Para converter basta somar os números que tem como sua posição o numero 1
Exemplo: 

Em número Binário (1 byte) = 0 0 1 1 1 1 0 0 

Em Decimal = 4 + 8 + 16 + 32  = 60 


### Tipos Numéricos Inteiros

- **byte**:

Representa1 byte (ou 8 bits)

O intervalo é de -128 à 127.

Se conseguíssemos usar todos os bits para representar o valor de um número, teríamos um intervalo de 0 à 255.

- **short**:

Representa 16 bits (ou 2 bytes)

O intervalo é de -32768 à 32767


- **int**:

Representa 32 bits (ou 4 bytes)

O intervalo é de -8.589.934.592 à 8.589.934.591

- **long**:

Representa 64 bits (ou 8 bytes)

O intervalo é de -9.223.372.036.854.775.808 à 9.223.372.036.854.775.807


### Tipos Numéricos de Ponto Flutuante

- **float**: 

Representa 4 bytes (ou 32 bits)

- **double**:

Representa 8 bytes (ou 64 bits)


### Sobre Performance

Tipos menores não melhoram a performance, mas precisamos ter um espírito crítico (e razoavelmente econômico) para saber escolher os tipos mais adequados.


## Tipos Textuais

- **char**:

Armazena um caractere, como 'a', 'b', ..., 'z', você pode usar o tipo char. Ele é armazenado em 2 bytes.

- **String**:

Armazena textos entre áspas duplas; Ex: "JAVA", "HelloWorld"

Não é um tipo primitivo (é um OBJETO), mas pode ser usado como se fosse um tipo primitivo

