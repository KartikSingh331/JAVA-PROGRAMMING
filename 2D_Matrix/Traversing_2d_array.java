package TWO_D_ARRAY;
import java.util.Scanner;
public class Traversing_2d_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[2][3];
      //  int m= arr.length;  //for no of rows
     //   int n=arr[0].length; //for no of cols
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
