package dsaMockInterview;

public class LongestIncreasingSubsequence {

    public int solve(int[]A){

        int n = A.length;

        if (n==0) return 0;

        int [] arr = new int[n];

        int maxLen = 0;



        for(int i=0;i<n;i++){

            arr[i]= 1;

            for (int j=0;j<i;j++){


                if(A[j] < A[i]) {
                    arr[i] = Math.max(arr[i], arr[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, arr[i]);
        }

        return maxLen;

            }


public static void main(String[] args) {

    LongestIncreasingSubsequence s = new LongestIncreasingSubsequence();

    int[] A1 = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};

    int res = s.solve(A1);
    System.out.println("The Longest Increasing Subsequence  "  +res);
}


        }




//Time Complexity	O(n²)
//Space Complexity	O(n)