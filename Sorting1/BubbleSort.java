package Sorting;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        int n = arr.length;
        System.out.println("Original Array");
     print(arr);
        System.out.println();
        //Bubble sort-1
       /* for (int i=0;i<n-1;i++) {
            for (int j =0; j < n - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(j,j+1, arr);
                }
            }
        } */

        //BUBBLE SORT_2
     /*   for (int i=0;i<n-1;i++) {
            for (int j =0; j < n -i- 1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(j,j+1, arr);
                }
            }
        }
         */

        //BUBBLE SORT_OPTIMISED
        for (int i=0;i<n-1;i++) {
            boolean flag=true;
            for (int j =0; j < n - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(j,j+1, arr);
                    flag=false;
                }
            }
            if (flag==true) break;
        }
        System.out.println("Sorted Array");
       print(arr);
    }
        public static void swap(int i, int j,int[] arr){
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

    }
    public static void print(int[] arr){
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
