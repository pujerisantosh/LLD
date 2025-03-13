package bookingplatform_FacadePattern;

import static org.junit.Assert.assertTrue;

public class Main {
    public static void main(String[] args) {

        BookingService bookingService = new BookingService();
        PaymentService paymentService = new PaymentService();
        NotificationService notificationService = new NotificationService();

        BookingProcessor bookingProcessor = new BookingProcessor(paymentService, bookingService, notificationService);
        BookingManager bookingManager = new BookingManager(bookingProcessor);

        assertTrue(bookingManager.makeBooking("John Doe", "Paris", 500.0));
    }

    }

