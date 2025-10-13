package Arays;
public class IMP_Zero_one_two {
    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 1, 2, 0, 1, 1, 0, 1, 0, 2, 0,2,0,0};
        int n = arr.length;
//        int noz=0; int noo=0;
//        for (int i=0;i<n;i++){
//            if (arr[i]==0) noz++;
//            if (arr[i]==1) noo++;
//        }
//        for (int i=0;i<n;i++){
//            if (i<noz) arr[i]=0;
//            else if (i<noz+noo) arr[i]=1;
//            else arr[i] =2;
//        }
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
        //DUTCH FLAG ALGO VERY VERY IMPORTANT
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
//                int temp = arr[mid];
//                arr[mid] = arr[low];
//                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1)
                mid++;
            else {//arr[mid]==2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
        public static void swap(int[] arr, int low, int mid){
            int temp = arr[mid];
            arr[mid] = arr[low];
            arr[low] = temp;

        }

    }


