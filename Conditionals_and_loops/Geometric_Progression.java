package Conditionals_and_Loops;
import java.util.Scanner;
public class Geometric_Progression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int a=1;
        for (int i=1;i<=n;i++){
            System.out.println(a);
            a*=2;
        }
    }
}
