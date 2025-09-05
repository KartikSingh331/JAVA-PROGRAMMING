package Conditionals_and_Loops;
import java.util.*;
public class Digit_counting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=0;
        // FOR COUNTING DIGIT
       /* while (n!=0){
            n=n/10;
            d++;
        }
        System.out.println(d);  */

        //  FOR PRINTING THE SUM OF DIGIT
        int r,sum=0;
        while(n!=0){
            r=n%10;
            sum+=r;
            n=n/10;
        }
        System.out.println(sum);

    }
}
