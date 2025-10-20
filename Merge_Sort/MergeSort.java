package MergeSort;
import java.util.*;
public class MergeSort {
    //Second call
    public static void mergesorting(int[] a,int[] b,int[] arr) {
        int i=0,j=0,k=0;
        while (i<a.length && j<b.length){
            if (a[i]<=b[j]) arr[k++]=a[i++];
            else arr[k++]=b[j++];
        }
        while (j<b.length)  arr[k++]=b[j++];
        while (i<a.length)  arr[k++]=a[i++];
    }
  
    // First call 
 public static void mergesort(int[] arr){

        int n=arr.length;
        if (n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        // copy pasting
        for (int i=0;i<n/2;i++){
            a[i]=arr[i];
        }
        for (int i=0;i<n-n/2;i++){
            b[i]=arr[i+n/2];
        }
        mergesort(a);
        mergesort(b);
        mergesorting(a,b,arr);
    }
    public static void main(String[] args) {
        int[] arr={10,55,25,30,87,95,78};
        for (int ele:arr) {
            System.out.print(ele+" ");

        }
        System.out.println();
        mergesort(arr);
        for (int ele:arr) {
            System.out.print(ele+" ");

        }
    }
}

