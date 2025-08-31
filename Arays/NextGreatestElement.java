package Arays;
import java.util.Scanner;
public class NextGreatestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 54, 81, 64};
        int n = arr.length;
        int[] arr2 = new int[n];
        // METHOD-1 BRUTE FORCE(BEKAR METHOD YA PURI MEHNAT LGA DO BINA SOCHE SMJHE)
//    }

//        METHOD-2 OPTIMIZED METHOD
        int nge=arr[n-1];
        for (int i=n-2;i>=0;i--){
            arr2[i]=nge;
            nge=Math.max(nge,arr[i]);
        }
        for (int ele:arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
        for (int ele:arr2) {
            System.out.print(ele+" ");

        }
    }
}
