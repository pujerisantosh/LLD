package practingproblems;

public class ReversetheString {


    public  static String solve(String a) {
        String[] word = a.trim().split("\\s");

        StringBuilder sb = new StringBuilder();
        for (int i = word.length - 1; i >= 0; i--) {
            sb.append(word[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }

        return sb.toString();


    }

    public static void main(String[] args) {
        String str = "the sky is blue ";
        System.out.println(solve(str));
    }
}
