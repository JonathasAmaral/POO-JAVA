package Array;

public class Q9 {

    int[] numero = new int[4];

    public static void main(String[] args) {
        
        Q9 teste = new Q9();

        teste.numero[0] = 1;
        teste.numero[1] = 2;
        teste.numero[2] = 3;
        teste.numero[3] = 4;
    

        for(int i = 0; i <= 3; i++){

            if(teste.numero[i] % 2 == 0) {
                
                teste.numero[i] = 1;

                System.out.print("Number par: " + teste.numero[i] + ", ");
            }
            else {
                teste.numero[i] = -1;

                System.out.print("Numero impar: " + teste.numero[i] + ", ");
            }
            
        }
        
        System.out.println("");
    }
    
}