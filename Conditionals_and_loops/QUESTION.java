package Conditionals_and_Loops;
import java.util.Scanner;
public class QUESTION {
    //Armstrong number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int d=0;
        while(n!=0) {
            n=n/10;
            d=d+1;
        }
        System.out.println(d);
    }

}

