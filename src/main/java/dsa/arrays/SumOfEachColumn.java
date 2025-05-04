package dsa.arrays;

import java.util.Arrays;

public class SumOfEachColumn {

    public static int [] solve(int [][] A){
        int row = A.length;
        int col = A[0].length;
        int [] res = new int[col];

        for (int j=0;j<col;j++){
            int sum =0;
            for (int i=0;i<row;i++){
                sum  += A[i][j];

            }
            res[j] = sum ;
        }

        return  res;



    }

    public static void main(String[] args) {
        int [][] arr = {{12, 65, 89, 74},
                {22, 44, 12, 30},
                {10, 12, 97, 19}};
        int [] res = solve(arr);

        System.out.println(Arrays.toString(res));
    }
}
