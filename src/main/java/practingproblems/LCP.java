package practingproblems;

public class LCP {

    public static String solve(String[] a){
        if (a==null || a.length==0){
            return "";
        }

        String prefix = a[0];
        for (int i=0;i<a.length;i++){
           while (a[i].indexOf(prefix) !=0){
               prefix = a[i].substring(prefix.length());

               if (prefix.isEmpty()){
                   return "";
               }
           }

        }

        return prefix;
    }
}
