import java.util.*;
//public class HCF {
//    public static int hcf(int a, int b){
//        for(int i=Math.min(a,b);i>=1;i--){
//            if (a%i==0 && b%i==0) return i;
//        }
//        return 1;
//    }

    public static int gcb(int a, int b){
         if(b%a==0) return a;
         return gcb(b%a,a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
       // System.out.println(hcf(a,b));
        System.out.println(gcb(a,b));
    }

