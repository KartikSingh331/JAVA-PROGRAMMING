package Sorting;

public class InsertionSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int a, int b, int[] arr) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, -1, 2, 1};
        int n = arr.length;
        System.out.println("Original Array ");
        print(arr);
        for (int i = 1; i < n; i++) {
//            for (int j=i;j>=1;j--){
//                if (arr[j]<arr[j-1]){
//                    swap(j,j-1,arr);
//                }
//                else
//                    break;
//            }
//       }

            //   ALSO DONE BY USING WHILE LOOP
            int j = i;
            while (j >= 1 && arr[j] < arr[j - 1]) {
                swap(j, j - 1, arr);
                j--;
            }
            System.out.println("Step wise solution "+i);
            print(arr);
        }
        System.out.println("Sorted Array");
        print(arr);
    }
}
