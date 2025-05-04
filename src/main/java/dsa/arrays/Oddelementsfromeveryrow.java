package dsa.arrays;

import java.util.ArrayList;

public class Oddelementsfromeveryrow {

    public static int solve(int[][] A){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = A.length;
        int m  = A[0].length;

        for (int i=0;i<n;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for (int j=0;j<m;j++){
                if (A[i][j]%2==1){
                    row.add(A[i][j]);

                }
            }
        }
        return n;
    }
}
