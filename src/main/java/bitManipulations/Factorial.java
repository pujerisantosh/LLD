package bitManipulations;

public class Factorial {

    public static int solve(int a){
        if (a==0){
            return 1;
        }

        return a*solve(a-1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(solve(n));
    }
}
