package String;

import java.util.Scanner;

public class convert_int_to_sring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a number: ");
        int n=sc.nextInt();
        String s="";
        s=s+n;
        System.out.println(s);
    }
}
