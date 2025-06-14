package velsera;

public class SumDigit {

    public static int solve(String str){
        int sum =0;
        for (char ch : str.toCharArray()){
            if (Character.isDigit(ch)){
                sum += Character.getNumericValue(ch);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(solve(str));
    }

}


