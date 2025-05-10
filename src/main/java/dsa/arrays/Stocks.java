package dsa.arrays;

public class Stocks {
    public static int solve(int[] a) {

        int n = a.length;
        int minPrice = a[0];
        int maxprofit = 0;

        for (int i = 1; i < n; i++) {
            if (a[i] < minPrice) {

                minPrice = a[i];

            } else {
                int profit = a[i] - minPrice;
                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }

        return maxprofit;
    }

    public static void main(String[] args) {

        int [] arr = {1,2};
        System.out.println(solve(arr));
    }
}