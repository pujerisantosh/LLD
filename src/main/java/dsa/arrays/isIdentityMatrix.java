package dsa.arrays;

public class isIdentityMatrix {

    public static int solve(int[][] A){
        int n = A.length;

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){

                if (i==j && A[i][j]!= 1) return 0;
                if (i != j && A[i][j] != 0) return 0;

            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int [][] arr  = {{1, 0},{0, 1}};
        System.out.println(solve(arr));
    }
}
