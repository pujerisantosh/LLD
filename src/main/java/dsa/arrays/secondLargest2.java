package dsa.arrays;

public class secondLargest2 {

    public static int solve(int[] a){
        int n = a.length;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num  : a){

            if (num > max){
                secondMax = max;
                max = num ;
            } else if (num > secondMax && num != max) {
                secondMax = num;
                
            }

        }

        return secondMax;


    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4};
        System.out.println(solve(arr));
    }
}
