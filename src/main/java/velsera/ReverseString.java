package velsera;

public class ReverseString {
    public static void main(String[] args) {
        String str = "santosh";
        StringBuilder sb = new StringBuilder(str).reverse();
        System.out.println(sb.toString());
    }
}
