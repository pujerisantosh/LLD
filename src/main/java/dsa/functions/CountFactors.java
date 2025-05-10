package dsa.functions;

public class CountFactors {

    public static  int solve(int A ){
        int count =0;
        for(int i=1; i*i <= A; i++) {
            if (A%i==0){
                count++;
            }
            if (i!= A/i){
                count++;
            }


        }
        return count ;

    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println(solve(a));
    }
}
