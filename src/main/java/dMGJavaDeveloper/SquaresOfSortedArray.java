package dMGJavaDeveloper;

public class SquaresOfSortedArray {

    public int[] solve(int[] arr) {

      int n = arr.length;
      int[] res = new int[n];


      int left =0;
      int right = n-1;

      int pos = n-1;


      while(left <= right){

          int leftSq = arr[left] * arr[left];
          int rightSq = arr[right]* arr[right];

          if(leftSq > rightSq){
              res[pos] = leftSq;
              left++;
          }

          else {

              res[pos] = rightSq;
              right--;
          }

          pos--;
      }




        return res;
    }

    public static void main(String[] args) {

        int [] num = {-4,-1,0,3,10};
        SquaresOfSortedArray s = new SquaresOfSortedArray();

        int[] res = s.solve(num);
        for (int santosh : res){
            System.out.print(santosh + " ");
        }
    }


}