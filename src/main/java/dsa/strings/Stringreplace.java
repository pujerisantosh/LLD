package dsa.strings;

import java.util.Scanner;

public class Stringreplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char b = sc.next().charAt(0);

        String  result = a.replace(b, '@');
        System.out.println(result);
    }
}
