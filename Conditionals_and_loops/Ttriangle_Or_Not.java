package Conditionals_and_Loops;
import java.util.Scanner;
public class Ttriangle_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input side a: ");
        int a=sc.nextInt();
        System.out.print("Input side b: ");
        int b=sc.nextInt();
        System.out.print("Input side c: ");
        int c=sc.nextInt();
        if(a+b>c &&b+c>a &&c+b>a){
            System.out.println("triangle");
        }
        else {
            System.out.println("Not triangle");
        }
//        System.out.println((a+b>c &&b+c>a &&c+b>a)?"Triangle":"Not Triangle");
    //also done by if else

    }
}