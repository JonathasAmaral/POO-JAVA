package Array;

public class Q2 {

    double[] numero = new double[4];

    public static void main(String[] args) {
        
        Q2 teste = new Q2();

        teste.numero[0] = 1.1;
        teste.numero[1] = 1.2;
        teste.numero[2] = 1.3;
        teste.numero[3] = 1.4;

        for(int i = 0; i <= 3; i++){
            System.out.print("Number: " + teste.numero[i] + ", ");
        }
    }
}
