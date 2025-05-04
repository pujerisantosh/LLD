package dsa.arrays;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       String [] input = sc.nextLine().split("");

       for (String s : input){
           int num = Integer.parseInt(s);
           if (num> 0){
               System.out.println(num + " ");
           }
       }



    }
}
