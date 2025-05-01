package dsaMockInterview;

public class LeapYear {
    public  int solve(int year) {
        if ((year % 4 == 0) || (year % 100 != 0 && year % 400 == 0)) {

        }
        return year;
    }

    public static void main(String[] args) {

        LeapYear lp = new LeapYear();
        int res = lp.solve(1995);
        System.out.println("The Leap Year"+res);
    }
}
