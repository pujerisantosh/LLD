package dsa;

import java.util.Scanner;

public class SUMGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int sum =0;
        for (int i=1;i<=n;i++){

            int sum = n* (n + 1) / 2;
            System.out.print(sum);


        }
    }
}
