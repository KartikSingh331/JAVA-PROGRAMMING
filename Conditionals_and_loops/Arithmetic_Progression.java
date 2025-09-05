package Conditionals_and_Loops;
import java.util.Scanner;
public class Arithmetic_Progression {
    public static void main(String[] args) {
        // print 4,7,10,13,.....upto n terms
        // then find an by formula
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
      /*  for (int i=4;i<=3*n+1;i+=3){
            System.out.println(i);
        }*/
        //OR
        int a=4;
        for (int i=1;i<=n;i++){
            System.out.println(a);
            a+=3;
        }
    }
}
