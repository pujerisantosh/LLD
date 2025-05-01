package dsa.arrays;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = {1,2,3,4,5};


        for (int i=n-1;i<=n;i++){
           arr[i] = sc.nextInt();
        }

        for (int i=n;i>=1;i--){
            System.out.println(arr[i]);
        }
    }
}
