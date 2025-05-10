package dsa.arrays;

public class SecondLargest {
    public static int solve(int[] a){
        int n = a.length;
        int firstLargest = Integer.MIN_VALUE;
        int seccondLargest = Integer.MIN_VALUE;

        for (int num : a){

            if (num > firstLargest){
                firstLargest = num ;
                seccondLargest = firstLargest;
            } else if (num < firstLargest && num > seccondLargest) {

                seccondLargest = num ;
                
            }
        }

        return  seccondLargest == Integer.MIN_VALUE ? -1: seccondLargest;

    }

    public static void main(String[] args) {

        int [] arr = {2, 1, 2};
        System.out.println(solve(arr));
    }
}
