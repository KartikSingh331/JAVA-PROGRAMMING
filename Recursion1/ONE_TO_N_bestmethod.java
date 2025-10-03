package Recursion;
import java.util.Scanner;
public class ONE_TO_N_bestmethod {
    public static void  toone(int n){
        if (n==0) return ; //base case
        toone(n-1); //call
        System.out.println(n); //work
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n= sc.nextInt();
        toone(n);
    }
}
