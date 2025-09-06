package bitManipulations;

public class isAnagram {
    public static int solve(String a, String b){
        if (a.length() != b.length()) return 0;

        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] freq = new int[26];

        for (int i=0;i<a.length();i++){
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;

        }
        for (int count : freq){
            if (count !=0) return 0;
        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println(solve("secure", "rescue"));
    }
}
