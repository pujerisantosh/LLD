package dsa.collections;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static int[] solve(int[] a, int[] b){
        int n = a.length;
        int m = b.length;

        int[] merged = new int[n+m];

        int i=0 , j=0,k=0;

        // Merge two sorted arrays
        while (i<n && j<m){
            if (a[i] < b[j]){
                merged[k++] = a[i++];
            }
            else {
                merged[k++] = b[j++];
            }

        }
        // Copy remaining elements of A

        while (i<n){
            merged[k++] = a[i++];
        }

        // Copy remaining elements of B
        while (j<m){
            merged[k++] = b[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int [] a = {4, 7, 9};
        int [] b = {2, 11, 19};
        System.out.println(Arrays.toString(solve(a,b)));
    }
}
