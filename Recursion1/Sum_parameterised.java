package Recursion;
import java.util.Scanner;
public class Sum_parameterised {
    public static void sum(int n, int s){
        if(n==0){    //base condition
            System.out.println("Sum is : "+s);
            return;
        }
        sum(n-1,s+n);  //call and work
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n= sc.nextInt();
        sum(n,0);
    }
}
