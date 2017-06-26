package lab.aikibo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by tamami on 26/06/17.
 */
@Entity
public class BookingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long id;

    @Getter @Setter
    private String flightNumber;
    @Getter @Setter
    private String origin;
    @Getter @Setter
    private String destination;
    @Getter @Setter
    private String flightDate;
    @Getter @Setter
    private Date bookingDate;
    @Getter @Setter
    private String fare;
    @Getter @Setter
    private String status;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "bookingRecord")
    @Getter @Setter
    Set<Passenger> passengers;

    public BookingRecord() { super(); }

    public BookingRecord(String flightNumber, String origin, String destination, String flightDate,
                         Date bookingDate, String fare) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.flightDate = flightDate;
        this.bookingDate = bookingDate;
        this.fare = fare;
    }

    public String toString() {
        return "BookingRecord [id=" + id + ", flightNumber=" + flightNumber + ", origin=" + origin + ", destination=" +
            destination + ", flightDate=" + flightDate + ", bookingDate=" + bookingDate + ", fare=" + fare +
            ", status=" + status + "]";
    }

}
