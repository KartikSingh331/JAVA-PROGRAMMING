package TWO_D_ARRAY;

public class ADD_TWO_MATRIX {
    public static void main(String[] args) {
        int[][] a={{5,7,8},{78,85,96}};
        int[][] b={{8,2,1},{5,6,3}};
        int m=a.length;
        int n=b[0].length;
        int[][] res=new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    res[i][j] = a[i][j] + b[i][j];
                }
            }

            for (int i = 0; i <m ; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


