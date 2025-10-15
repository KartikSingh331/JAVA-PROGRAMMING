package Sorting;
public class TransformArray {
    public static void print(int[] arr){
        for (int ele:arr) {
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
       int[] arr={55,1,18,65,24,15,87,5};
       print(arr);
       int n= arr.length;
       int x=0;
       for (int i=0;i<n;i++){
           int min=Integer.MAX_VALUE;
           int mindx=-1;
           for (int j=0;j<n;j++) {
               if (arr[j] < min && arr[j] > 0) {
                   min = arr[j];
                   mindx = j;
               }
           }
           arr[mindx]=x;
           x--;
       }
        System.out.println();
       for(int i=0;i<n;i++){
           arr[i]=arr[i]*-1;
       }
       print(arr);
    }
}
