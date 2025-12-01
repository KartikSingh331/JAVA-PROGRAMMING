package Bubble_sort;
// upperbound condition arr[mid]>target, if element not found both lower and upper bound is same and for largest element
// also same
public class Upperbound {
    public static void main(String[] args) {
        int[] arr={10,24,45,56,85,97,120,157};
        int n=arr.length;
        int low=0;int high=n-1;
        int lb=n;
        int target=55;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]>target){
                lb=mid;
                high=mid-1;
                
            }
            else low=mid+1;
        }
        System.out.println(lb);
    }
}

