package dsa.strings;

import java.security.UnresolvedPermission;
import java.util.Scanner;

public class CountUppercaseandLowercase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int Lcount = 0;
        int Ucount =0;

        for (char ch : s.toCharArray()){
            if (Character.isUpperCase(ch)){
                Ucount++;
            } else if (Character.isLowerCase(ch)) {
                Lcount++;
                
            }
        }

        System.out.println(Lcount + " " + Ucount);
    }
}
