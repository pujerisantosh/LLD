package practingproblems;

import java.util.Arrays;

public class ArithmeticProgression {
    public static int solve(int[] a){
        Arrays.sort(a);
        int ap = a[1]-a[0];
        for (int i=2;i<a.length;i++){
            if (ap != a[i]-a[i-1]){
                return 0;
            }
        }
        return 1;
    }
}
