package Arays;

public class Pasingvaluetoanarray {
    public static void main(String[] args) {
      int[] arr={10,15,20,25,30,32};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    private static void change(int[] arr) {
        arr[0]=12;
    }
}
