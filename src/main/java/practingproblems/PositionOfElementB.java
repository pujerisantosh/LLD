package practingproblems;

import java.util.Scanner;

public class PositionOfElementB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int res = solve(arr,k);
        System.out.println(res);


    }

    public static int solve(int [] a, int b){
       for (int i=0;i<a.length;i++){
           if (a[i]==b){
               return i;
           }
       }

       return -1;
    }
}
