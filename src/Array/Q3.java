package Array;

import java.util.Scanner;

public class Q3 {
    
    double[] numero = new double[10];

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Q3 teste = new Q3();

        teste.numero[0] = input.nextDouble();
        teste.numero[1] = input.nextDouble();
        teste.numero[2] = input.nextDouble();
        teste.numero[3] = input.nextDouble();
        teste.numero[4] = input.nextDouble();
        teste.numero[5] = input.nextDouble();
        teste.numero[6] = input.nextDouble();
        teste.numero[7] = input.nextDouble();
        teste.numero[8] = input.nextDouble();
        teste.numero[9] = input.nextDouble();

        for(int i = 0; i <= 9; i++){
            System.out.print("Number: " + teste.numero[i] + ", ");
        }

        input.close();
    }
}
