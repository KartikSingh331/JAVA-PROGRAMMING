package Arays;

import java.util.Arrays;

public class Copy_of_Array {
    public static void main(String[] args) {
        int[] arr={10,50,4,25,80};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] nums=arr;
        nums[0]=70; //shallow copy means value in first array is also changed as well as copied
        System.out.println(arr[0]);
   int[] rar= Arrays.copyOf(arr,arr.length);
   rar[0]=50;
   for (int i=0;i< arr.length;i++){
       System.out.print(arr[i]+" ");
   }
    }
}
