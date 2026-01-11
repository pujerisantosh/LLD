package dMGJavaDeveloper;

public class SquaresOfSortedArray {

    public int[] solve(int[] arr){
        int n  = arr.length;
        int[] result = new int[n];



        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left < right){
            int leftSq = arr[left] * arr[left];
            int rightSq = arr[right] * arr[right];

            if (leftSq > rightSq){
                result[pos] = leftSq;
                left++;
            }
            else {
                result[pos] = rightSq;
                right--;
            }

            pos--;
        }

        return result;

    }

    public static void main(String[] args) {
        SquaresOfSortedArray s = new SquaresOfSortedArray();
        int[] arr = {4,-1,0,3,10};
        int[] res = s.solve(arr);

        for(int num : res){
            System.out.print(num + " ");

        }
    }
}
