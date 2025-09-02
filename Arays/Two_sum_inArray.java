package Arays;

public class Two_sum_inArray {
    public static void main(String[] args) {
        int[] arr={5,4,7,8,3,1};
        //Sum of any two element is 9
        int x=9;
        for (int i=0;i< arr.length;i++){
           for (int j=i+1;j<arr.length;j++){
               if (arr[i]+arr[j]==x) {
                   System.out.print(arr[i] + " " + arr[j]);
                   System.out.println();
               }
           }

        }

    }
}
