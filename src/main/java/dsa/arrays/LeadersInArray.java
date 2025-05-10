package dsa.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static List<Integer> solve(int[] a){
        List<Integer> leaders = new ArrayList<>();
        int n = a.length;
        int maxFromRight = a[n-1];

        leaders.add(maxFromRight);


        for (int i=n-2;i>=0;i--){

            if (a[i] > maxFromRight){
                maxFromRight = a[i];

                leaders.add(maxFromRight);
            }
        }

        Collections.reverse(leaders);

        return  leaders;
    }

    public static void main(String[] args) {
        int [] arr = {16, 17, 4, 3, 5, 2};

        System.out.println(solve(arr));
    }
}
