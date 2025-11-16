package dsa.twoDArray;

public class MaxElementInMatrix {
    public static int maxElement(int[][] arr){
        int n = arr.length;
        int m = Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j] > m){
                    m = arr[i][j];
                }

            }
        }
        return m;
    }

    public static void main(String[] args) {
        int [][] res ={{12, 65, 89, 74},
                {22, 44, 12, 30},
                {10, 12, 97, 19}};

        System.out.println(maxElement(res));
    }
}
