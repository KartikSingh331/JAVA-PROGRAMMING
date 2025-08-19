package Pattern;
import java.util.Scanner;
public class Speacile_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
       /* for (int i=1;i<=m;i++){
            for (int j=1;j<=i;j++){
                System.out.print((2*j)-1+" ");
            }
            System.out.println();

        } */
        //OR
        for (int i=1;i<=m;i++){
            int a=1;
            for (int j=1;j<=i;j++){
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }
    }
}
