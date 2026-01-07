package dsa.arrays;

public class MaxOfBthRow {

    public static  int solve(int[][] a, int b){
        int n = a.length;
        int max = a[0].length;

        for (int j=0;j<a[b].length;j++){
            if (a[b][j] >max){
                max = a[b][j];

            }

        }

        return max;
    }

    public static void main(String[] args) {
        int [][] arr = {{1, 5, 3},
                {4, 8, 2},
                {7, 9, 6}};

        int b = 1;
        System.out.println(solve(arr,b));
    }
}
