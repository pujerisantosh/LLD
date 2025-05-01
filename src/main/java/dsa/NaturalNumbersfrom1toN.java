package dsa;

public class NaturalNumbersfrom1toN {


    public int solve(int A) {
        for (int i = 1; i <= A; i++) {
            System.out.println(i);
        }
        return A;
    }
    public static void main(String[] args) {

        NaturalNumbersfrom1toN n = new NaturalNumbersfrom1toN();
        int A = 10;
        int res  = n.solve(A);
        System.out.println(" Num");

    }
}
