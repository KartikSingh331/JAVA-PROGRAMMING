package Arays;

public class Maximum_array {
    public static void main(String[] args) {
        int[] arr={4,5,85,97,41,105,-87};
        int n= arr.length;
        int mx= Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
         //  if (arr[i]>mx)     mx=arr[i];
            mx= Math.max(mx,arr[i]);

        }
        System.out.println(mx);
    }
}
