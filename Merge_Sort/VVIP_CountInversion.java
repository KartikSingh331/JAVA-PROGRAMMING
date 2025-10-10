package MergeSort;

public class VVIP_CountInversion {
static int count;
    public static void mergesorting(int[] a,int[] b,int[] arr) {
        int i=0,j=0,k=0;
        while (i<a.length && j<b.length){
            if (a[i]<=b[j]) arr[k++]=a[i++];
            else {
                count+=(a.length-i);  //chahe aise kro ya inversion function bna kai kro kyuki condition a[i]>b[j] hota h
                arr[k++]=b[j++];
            }
        }
        while (j<b.length)  arr[k++]=b[j++];
        while (i<a.length)  arr[k++]=a[i++];
    }
//    public static void inversion(int[] a,int[] b){
//        int i=0, j=0;
//        while (i<a.length && j<b.length){
//            if (a[i]>b[j]){
//                 count += (a.length-i);
//                 j++;
//            }
//            else i++;
//        }
//    }
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
       // inversion(a,b);
        mergesorting(a,b,arr);
    }
    public static void main(String[] args) {
        int[] arr = {109,33,89,27,60,10,70};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        mergesort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println(count);
    }
}
