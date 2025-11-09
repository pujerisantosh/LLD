package dsa.arrays;

import java.util.Arrays;

public class MatrixTranspose {
    public static int[][]  solve(int[][] a){
        int n = a.length;
        int m = a[0].length;

        int[][] arr = new int[n][m];

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[j][i] = a[i][j];
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int [][] res = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int [][] ans = solve(res);
        System.out.println(Arrays.toString(ans));


    }
}
