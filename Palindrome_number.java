package Basic_Programs;
import java.util.*;
public class Palindrome_number {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a=sc.nextInt();
        int rev=0;
        int r;
        int temp=a;
        while(a>0){
            r=a%10;
            rev=rev*10+r;
            a=a/10;
        }
        if (rev==temp) System.out.println(temp+ " is palindrome number");
        else System.out.println(temp+" is not Palindrome number");
    }
}
