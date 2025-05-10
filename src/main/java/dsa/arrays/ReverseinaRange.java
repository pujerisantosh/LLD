package dsa.arrays;

import java.util.Arrays;

public class ReverseinaRange {
    public static int[] solve(int[] a, int b , int c ){
        int n = a.length;
        int left =b;
        int right = c;

        while (left <right){

            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }


        return a;
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 6};
        int b =0 ;
        int c = 2;
        System.out.println(Arrays.toString(solve(a,b,c)));
    }
}
