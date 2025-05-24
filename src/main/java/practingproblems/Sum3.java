package practingproblems;

import java.util.Scanner;

public class Sum3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a+b;
        int rem = sum%c;
        System.out.println(rem);
    }
}
