package practingproblems;

public class SumofDigits {
    public static int solve(int a){
        if(a==0) return 0;

        int temp = a/10+a%10;

        return temp;

    }

    public static void main(String[] args) {
        int a =46;
        System.out.println(solve(a));
    }
}
