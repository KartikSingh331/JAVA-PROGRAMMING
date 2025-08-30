package Arays;
import java.util.Scanner;
public class Linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements of array");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Enter the key element");
        int x= sc.nextInt();
        boolean flag=false;
        for (int i=0;i<n;i++){
            if (a[i]==x)
                flag=true;
            break;
        }
    if (flag ==true) System.out.println("Element found");
    else System.out.println("Element not found");
    }

}
