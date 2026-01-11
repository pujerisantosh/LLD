package dMGJavaDeveloper;

public class PalindromeCheck {

    public static boolean isPalindrome(String str){
       String rev =  new StringBuilder(str).reverse().toString();

       return str.equals(rev);


    }

    public static void main(String[] args) {
        String str = "GADAG";
        System.out.println(isPalindrome(str));
    }
}
