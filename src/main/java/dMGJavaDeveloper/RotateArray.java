package dMGJavaDeveloper;

import java.util.Arrays;

public class RotateArray {

    public void solve(int[] num,int k){
        int n = num.length;

        k = k%n;


        reverse(num, 0,n-1);
        reverse(num, 0,k-1);
        reverse(num,k,n-1);





    }

    private void reverse(int[] num, int left, int right) {
        while (left < right){
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;
            left++;
            right--;

        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7}; int k = 3;
        RotateArray obj = new RotateArray();
        obj.solve(nums, k);
        System.out.println(Arrays.toString(nums));

    }


}
