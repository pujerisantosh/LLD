package dsa.arrays;

public class SubarrayWithGivenSum {
    public static int solve(int[] a, int b, int c){

        int n = a.length;


        // Step 1: Get sum of first B elements

        int sum =0;
        for (int i=0;i<b;i++){
            sum += a[i];
        }

        if (sum == c) return 1;

        // Step 2: Slide the window

        for (int i=b;i<n;i++){
            sum += a[i] - a[i-b];

            if (sum ==c) return 1;
        }

        return 0;


    }

    public static void main(String[] args) {
        int [] arr = {4, 3, 2, 6, 1};
        int b = 3;
        int c =11 ;
        System.out.println(solve(arr,b,c));
    }
}
