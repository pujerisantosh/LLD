package practingproblems;

import java.util.Arrays;

public class minCostToRemoveAll {
    public static int[] solve(int[] a){
        Arrays.sort(a);
        int totalCost =0;
        int currentSum =0;

        for (int i=0; i<a.length;i++){
            currentSum += a[i];
            totalCost += currentSum;
        }
        return new int[]{totalCost};
    }

    public static void main(String[] args) {
        int[] res = {1,2};
        System.out.println(Arrays.toString(solve(solve(res))));
    }
}
