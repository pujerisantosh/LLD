package bitManipulations;

public  class convertToTitle {
    public String solve(int a){
        StringBuilder str = new StringBuilder();

        while (a>0){
            a--;
            int rem = a%26;
            char ch = (char) ('A' + rem);
            str.append(ch);
            a = a/26;
        }

        return str.reverse().toString();
    }

    public static void main(String[] args) {
        convertToTitle s = new convertToTitle();
        int n = 3;
        System.out.println(s.solve(n));
    }
}
