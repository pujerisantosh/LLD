package bitManipulations;

import java.util.ArrayList;
import java.util.Collections;

public  class GenerateParenthesis {

    public ArrayList<String> solve(int a){

        ArrayList<String> result = new ArrayList<>();

        generate(a, 0,0, "", result);
        Collections.sort(result);
        return result;
    }

    private    void generate(int a, int open, int close, String current, ArrayList<String> result) {
        if (current.length()==2*a){
            result.add(current);
            return;

        }

        if (open < a){
            generate(a,open+1, close, current + "(", result);

        }
        if (close < open){
            generate(a, open , close+1, current + ")", result);
        }
    }

    public static void main(String[] args) {
        GenerateParenthesis g1 = new GenerateParenthesis();
        System.out.println(g1.solve(3));
    }
}
