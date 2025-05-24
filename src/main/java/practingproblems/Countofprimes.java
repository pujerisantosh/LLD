package practingproblems;

public class Countofprimes {


    public static int countPrime(int a) {

        int totalCount =0;
        for (int i=2;i<=a;i++){
            int count=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                totalCount++;
            }
        }
        return totalCount;
    }
    public static void main(String[] args) {
        int res = 19;
        System.out.println(countPrime(res));
    }


}
