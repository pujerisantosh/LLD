package interviewDSAquestions;

import java.util.HashMap;

public class CharCount {
    public static void main(String[] args) {
        String str = "santohpujeri";

        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        map.forEach((k,v) -> System.out.println(k+ ":" +v));

    }
}
