package dsa.functions;

public class Add {
    public int solve(int a, int b){
        return  a+b;
    }

    public static void main(String[] args) {
        int a= 10;
        int b = 90;
        Add ad = new Add();
        int res = ad.solve(a,b);
        System.out.println("Adding two numbers " +res);
    }
}
