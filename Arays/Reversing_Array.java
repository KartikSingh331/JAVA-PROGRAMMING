package Arays;

public class Reversing_Array {
    public static void main(String[] args) {
        int[] arr = {5, 25, 48, 22, 10, 67, 8};
        int n = arr.length;

             for (int i=0;i<n;i++){
               System.out.print(arr[i]+" ");
         }
        //REVERSING AN ARRAY

       for (int i=0;i<n/2;i++){
            int j=n-1-i;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        // (or)
        // USING TWO POINTER REVERSING
       /* int k=0;
        int m=n-1;
        while (k<=m) {
            int temp = arr[k];
            arr[k]=arr[m];
            arr[m]=temp;
            k++;
            m--;
        }*/
        System.out.println();
        for (int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
