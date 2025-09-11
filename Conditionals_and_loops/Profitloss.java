package Conditionals_and_Loops;
import java.util.Scanner;
public class Profitloss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Cost Price");
        int CP=sc.nextInt();
        System.out.println("Enter Selling Price");
        int SP=sc.nextInt();
        if(SP>CP){
            System.out.println("Profit is "+(SP-CP));
        } else if (SP<CP) {
            System.out.println("LOSS is 555"+(CP-SP));
        }
        else {
            System.out.println("Nor Profit nor Loss");
        }
    }
}
