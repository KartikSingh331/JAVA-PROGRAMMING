package Conditionals_and_Loops;
import java.util.Scanner;
public class Prime_Composite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int x=0;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                System.out.println("Compsite number");
                x=1;
                break;
            }
        }
        if(n==1) System.out.println("Neither Prime Number  Nor Composite");
        if(x==0) System.out.println("Prime Number");
    }
}
