package dsa.arrays;

public class SubarraySumTotal {

    public static long solve(int[] a){

        int n = a.length;
        long sum =0L;

        for (int i=0;i<n;i++){

            long contribution = (long) a[i] * (i+1)+ (n-i);
            sum += contribution;
        }

        return sum;
    }

    public static void main(String[] args) {

        int [] arr = {2, 1, 3};
        System.out.println(solve(arr));

    }
}
