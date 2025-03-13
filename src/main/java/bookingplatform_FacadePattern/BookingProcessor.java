package bookingplatform_FacadePattern;

public class BookingProcessor {

    private BookingService bookingService;
    private PaymentService paymentService;
    private NotificationService notificationService;

    public BookingProcessor(PaymentService paymentService, BookingService bookingService, NotificationService notificationService) {
        this.paymentService = paymentService;
        this.bookingService = bookingService;
        this.notificationService = notificationService;
    }


    // Facade method for handling the entire booking process

    public boolean bookTrip(String customer, String destination, double amount){
        if(paymentService.processPyament(customer, amount) && bookingService.book(customer, destination)){
            notificationService.sendNotification(customer);
            return true;
        }

        return false;
    }

}
