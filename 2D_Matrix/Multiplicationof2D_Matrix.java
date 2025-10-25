package TWO_D_ARRAY;
import java.util.*;
public class Multiplicationof2D_Matrix {
    public static void print(int[][] arr){
        int m= arr.length;
        int n=arr[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] a={{4,5,6},{3,2,4}};
        int[][] b={{1,4,7},{2,5,8},{5,3,9}};

        if (a[0].length!= b.length){
            System.out.println("Multiplication is not possible");
        }
        else{
            int[][] c=new int[a.length][b[0].length];
            for (int i=0;i<c.length;i++){
                for (int j=0;j<c[0].length;j++){
                    for (int k=0;k<b.length;k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }

                }

            }
            print(a);
            print(b);
            print(c);
        }
    }
}
