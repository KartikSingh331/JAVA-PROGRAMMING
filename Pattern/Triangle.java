package Pattern;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
//        for (int i=1;i<=m;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }
//        // NUMBER TRIANGLE
//
//        for (int i=1;i<=m;i++){
//            char ch='A';
//            for (int j=1;j<=i;j++){
//                System.out.print(ch+" ");
//                ch++;
//            }
//            System.out.println();
//        }

        System.out.println("ANOTHER BEAUTIFUL QUESTION");

        for (int i=1;i<=m;i++){
            char ch='A';
            for (int j=1;j<=i;j++){
                if (i%2!=0){
                    System.out.print(j+" ");
                }
                else {
                    System.out.print(ch+" ");
                    ch++;
                }

            }
            System.out.println();
        }
    }
}
