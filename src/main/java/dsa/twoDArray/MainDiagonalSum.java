package dsa.twoDArray;

public class MainDiagonalSum {
    public static int solve(int[][] a){
        int n = a.length;
        int m = a[0].length;
        int sum =0;

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (i==j){
                    sum += a[i][j];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{ 1, -2 ,-3} , { -4, 5 ,-6} ,{-7 ,-8, 9}};
        System.out.println(solve(arr));
    }


}
