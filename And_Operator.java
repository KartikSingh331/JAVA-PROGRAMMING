package Conditionals_and_Loops;
import java.util.Scanner;
public class And_Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a number: ");
        int n=sc.nextInt();
        if(n>99 && n<1000){
            System.out.println("Three digit number");
        }
        else {
            System.out.println("Not three digit number");
        }
    }
}
