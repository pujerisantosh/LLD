package practingproblems;

import java.util.Scanner;

public class Countuppercaseandlowercase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int Ucount= 0;
        int Lcount =0;

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if ( ch >= 'A' && ch <= 'Z'){
                Ucount++;
            }

            if (ch >= 'a' && ch <='z'){
                Lcount++;
            }
        }

        System.out.println(Ucount  +  "  "   + Lcount);


    }
}
