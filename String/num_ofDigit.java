package String;
import java.util.Scanner;
public class num_ofDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        String s=""+n;
//        String s= Integer.toString(n); Other way to make or count number to string
//        System.out.print(s);
        System.out.println(s.length());

    }
}
