package Pattern;
import java.util.Scanner;
public class Composite_Numberpyramid_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i=1;i<=m;i++){
            for (int j=1;j<=m-i;j++){
                System.out.print(" "+" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            for (int k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}

