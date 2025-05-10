package dsa.arrays;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubarrays {
    public  static  int solve(int[] a){
        int n = a.length;
        Set<Integer> st = new HashSet<>();
        int left =0;
        int count =0;
        int mod = 1000000007;

        for (int right =0; right<n ; right++){
            while(st.contains(a[right])){

                st.remove(a[left]);
                left++;

            }

            st.add(a[right]);
            count += (right -left+1);
        }


        return (int) (count%mod);


    }

    public static void main(String[] args) {
        int [] arr = {2, 1, 2};
        System.out.println(solve(arr));
    }
}
