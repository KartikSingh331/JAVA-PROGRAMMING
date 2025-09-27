package Pattern;
import java.util.Scanner;
public class Composite_StarBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int a=1;a<=2*m-1;a++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        m--;
      for (int i=1;i<=m;i++){
          for (int k=m;k>=i;k--) {
              System.out.print("*" + " ");
          }

  for (int j=1;j<=2*i-1;j++){
      System.out.print(" "+" ");
  }
          for (int k=m;k>=i;k--) {
              System.out.print("*" + " ");
          }
          System.out.println();
      }

    }
}
