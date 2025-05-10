package dsa.sorting;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class ElementsRemoval {

    public static  int solve(int[] a){
        int n = a.length;
        int cost =0;
        Arrays.sort(a);
        for (int i=0;i<n;i++){
            cost += a[i] + n-1;

        }

        return  cost;
    }

    public static void main(String[] args) {
        int [] arr = {1,2};
        System.out.println(solve(arr));
    }
}
