package Conditionals_and_Loops;

import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a number: ");
        int n= sc.nextInt();
        System.out.println((n%2==0)? "Even":"Odd");


}
}