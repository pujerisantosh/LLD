package dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static List<Integer> solve(int[] a , int[] b){

        int i=0,j=0;
        int n = a.length, m=b.length;

        List<Integer> result = new ArrayList<>();

        while (i<n && j<m){
            if (a[i]<b[j]){
                result.add(a[i]);
                i++;
            }
        }

        while (i<n){
            result.add(a[i]);
        }

        while (j<m){
            result.add(b[j]);
        }

        return result;
    }

    public static void main(String[] args) {
      int []  A = {4, 7, 9};
       int []  B = {2, 11, 19};
        System.out.println(solve(A,B));
    }

}
