package practingproblems;

public class SimpleReverse {

    public static String solve(String a) {

        StringBuilder str = new StringBuilder();
        for (int i=a.length()-1; i>=0;i--){
            str.append(a.charAt(i));
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String s = "santosh";
        System.out.println(solve(s));
    }
    }
