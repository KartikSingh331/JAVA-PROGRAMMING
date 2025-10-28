package TWO_D_ARRAY;

public class SumOF_ELEMENTS {
    public static void main(String[] args) {
        int[][] arr={{1,5,-7},{55,44,7},{87,4,100}};
        int m= arr.length;
        int n= arr[0].length;
        int sum=0;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
