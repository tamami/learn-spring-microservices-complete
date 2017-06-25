package lab.aikibo.entity;

import lombok.Data;

import java.util.Date;
import java.util.Set;

/**
 * Created by tamami on 25/06/17.
 */
@Data
public class BookingRecord {

    private long id;
    private String flightNumber;
    private String origin;
    private String destination;
    private String flightDate;
    private Date bookingDate;
    private String fare;
    private String status;
    private Set<Passenger> passengers;

    public BookingRecord() { super(); }

    public BookingRecord(String flightNumber, String from, String to, String flightDate, Date bookingDate, String fare) {
        this.flightNumber = flightNumber;
        this.origin = from;
        this.destination = to;
        this.flightDate = flightDate;
        this.bookingDate = bookingDate;
        this.fare = fare;
    }

    public String toString() {
        return "BookingRecord [id=" + id + ", flightNumber=" + flightNumber + ", from=" + origin + ", to=" + destination +
            ", flightDate=" + flightDate + ", bookingDate=" + bookingDate + ", passengers=" + passengers + "]";
    }


}
