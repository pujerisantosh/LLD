package dsa.sorting;

import java.util.Arrays;

public class kthsmallest {
    public static int solve(int[] a,int b){
        int n = a.length;
        Arrays.sort(a);
        return a[b-n];

    }

    public static void main(String[] args) {
        int []  arr = {2, 1, 4, 3, 2};
        int b = 6;
        System.out.println(solve(arr,b));
    }


}
