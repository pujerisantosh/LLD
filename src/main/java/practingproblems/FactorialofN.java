package practingproblems;

public class FactorialofN {

    public static int solve(int n){
        int res = 1;
        for (int i=1;i<=n;i++){
            res*= i;
        }

        return res;
    }

    public static void main(String[] args) {
        int sol = 5;
        System.out.println(solve(sol));

    }


}
