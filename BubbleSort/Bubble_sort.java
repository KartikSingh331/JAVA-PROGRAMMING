package Bubble_sort;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr={15,17,25,52,120,458};
        int n= arr.length;
        int low=0;int high=n-1;
        int key=52;
        boolean flag=false; //false means not present
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]<key){
                low=mid+1;
            }
            else if (arr[mid]>key) {
                high=mid-1;
            }
            else if(arr[mid]==key) {
                flag=true;
                break;
            }
        }
        if (flag=true) System.out.println("element is found");
        else System.out.println("element not found");
    }
}
