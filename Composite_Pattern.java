package Pattern;
import java.util.Scanner;
public class Composite_Pattern {
    public static void main(String[] args) {

        for (int i=1;i<=4;i++){
            for (int j=1;j<=4-i;j++){   //for(int j=3;j>=i;j--){
                System.out.print(" "+" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
