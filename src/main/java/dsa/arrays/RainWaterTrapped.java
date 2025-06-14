package dsa.arrays;

public class RainWaterTrapped {
    public static int solve(int[] a){


        int n = a.length;
        if(n<=2) return 0;

        int[] lefMax = new int[n];
        int[] rightMax = new int[n];

        // Compute left max for every index

        lefMax[0] = a[0];

        for (int i=1;i<n;i++){

            lefMax[i] = Math.max(lefMax[i-1],a[i]);


        }


        // Compute right max for every index

        rightMax[n-1] = a[n-1];

        for (int i=n-2;i>=0;i--){

            rightMax[i] = Math.max(rightMax[i+1],a[i]);
        }

// Calculate water trapped

        int totawWater =0;
        for (int i=0;i<n;i++) {

            int water = Math.min(lefMax[i], rightMax[i])-a[i];
            if (water > 0) totawWater += water;
        }

        return totawWater;
    }

    public static void main(String[] args) {
        int [] arr = {0, 1, 0, 2};

        System.out.println(solve(arr));

    }
}
