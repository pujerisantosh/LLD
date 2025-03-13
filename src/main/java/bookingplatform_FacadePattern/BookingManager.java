package bookingplatform_FacadePattern;

public class BookingManager {

    private BookingProcessor bookingProcessor;

    public BookingManager(BookingProcessor bookingProcessor){
        this.bookingProcessor = bookingProcessor;
    }

    public boolean makeBooking(String customer, String destination, double amount){
        return bookingProcessor.bookTrip(customer, destination, amount);
    }
}
