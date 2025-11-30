
package Pattern;
import java.util.Scanner;
public class Advance_starplus {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        
        for (int i=1;i<=m;i++){
            int mid=m/2+1;
            for (int j=1;j<=m;j++){
                if (i==mid||j==mid){
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}



