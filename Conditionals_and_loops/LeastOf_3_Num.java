package Conditionals_and_Loops;
import java.util.Scanner;
public class LeastOf_3_Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the three Numbers: ");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
  if (a<=b && a<=c){
      System.out.println("a is smallest");
  } else if (b<=a &&b<=c) {
      System.out.println("b is smallest");
  }
  else {
      System.out.println("c is smallest");
  }
    }
}
