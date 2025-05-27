package practingproblems;

public class PrimeCheck {
    public static int solve(int a){
        int count =0;

        for (int i=1;i*i<=a;i++){
            if (a%i==0){
                if (i==a/i) count++;
                else
                    count +=2;

            }
        }

        if (count==2)
            return 1;
        else
            return 0;


    }

    public static void main(String[] args) {
        int res = 5;
        System.out.println(solve(res));
    }
}
