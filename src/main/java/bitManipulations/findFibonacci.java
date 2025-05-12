package bitManipulations;

public class findFibonacci {

    public static int solve(int a){

        if (a== 0) return  0;
        if (a==1) return 1;

        return solve(a-1)+solve(a-2);
    }

    public static void main(String[] args) {
        int a = 9;
        System.out.println(solve(a));
    }
}
