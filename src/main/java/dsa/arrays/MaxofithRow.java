package dsa.arrays;

public class MaxofithRow {
    public static int solve(int[][] A,int B){
        int n = A.length;
        int m = A[0].length;

        int max = Integer.MIN_VALUE;

        for (int j=0;j<m;j++){
            if (A[B][j] > max){
                max = A[B][j];
            }

        }

        return max;
    }

    public static void main(String[] args) {
        int [][] arr = {{12, 65, 89, 74},{22, 44, 12, 30},{10, 12, 97, 19}};
        int B = 2;
        System.out.println(solve(arr,B));
    }


}
