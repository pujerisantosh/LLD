package practingproblems;

public class longestCommonPrefix {

    public static String solve(String[] str) {

        if (str == null || str.length == 0) {
            return "";
        }


        String prefix = str[0];

        for (int i=0;i<str.length;i++){

            while (str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
            if (prefix.isEmpty()){
                return "";
            }

        }

        return prefix;


    }

    public static void main(String[] args) {
        String[] str = {"abcdefgh", "aefghijk", "abcefgh"};

        System.out.println(solve(str));
    }
}


//TC : O(N+M);
//SP : O(M);