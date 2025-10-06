import java.util.Scanner;
public class ASCIII {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0); //for taking character as a input
        System.out.println((int)ch);  //Typecasting
    }
}
