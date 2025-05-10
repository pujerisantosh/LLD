package dsa.sorting;

import java.util.Arrays;

public class AirthMaticProgression {

    public static int solve(int[] a){
        int n = a.length;

        Arrays.sort(a);
        int diff = a[1] - a[0];

        for (int i=2;i<n;i++){
            if (a[i]-a[i-1] != diff){
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int [] arr = {1,2};
        System.out.println(solve(arr));
    }
}
