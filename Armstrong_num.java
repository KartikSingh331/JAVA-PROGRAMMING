package Self_practise;
import java.util.*;
public class Armstrong_num {
    public static int armstrong(int n){
        int num=String.valueOf(n).length();
        int result=0;
        while(n!=0){
            int r=n%10;
            result += Math.pow(r,num);
            n=n/10;
        }
        return result;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
       int sum=armstrong(n);
        System.out.println(sum);
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }

    }
}
