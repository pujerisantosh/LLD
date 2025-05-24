package dsa.collections;

import java.util.Arrays;

public class SortsubarraywithLeftandrightIndex {

    public static int[] solve(int[] a, int b , int c){

        // Copy the subarray to sort

        int[] subArray = Arrays.copyOfRange(a,b,c+1);
        Arrays.sort(subArray);

        // Copy the subarray to sort

        for (int i=b ;i<=c;i++){
            a[i] = subArray[i-b];

        }

        return a;
    }

    public static void main(String[] args) {

    }


}
