package bitManipulations;

public class CountBobOccurrences {
    public static int solve(String  a){
        int count =0;

        for (int i=0; i<a.length()-3;i++){
            if (a.substring(i,i+3).equals("bob")){
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        String input1 = "abobc";
        System.out.println(solve(input1));
    }
}
