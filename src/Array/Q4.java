package Array;

public class Q4 {
    
    int[] numero = new int[4];

    public static void main(String[] args) {
        
        int cont = 0;
        Q4 teste = new Q4();

        teste.numero[0] = -1;
        teste.numero[1] = 2;
        teste.numero[2] = -3;
        teste.numero[3] = 4;
    

        for(int i = 0; i <= 3; i++){
            if(teste.numero[i] < 0) {
                System.out.print("Number negativo: " + teste.numero[i] + ", ");
                cont++;
            }
        }
        System.out.println("Quantidade de numeros negativos: " + cont);

    }
}
