package Self_practise;
import java.util.Scanner;
public class Fibonaci_Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n= sc.nextInt();
        int f0=0,f1=1,f2;
        for(int i=0;i<=n-1;i++){

            f2=f0+f1;
            System.out.println(f0);
            f0=f1;
            f1=f2;

        }
    }
}
