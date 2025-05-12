package bitManipulations;

public class LongestCommonPrefix {
    public static  String solve(String[] a){

       if (a== null || a.length ==0) return  "" ;
       String prefix = a[0];

       for (int i=0;i<a.length;i++){
           while (a[i].indexOf(prefix) != 0){
               prefix = prefix.substring(0,prefix.length()-1);
               if (prefix.isEmpty()) return  "";

           }
       }
       return prefix;

       }

    public static void main(String[] args) {
        String [] str = {"abab", "ab", "abcd"};
        System.out.println(solve(str));
    }
}
