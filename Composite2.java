package Pattern;
import java.util.Scanner;
public class Composite2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i=1;i<=m;i++){
//            for (int j=m-1;j>=i;j--){
            for (int j=1;j<=m-i;j++){
                System.out.print(" "+" ");
            }
            for (int k=1;k<=m;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
