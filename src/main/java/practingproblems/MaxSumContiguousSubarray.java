package practingproblems;

public class MaxSumContiguousSubarray {

    public static int solve(int[] a){
        int maxSum =a[0];
        int currenrSum = a[0];

        for (int i=1;i<a.length;i++){
            currenrSum = Math.max(a[i], currenrSum+a[i]);
            maxSum = Math.max(currenrSum,maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, -10};
        System.out.println(solve(arr));


    }
}
