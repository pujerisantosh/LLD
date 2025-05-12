package bitManipulations;

import java.util.ArrayList;
import java.util.List;

public class GeneratePascalsTriangle {

    public List<int[]> solve(int a){

        int [][] result = new int[a][a];

        for (int r=0;r<a;r++){

            result[r][0] =1;
            result[r][1] = 1;


            for (int c=1; c<r;c++){

                result[r][c] = result[r-1][c-1] + result[r-1][c];


            }
        }

        List<int[]> res = new ArrayList<>();

        for (int i=0;i<a;i++){

            res.add(result[a]);

        }

        return res;


    }

    public static void main(String[] args) {

    }
}
