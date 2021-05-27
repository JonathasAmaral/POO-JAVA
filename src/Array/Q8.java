package Array;

import java.util.Scanner;

public class Q8 {

    int[] num = new int[5];

    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);
        Q8 array = new Q8();

        array.num[0] = input.nextInt();
        array.num[1] = input.nextInt();
        array.num[2] = input.nextInt();
        array.num[3] = input.nextInt();
        array.num[4] = input.nextInt();

        for (int i = 0; i <= 4; i++) {
              
            System.out.print(array.num[i] + ", ");
        }
        System.out.println("");
        input.close();
    }
}