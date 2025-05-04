package dsa.arrays;

import java.util.Scanner;

public class LCM {

    public static int lcm(int a, int b){
        if (b !=0){
            int temp = b;
            b = a%b;
            a = temp;

        }

        return a;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(lcm(a,b));
    }
}
