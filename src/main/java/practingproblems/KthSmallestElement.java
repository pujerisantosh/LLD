package practingproblems;

import java.util.Arrays;

public class KthSmallestElement {
    public static int solve(int[] a, int b){
        Arrays.sort(a);
        return a[b-1];
    }

    public static void main(String[] args) {
        int [] res = {2, 1, 4, 3, 2};
        int k = 3;
        System.out.println(solve(res,k));
    }
}
