package bitManipulations;

public class IsPalindrome {
    public static int solve(String a){

       return check(a,0,a.length()-1);
    }

    private static int check(String a, int start, int end) {

        if ( start >= end){
            return 1;
            //System.out.println(1+ "");
        }
        if (a.charAt(start) != a.charAt(end)){
            return 0;
        }

        return check(a,start+1,end-1);
    }

    public static void main(String[] args) {
        String a = "naman";
        System.out.println(solve(a));
    }


}
