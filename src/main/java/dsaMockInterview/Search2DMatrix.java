package dsaMockInterview;

public class Search2DMatrix {

    public boolean solve(int[][] A , int B){

        if(A==null || A.length==0 || A[0].length==0){
            return false;

        }

        int rows = A.length;
        int cols = A[0].length;

        int row = 0, col = cols - 1;

        while (row <rows  &&  col >= 0){
            int current = A[row][col];

            if (current == B){
                return true;
            }

            else if (current > B){
                col--;
            }

            else {
                row++;
            }

        }

        return  false;

    }


    public static void main(String[] args) {

        Search2DMatrix m = new Search2DMatrix();
        int [][] A1 = {{1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}};
           int B = 9;

           boolean res = m.solve(A1,B);

        System.out.println(res);
    }
}


//Time Complexity	O(m + n)
//Space Complexity	O(1)
