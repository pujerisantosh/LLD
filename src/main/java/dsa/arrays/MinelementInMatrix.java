package dsa.arrays;

public class MinelementInMatrix {

    public static int solve(int[][] A){
        int n = A.length;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            for (int j=0;j<A[i].length;j++){
                if (A[i][j] < min){
                    min = A[i][j];
                }
            }
        }

        return min;
    }

    public static void main(String[] args) {

        int [][] arr = {{7,2,3,4},{},{5,6,1,8},{9,2,3,4}};
        System.out.println(solve(arr));
    }
}
