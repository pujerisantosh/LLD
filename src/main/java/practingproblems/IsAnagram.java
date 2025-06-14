package practingproblems;

public class IsAnagram {
    public static int solve(String a, String b){
        if (a.length() != b.length()) return 0;

        int [] arr = new int[26];

        for (int i=0;i<a.length();i++){
            arr[a.charAt(i) - 'a']++;
            arr[b.charAt(i) - 'a']--;




        }

        for (int count : arr){
            if (count !=0) return  0;
        }

        return 1;
    }

    public static void main(String[] args) {
        String A = "cat";
        String B = "bat";

        System.out.println(solve(A,B));
    }
}
