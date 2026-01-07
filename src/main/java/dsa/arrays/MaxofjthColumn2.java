package dsa.arrays;

public class MaxofjthColumn2 {

    public  static int solve(int[][] a, int b){
        int n = a.length;
        int m = a[0].length;

        int max = Integer.MIN_VALUE;

        for (int i=0;i<n;i++){

            if (a[i][b] > max){
                max = a[i][b];
            }
        }

        return max;

    }



}
