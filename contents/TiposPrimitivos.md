# Tipos Primitivos 

Conteudo: 

## Tipo Booleano
boolean: armazenado em 1 bit, e pode assumir os valores false e true

## Tipos Numéricos
Decimais Perceba que o bit mais à esquerda é sempre usado para determinar se o número será negativo ou positivo.

 - 1 bit
 - 1 byte ==> 8 bits
 - 1 kilobyte ==> 1000 bytes
 - 1 megabyte ==> 1000000 bytes
 - 1 gigabyte ==> 1000000000 bytes
 - 1 terabyte ==> 1000000000000 bytes
 
### Lembrando como converter um número binário para decimal...

43210

01010

==> 0*(2^0) + 1*(2^1) + 0*(2^2) + 1*(2^3) + 0*(2^4)

==> 0 + 2 + 0 + 8 + 0

==> 10

### Tipos Numéricos Inteiros

- **byte**:

    - 1 byte (ou 8 bits); no entanto, o bit mais à esquerda é usado para determinar o sinal (0positivo/1negativo); logo, o intervalo é de -128 à 127.
    - Se conseguíssemos usar todos os bits para representar o valor de um número, teríamos um intervalo de 0 à 255.
         - 00000000 ==> 0
         - 11111111 ==> 1+2+4+8+16+32+64+128 ==> 255
         - O bit mais significativo (bit mais à esquerda) é usado para representar se o número é positivo ou negativo:
             - 11111111 ==> (1+2+4+8+16+32+64)*(-1) ==> -127
             - 01111111 ==> (1+2+4+8+16+32+64)*(1) ==> 127
         -  Lembrar que não faria sentido existir 00000000 e 10000000, pois não há zero positivo e zero negativo; Portanto, um desses valores é usado para 0, e o outro é usado como um valor negativo (que estende o intervalo de -127 para -128)

- **short**:

    - possui 16 bits (ou 2 bytes); o bit mais à esquerda é usado para determinar o sinal (0positivo/1negativo); logo, o intervalo é de -32768 à 32767
        - 1111111111111111 ==> (1+2+4+8+16+32+64+128+256+512+1024+2048+4096+8192+16384)*(-1) ==> -32767
        - 0111111111111111 ==> 32767
        - 0000000000000000 ==> 0
        - 1000000000000000 ==> -32768
        - Lembrar que não faria sentido existir 0000000000000000 e 1000000000000000, pois não há zero positivo e zero negativo; Portanto, um desses valores é usado para 0, e o outro é usado como um valor negativo (que estende o intervalo de -32767 para -32768)

- **int**:

    - possui 32 bits (ou 4 bytes); o bit mais à esquerda é usado para determinar o sinal (0positivo/1negativo); logo, o intervalo é de -8.589.934.592 à 8.589.934.591

- **long**:

    - possui 64 bits (ou 8 bytes); o bit mais à esquerda é usado para determinar o sinal (0positivo/1negativo); logo, o intervalo é de -9.223.372.036.854.775.808 à 9.223.372.036.854.775.807

### Tipos Numéricos de Ponto Flutuante

- **float**: cabe em 4 bytes (ou 32 bits); intervalo: 1.40129846432481707e-45 à 3.40282346638528860e+38

- **double**: cabe em 8 bytes (ou 64 bits); intervalo: 4.94065645841246544e-324d à 1.79769313486231570e+308d

### Sobre Performance

Tipos menores não melhoram a performance, mas precisamos ter um espírito crítico (e razoavelmente econômico) para saber escolher os tipos mais adequados.

## Tipos Textuais

- **char**:

    - armazena um caractere, como 'a', 'b', ..., 'z', você pode usar o tipo char. Ele é armazenado em 2 bytes.

- **String**:

    - não é um tipo primitivo (é um OBJETO), mas pode ser usado como se fosse um tipo primitivo
    - armazena textos entre áspas duplas; Ex: "Eduardo", "POO"
