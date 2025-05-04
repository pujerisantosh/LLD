package dsa.arrays;

import java.util.Arrays;

public class RotateMatrix90 {
    public static int[][] solve(int[][] A){


        // transpose matrix
        int n = A.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                int temp = A[i][j];

                A[i][j] = A[j][i];
                A[j][i] = temp;

            }
        }

        //Reverse Matrix

        for (int i=0;i<n;i++) {
            int left = 0;
            int right = n - 1;
            while(left < right) {
                int temp = A[i][right];
                A[i][right] = A[i][left];
                A[i][left] = temp;
                left++;
                right--;
            }

        }
        return A;


    }

    public static void main(String[] args) {
        int [][] arr = {{1, 2},{3, 4}};
        for (int[] row : solve(arr)) {
            System.out.println(Arrays.toString(row));
        }
    }

}
