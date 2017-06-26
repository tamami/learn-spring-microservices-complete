package lab.aikibo.component;

import lab.aikibo.ref.BookingStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by tamami on 26/06/17.
 */
@Component
public class Receiver {

    private BookingComponent bookingComponent;

    @Autowired
    public Receiver(BookingComponent bookingComponent) {
        this.bookingComponent = bookingComponent;
    }

    @RabbitListener(queues = "CheckINQ")
    public void processMessage(long bookingId) {
        System.out.println(bookingId);
        bookingComponent.updateStatus(BookingStatus.CHECKED_IN, bookingId);
    }

}
