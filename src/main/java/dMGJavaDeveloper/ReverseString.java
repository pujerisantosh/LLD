package dMGJavaDeveloper;

public class ReverseString {

public String reverse(String str){

    return new StringBuilder(str).reverse().toString();

}

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverse("hello"));
    }
}
