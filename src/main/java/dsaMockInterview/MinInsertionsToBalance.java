package dsaMockInterview;

import java.util.Scanner;

public class MinInsertionsToBalance {
    public static int minInsertions(String s) {

        int insertion = 0;
        int open = 0;
        int i = 0;

        if (i < s.length()) {
            char c = s.charAt(i);
            if (c == '(') {
                open++;
            }

            else {
                if (i + 1 < s.length() && s.charAt(i + 1) == 1) {
                    if (open > 0) {
                        open--;
                    } else {
                        insertion++;
                    }

                    i += 2;

                }



                else {
                    if (open > 0) {
                        open--;
                        insertion++;
                    } else {
                        insertion += 2;
                    }

                    i += 1;
                }
            }

        }
        insertion += open * 2;
        return insertion;

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