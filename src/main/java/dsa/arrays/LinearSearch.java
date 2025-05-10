package dsa.arrays;

public class LinearSearch {

    public static int solve(int[] a, int b){

        int n = a.length;
        int count =0;
        for (int i=0;i<n;i++){
            if (a[i]== b){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int []  arr = {1, 2, 1};
        int b = 3;
        System.out.println(solve(arr,b));

    }
}
