package practingproblems;

public class CountFactors {

    public static int countFactors(int a){
        int count =0;
        for (int i=1;i*i<=a; i++){
            if (a%i==0){
                if (i==a/i){
                    count++;
                }
                else {
                    count += 2;
                }

            }
        }

        return count;
    }

}
