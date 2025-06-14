package practingproblems;

public class printNumbersOne {
    public static int solve(int a){
        if (a==0){
            return a;
        }

        solve(a-1);
        System.out.println(a+ " ");

        return a;
    }

    public static void main(String[] args) {
        int a =10;
        System.out.println(solve(a));
    }
}
