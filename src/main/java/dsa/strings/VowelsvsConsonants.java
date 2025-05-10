package dsa.strings;

import java.util.Scanner;

public class VowelsvsConsonants {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n ;i++){
            int count =0;
            String st = sc.next();
            int m = st.length();

            for (int j=0;j<m; j++){
                char ch = st.charAt(j);
                if (ch == 'a' || ch=='e' || ch == 'i'| ch == 'o'|| ch == 'U'){
                    count++;
                }
            }

            System.out.println(count);
            System.out.println(m-count);

        }

    }
}
