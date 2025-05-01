package dsaMockInterview;

public class RodCutting {

    public int solve(int n , int [] A){
        int [] arr = new int[n+1];

        arr[0] =0;

        for (int i=1;i<=n;i++){

            int maxValue = Integer.MIN_VALUE;
            for (int j=1;j<=n;j++){
                maxValue = Math.max(maxValue, A[j-1]+ arr[i-1]);
            }

            arr[i] = maxValue;




        }

        return  arr[n];
    }

    public static void main(String[] args) {
        RodCutting rod = new RodCutting();
        int n = 8;
        int [] arr = {1, 5, 8, 9, 10, 17, 17, 20};
        int res = rod.solve(n,arr);
        System.out.println(res);

    }
}
//Aspect	Complexity
//Time Complexity	O(n²)
//pace Complexity	O(n)