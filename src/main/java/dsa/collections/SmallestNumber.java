package dsa.collections;

import java.util.Arrays;

public class SmallestNumber {

    public static int[] solve(int[] a){

        int n = a.length;

        Arrays.sort(a);

        return a;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 4, 2, 7, 2, 1};
        System.out.println(Arrays.toString(solve(arr)));
    }
}
