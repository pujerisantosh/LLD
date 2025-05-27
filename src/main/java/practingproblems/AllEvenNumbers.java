package practingproblems;

import java.util.Arrays;

public class AllEvenNumbers {
    public static int[] solve(int[] a){
        int count =0;
        for (int i=0;i<a.length;i++){
            if (a[i]%2==0){
                    count ++;
            }
        }

        int [] even = new int[count];int index =0;

        for (int i=0;i<count;i++){
            if (a[i]%2==0){
                even[index] = a[i];
                index++;
            }

        }

        return even;
    }

    public static void main(String[] args) {
        int [] arr = {1,2 ,3,4,5};
        System.out.println(Arrays.toString(solve(arr)));
    }
}
