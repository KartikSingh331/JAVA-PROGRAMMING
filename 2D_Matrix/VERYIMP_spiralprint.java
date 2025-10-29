package TWO_D_ARRAY;

public class VERYIMP_spiralprint {
    public static void print(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3,41,72},{4,5,6,25,34},{7,8,9,78,95},{5,6,78,87,99}};
        int m= arr.length;
        int n=arr[0].length;
        print(arr);
        //spiral print
        int minr=0, maxr=m-1;
        int minc=0, maxc=n-1;
        //left to right
        while (minr<=maxr && minc<=maxc){
            for (int j=minc;j<=maxc;j++){
                System.out.print(arr[minr][j]+" ");
            }
            minr++;
            if(minr>maxr || minc>maxc) break;
            // top to bottom
            for (int i=minr;i<=maxr;i++){
                System.out.print(arr[i][maxc]+" ");
            }
            maxc--;
            if(minr>maxr || minc>maxc) break;
            // right to left
            for (int j=maxc;j>=minc;j--){
                System.out.print(arr[maxr][j]+" ");
            }
            maxr--;
            if(minr>maxr || minc>maxc) break;
            // bottom to top
            for (int i=maxr;i>=minr;i--){
                System.out.print(arr[i][minc]+" ");
            }
            minc++;
        }

    }
}