package practingproblems;

public class ToggleCase {
    public static String solve(String a){
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<a.length();i++){
            char ch = a.charAt(i);

        if (Character.isUpperCase(ch)){
            builder.append(Character.toLowerCase(ch));
            }
            else{
                builder.append(Character.toUpperCase(ch));
            }

        }

        return builder.toString();
    }

    public static void main(String[] args) {
        String res = "SAAAnnn";
        System.out.println(solve(res));
    }
}
