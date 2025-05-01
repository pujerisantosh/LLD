package dsaMockInterview;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Keep reducing prefix until it matches the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};

        String result = longestCommonPrefix(str);
        System.out.println("Longest Common Prefix: " + result); // Output: "fl"
    }
}


//Time = O(n × m)
//O(1)
