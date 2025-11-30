package Pattern;
import java.util.Scanner;
public class Star_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i=1;i<=m;i++){
            for (int k=m-1;k>=i;k--){
                System.out.print(" "+" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*"+" ");
        }
            System.out.println();
        }
        for (int i=m-1;i>=1;i--){
            for (int j=1;j<=m-i;j++){
                System.out.print(" "+" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

