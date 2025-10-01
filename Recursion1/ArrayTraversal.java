package Recursion;
import java.util.*;
public class ArrayTraversal {
    public static void print(int i,int[] arr){
        if (i==arr.length) return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter the "+i+" elements: ");
             arr[i]=sc.nextInt();
        }
        System.out.println("Yours array is: ");
        print(0,arr);
    }
}
