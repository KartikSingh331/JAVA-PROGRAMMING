package Conditionals_and_Loops;
import java.util.Scanner;
public class Divisibility_Chekup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("Number is divisible by both");
        } else if (n%5==0) {
            System.out.println("Number is divisible by 5");
        } else if (n%3==0) {
            System.out.println("Number is divisible by 3");

        } else{
            System.out.println("Not divisible");
        }
    }
}
