package TWO_D_ARRAY;

public class Array_of_ARRAYLIST {
    public static void main(String[] args) {
        int[] a={1,2,3};
        for (int ele:a) {
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println();
        int[][] b={{1,2,3},{4,5,6}};
        for (int[] ele:b){
            for (int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
