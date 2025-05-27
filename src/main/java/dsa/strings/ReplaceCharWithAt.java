package dsa.strings;

import java.util.Scanner;

public class ReplaceCharWithAt {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      // read string

        String A = sc.nextLine();

        // read the charecter

        char B = sc.nextLine().charAt(0);


        String res = A.replace(B, '@');

        System.out.println(res);




    }
}
