package velsera;

import java.util.Scanner;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev =0;
        int orignal =n;
        while (n!=0){
            rev = rev*10+n%10;
            n= n/10;
        }

       if (rev == orignal){
           System.out.println("Palindrome");
       }
       else {
           System.out.println("Not palindrome");
       }
    }
}
