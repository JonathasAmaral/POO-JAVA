package Array;

public class Q6 {

    int[] numero = new int[4];

    public static void main(String[] args) {
        
        int cont = 0;
        Q6 teste = new Q6();

        teste.numero[0] = -1;
        teste.numero[1] = 2;
        teste.numero[2] = -3;
        teste.numero[3] = 4;
    

        for(int i = 0; i <= 3; i++){

            boolean[] vf = new boolean[4];

            if(teste.numero[i] < 0) {
                
                vf[i] = false;

                System.out.print("Number positivo: " + vf[i] + ", ");
                cont++;
            }
            else {
                vf[i] = true;

                System.out.print("Numero positivo: " + vf[i] + ", ");
            }
        }
        System.out.println("Quantidade de numeros negativos: " + cont);

    }
    
}
