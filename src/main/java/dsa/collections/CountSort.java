package dsa.collections;

public class CountSort {
    public int[] solve(int[] a){

        int n = a.length;
        int maxValue =0;

        // Find the maximum value to determine the size of count array

        for (int num : a){
            if (num > maxValue){
                maxValue = num ;
            }
        }

        // Create and populate the count array

        int [] count = new int [maxValue+1];
        for (int num : a){
            count[num]++;
        }

        // Build the sorted array

        int [] result = new int[n];

        int index =0;
        for (int i=0;i<=maxValue;i++){
            while (count[i] > 0){
                result[index++] = i;
                count[i]--;
            }

        }

        return result;

    }
}
