package Recursion;

import java.util.ArrayList;

public class Subset_of_integer {
    public static void printsub(int i,int[] arr,String s){
        if (i==arr.length){
            System.out.println(s);
            return;
        }

        printsub(i+1,arr,s+arr[i]+" ");
        printsub(i+1,arr,s);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        printsub(0,arr,"");

    }
}
