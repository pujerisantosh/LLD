package practingproblems;

import java.util.Arrays;

public class RowMaxValues {

    public static int[] solve(int [][] a){
        int n = a.length;
        int m  = a[0].length;

        int[] result = new int[n];

        for (int i=0; i<n;i++){
            int max = a[i][0];
            for (int j=1;j<m;j++){
                if (a[i][j] > max){
                    max = a[i][j];
                }
            }

            result[i] = max;
        }

        return result;
    }
    public static void main(String[] args) {
        int[][] res = {{2,4},{5,1}};
        System.out.print(Arrays.toString(solve(res)));



    }
}
