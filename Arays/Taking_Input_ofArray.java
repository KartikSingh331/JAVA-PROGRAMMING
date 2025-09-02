package Arays;
import java.util.Scanner;
public class Taking_Input_ofArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for (int i=0;i<=n-1;i++){
            arr[i]= sc.nextInt();
        }
        for (int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
