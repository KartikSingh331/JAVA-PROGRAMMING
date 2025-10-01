package Recursion;
import java.util.Scanner;
public class Factorial {
    public static int fact(int n) {
//        while (n >= 0) {
            if (n == 0) {
                return 1;
            } else {
                int ans= (n * fact(n - 1));
                return ans;
            }
    }
    //    return 0;
   // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n= sc.nextInt();
        fact(n);
        System.out.println(fact(n));
    }
}