package Arays;

import java.util.*;
public class builtin_method {
    public static void main(String[] args) {
        int[] arr={10,5,2,74,50};
//        for (int ele:arr){
//            System.out.print(ele+" ");
//        }                          //for each method for array
        for (int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }

        }
}
