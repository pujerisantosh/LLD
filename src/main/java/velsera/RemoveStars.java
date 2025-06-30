package velsera;

public class RemoveStars {

    public static String solve(String str){
        StringBuilder result = new StringBuilder();

        for(char c: str.toCharArray()){

            if(c == '*'){
                if (result.length()>0){
                    result.deleteCharAt(result.length()-1);
                }
            }
            else {
                result.append(c);
            }
        }

        return result.toString();


    }

    public static void main(String[] args) {


        String input = "leet**cod*e";
        System.out.println(solve(input));
    }


}
