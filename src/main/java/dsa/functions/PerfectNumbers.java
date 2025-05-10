package dsa.functions;

public class PerfectNumbers {
    public static int solve(int A){
        int sum =1;

        for (int i=2;i*i<=A;i++){
            if (A%i==0){
                sum +=i;

                if (i!=A/i){
                    sum += A/i;
                }
            }
        }

        return sum == A? 1 : 0;
    }

    public static void main(String[] args) {

        int a = 6;
        System.out.println(solve(a));
    }
}
