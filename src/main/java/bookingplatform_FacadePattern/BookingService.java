package bookingplatform_FacadePattern;

public class BookingService {

    public boolean book(String customer,String destination){
        System.out.println("Booking confirmed for Customer: " + customer + " Destination: " + destination);
        return true;
    }
}
