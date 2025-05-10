package dsa.strings;

import java.util.Scanner;

public class ReplaceCharWithAt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char B = sc.nextLine().charAt(0);

        String result = s.replace(B, '@');

        System.out.println(result);





    }
}
