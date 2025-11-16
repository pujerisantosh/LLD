package dsa.twoDArray;

public class Printmatrixrowbyrow {
    public static void main(String[] args) {

        int n =3;
        int m = 3;


        int[][] arr = new int[n][m];

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }


    }
}
