package Shradhamaam_pdf;
import java.util.*;
public class _1_Max_or_min_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the order of array: ");
        int n=sc.nextInt();
        System.out.print("Enter the elements of array : ");
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // for maximum value
        int mx=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i]>mx)
                mx=arr[i];
        }
        // for minimum  value



    }
}
