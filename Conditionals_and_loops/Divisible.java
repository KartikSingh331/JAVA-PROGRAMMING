package Conditionals_and_Loops;
import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0){
            System.out.println("Divisible by 5");
        }
    else{
            System.out.println("Not divisible");
        }
    }

}
