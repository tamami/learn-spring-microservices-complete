package lab.aikibo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by tamami on 26/06/17.
 */
@Entity
@Data
public class CheckInRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String lastName;
    private String firstName;
    private String seatNumber;
    private Date checkInTime;
    private String flightNumber;
    private String flightDate;
    private long bookingId;

    public CheckInRecord() {}

    public CheckInRecord(String lastName, String firstName, String seatNumber, Date checkInTime, String flightNumber,
                         String flightDate, long bookingId) {
        super();
        this.lastName = lastName;
        this.firstName = firstName;
        this.seatNumber = seatNumber;
        this.checkInTime = checkInTime;
        this.flightNumber = flightNumber;
        this.flightDate = flightDate;
        this.bookingId = bookingId;
    }

    public String toString() {
        return "CheckInRecord [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", seatNumber=" +
            seatNumber + ", checkInTime=" + checkInTime + ", flightNumber=" + flightNumber + ", flightDate=" +
            flightDate + ", bookingId=" + bookingId + "]";
    }

}
