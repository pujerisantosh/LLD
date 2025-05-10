package dsa.twoDArray;

import java.util.Arrays;

public class ColumnSum {
    public static int[] solve(int [][] arr ){

        int n = arr.length;
        int m = arr[0].length;

        int [] res = new int [m];

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){

                res[i] += arr[j][i];
            }
        }

        return res;


    }

    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,2,3,4}};
        System.out.println(Arrays.toString(solve(arr)));
    }
}
