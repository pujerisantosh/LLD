package dsa.arrays;

public class Xpresent {

    public static int solve(int[] a, int b){
        int n = a.length;
        for (int i=0;i<=n;i++){
            if(a[i]==b){

            }
            return 1;
        }

        return 0;

    }

    public static void main(String[] args) {

        int [] a = {1,2,3,4,5};
        int b = 5;
        System.out.println(solve(a,b));
    }
}
