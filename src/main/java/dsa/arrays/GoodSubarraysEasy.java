package dsa.arrays;

public class GoodSubarraysEasy {

    public static  int solve(int[] a, int b){

        int n = a.length;
        int count =0;

        for (int i=0;i<n;i++){
            int sum =0;
            for (int j=i;j<n;j++){
                int length = j-i+1;

                sum += a[j];

                if ((length%2==0 & sum < b) ||  (length%2 !=0 & sum > b)){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr [] = {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
        int b = 65;
        System.out.println(solve(arr,b));
    }
}
