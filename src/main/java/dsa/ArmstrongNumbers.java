package dsa;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            int originalNum = i;
            int sum =0;
            int temp = i;

            while (temp >0){
                int digit = temp%10;
                sum += digit*digit*digit;
                temp/= 10;
            }

            if (sum == originalNum){
                System.out.println(originalNum);
            }

        }
    }
}
