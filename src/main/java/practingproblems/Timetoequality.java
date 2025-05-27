package practingproblems;

public class Timetoequality {
    public static int solve(int [] a){
        int n = a.length;
        int max = a[0];
        int time =0;

        for (int i=0; i<n;i++) {
            max = Math.max(max, a[i]);
        }
            for (int i=0;i<n;i++){
                time += (max- a[i]);
            }

            return time;

    }

    public static void main(String[] args) {
        int [] res = {2, 4, 1, 3, 2};
        System.out.println(solve(res));
    }
}
