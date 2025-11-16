package dsa.twoDArray;

public class CheckArray {
    public static int solve(int[] a){

        int n = a.length;

       for (int i=1;i<n;i++){
           if (a[i] < a[i-1]){
               return 0;
           }
       }


        return 1;
    }

}
