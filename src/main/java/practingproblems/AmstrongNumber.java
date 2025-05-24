package practingproblems;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i=1;i<n;i++){
            int sum =0;
            int original = i;
            int temp = i;

            while (temp > 0){

                int digit = temp %10;
                sum += digit*digit*digit;
                temp /= 10;

            }

            if (sum == original){
                System.out.println(original);
            }
        }
    }
}
