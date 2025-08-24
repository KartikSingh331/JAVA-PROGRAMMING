package Arays;

public class Basic_Array {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 83;
        arr[1] = 74;
        arr[2] = 39;
        arr[3] = 44;
        arr[4] = 38;
        System.out.println(arr[1]);
        arr[1] = 23;// on changing
        System.out.println(arr[1]);
        arr[1] += 12;
        System.out.println(arr[1]);
    }
}
