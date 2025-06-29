package velsera;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortZeroOne {

    public static int[] solve(int[] a){
        int zeroCount =0;
        for(int num : a){
            if (num==0){
                zeroCount++;
            }
        }

        for (int i=0;i<a.length;i++){
            if (i<zeroCount){
                a[i] =0;
            }
            else {
                a[i] =1;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int [] arr = {0, 0, 1, 0, 1, 1, 0};
        System.out.println(Arrays.toString(solve(arr)));
    }
}
