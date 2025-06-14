package practingproblems;

public class Factorial {
    public static int solve(int a){
        if (a==0||a==1){
            return 1;
        }
        return a*solve(a-1);
    }

    public static void main(String[] args) {
        int a=5;
        System.out.println(solve(a));
    }
}
