package dsa.arrays;

public class MinelemeninMatrix {
    public static int solve(int[][] a){
        int n = a.length;
        int m = a[0].length;

        int min = Integer.MAX_VALUE;

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (a[i][j]< min){
                    min = a[i][j];
                }
            }

        }

        return min;

    }

    public static void main(String[] args) {
        int [][] arr = {{7,2,3,4},
                {5,6,1,8},
                {9,2,3,4}};

       int  res = solve(arr);

        System.out.println(res);



    }
}
