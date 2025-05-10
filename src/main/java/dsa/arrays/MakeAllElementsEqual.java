package dsa.arrays;

public class MakeAllElementsEqual {
    public static int solve(int [] a){
        int n = a.length;

        int max = a[0];
        int totalTime =0;

        for (int i=1;i<n;i++){
            if (a[i]> max){
                max = a[i];
            }
        }

        for (int i=0;i<n;i++){

            totalTime += max - a[i];

        }

        return totalTime;

    }

    public static void main(String[] args) {
        int [] arr = {2, 4, 1, 3, 2};
        System.out.println(solve(arr));
    }
}
