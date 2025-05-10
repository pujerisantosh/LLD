package dsa.arrays;

public class MinimumSwaps {

    public static int solve(int[] a, int b){

        int n = a.length;

        // Step 1: Count elements <= B

        int count =0;

        for (int num : a){

            if (num <= b){
                count++;
            }
        }

        // Step 2: Initialize the first window

        int good =0;
        for (int i=0;i<count ; i++){

            if (a[i] <= b){
                good++;
            }
        }

        // Step 3: Slide the window

        int maxGood  = good;
        for (int i = count; i< n; i++){

            if (a[i-count] <= b){
                good--;
            }

            if (a[i] <= b){
                good++;

            }

            maxGood = Math.max(maxGood, good);
        }

        return  count-maxGood;
    }

    public static void main(String[] args) {
        int [] arr = {1, 12, 10, 3, 14, 10, 5};
        int b = 8;
        System.out.println(solve(arr,b));
    }
}
