package dsaMockInterview;

import java.util.Scanner;

public class MinInsertionsToBalance {
    public static int minInsertions(String s) {

        int insertion =0;
        int rightNeeded =0;
        int i=0;

        while (i < s.length()){
            char c = s.charAt(i);
            if(c == '('){
                if ( rightNeeded % 2 != 0){
                    insertion++;
                    rightNeeded--;
                }
                rightNeeded += 2;
                i++;
            }
            else {
                rightNeeded--;
                if (rightNeeded < 0){
                    insertion++;
                    rightNeeded =1;
                }
                i++;
            }
        }

        return insertion+rightNeeded;


    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parentheses string:");
        String s1 = sc.next();
        int result = minInsertions(s1);
        System.out.println("Minimum insertions needed: " + result);
    }
}

// SC: O(N)
//Tc : O(1)