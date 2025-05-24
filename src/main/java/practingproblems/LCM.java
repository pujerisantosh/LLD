package practingproblems;

public class LCM {

    // fine the gcd using euclid algo

    public static  int gcd(int a, int b){
        if (b==0){
            return a;

        }

        return gcd(b, a%b);
    }

    public static int lcm(int a , int b){
        return a*b/gcd(a,b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(lcm(a,b));
    }

}
