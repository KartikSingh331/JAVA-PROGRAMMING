package Shradhamaam_pdf;

public class _2_Reverse_array {
    public static void main(String[] args) {
int []arr={5,8,7,87,9,68};
int n=arr.length;
for (int i=0;i<n/2;i++){
    int j=n-1-i;
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
    System.out.println("Reverse of array is :");
for (int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}
    }
}

