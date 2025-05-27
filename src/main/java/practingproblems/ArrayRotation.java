package practingproblems;

public class ArrayRotation {
    public static int[] solve(int [] a,int b){
        int n = a.length;

        b = b%n;

        if (b==0){
            return a;
        }

        int[] result = new int[n];

        for (int i=0;i<b;i++){

            result[i] = a[n-b+i];



        }

        for (int i=b;i<n;i++){
            result[i] = a[i-b];
        }

        return result;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        int b= 2;
        System.out.println(solve(arr,b));
    }
}
