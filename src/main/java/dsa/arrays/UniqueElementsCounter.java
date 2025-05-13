package dsa.arrays;

import java.util.HashSet;
import java.util.Set;

public class UniqueElementsCounter {

    public static int solve(int[] a){

        Set<Integer> set = new HashSet<>();
        for (int num : a){
            set.add(num);
        }

        return set.size();
    }

    public static void main(String[] args) {
        int [] arr = {3, 4, 3, 6, 6};
        System.out.println(solve(arr));
    }
}
