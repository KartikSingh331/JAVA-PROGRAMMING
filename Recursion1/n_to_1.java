package Recursion;
import java.util.Scanner;
public class n_to_1 {
    public static void toone(int n){
        if (n==0) return ; //base value
        System.out.println(n); //work
        toone(n-1); // call
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n= sc.nextInt();
        toone(n);
    }
}

