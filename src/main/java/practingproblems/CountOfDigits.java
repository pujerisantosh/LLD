package practingproblems;

public class CountOfDigits {

    public static int solve(int a){
        int count =0;

        while(a!=0){
            a = a/10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int res = 1234567890;
        System.out.println(solve(res));
    }

}
