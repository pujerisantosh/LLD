package dsa.functions;

public class CountPrimeNumbers {

    public static int CountPrime(int n){

        int count =0;

        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                count++;
            }
        }

        return count;
    }


    public static  boolean isPrime(int num){
        if(num<=1) return false;
        for (int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return  false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(CountPrime(100));
    }
}
