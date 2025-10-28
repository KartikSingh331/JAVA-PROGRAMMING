package TWO_D_ARRAY;

public class Transpose_of_matrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int m= arr.length;
        int n=arr[0].length;
        int[][] tra=new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                tra[i][j]=arr[j][i];
//                System.out.print(tra[i][j]+" ");
//
//            }
//            System.out.println();
//        }

        //   METHOD 2
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                tra[j][i]=arr[i][j];
            }
        }
        for (int j = 0; j <m ; j++) {
            for (int i = 0; i <n ; i++) {
                System.out.print(tra[j][i]+" ");
            }
            System.out.println();
        }
    }
}
