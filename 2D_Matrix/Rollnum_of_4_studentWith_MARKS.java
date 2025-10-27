package TWO_D_ARRAY;

import java.util.Scanner;

public class Rollnum_of_4_studentWith_MARKS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][2];
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
            for (int i = 0; i <4 ; i++) {
                for (int j = 0; j <2 ; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();



        }
    }
}
