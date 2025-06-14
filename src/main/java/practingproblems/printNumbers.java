package practingproblems;

public class printNumbers {
    public static int solve(int a){
        if (a==0) return 0;

        for (int i=a;i>=1;i--){
            System.out.print(i + " ");
        }
        return a;
    }

    public static void main(String[] args) {
        int a= 10;
        System.out.println(solve(a));
    }
}
