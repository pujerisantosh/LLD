package dsa.arrays;

public class GoodPair {

    public static int solve(int[] a, int b){
        int n = a.length;

        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (a[i]+a[j]==b){
                    return 1;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4};
        int b = 7;

        System.out.println(solve(a,b));
    }
}
