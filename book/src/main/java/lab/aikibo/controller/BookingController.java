package lab.aikibo.controller;

import lab.aikibo.component.BookingComponent;
import lab.aikibo.entity.BookingRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by tamami on 26/06/17.
 */
@RestController
@CrossOrigin
@RequestMapping("/booking")
public class BookingController {

    private BookingComponent bookingComponent;

    @Autowired
    public BookingController(BookingComponent bookingComponent) {
        this.bookingComponent = bookingComponent;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public long book(@RequestBody BookingRecord record) {
        System.out.println("Booking request " + record);
        return bookingComponent.book(record);
    }

    @RequestMapping("/get/{id}")
    public BookingRecord getBooking(@PathVariable long id) {
        return bookingComponent.getBooking(id);
    }

}
