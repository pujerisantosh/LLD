package practingproblems;

import java.util.Scanner;

public class LeapYear {

    public static boolean  iaLeapYear(int year){
        if (year%4==0 && (year%400==0 || year%100 !=0)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean  res = iaLeapYear(a);
        System.out.println(res);
    }
}
