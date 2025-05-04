package dsa.arrays;

public class MaxofjthColumn {
    public static int solve(int[][] a, int B){
        int n = a.length;
        int m = a[0].length;
        int max = Integer.MIN_VALUE;

        for (int i=0;i<a.length;i++){
            if (a[i][B] > max){
                max = a[i][B];
            }

        }
        return  max;
    }

    public static void main(String[] args) {
        int [][] arr = {{12, 65 ,89, 74},{22 ,44, 12, 30},{10 ,12, 97, 19}};
        int B  = 0;
        System.out.println(solve(arr,B));
    }


}
