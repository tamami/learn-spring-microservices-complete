package lab.aikibo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by tamami on 26/06/17.
 */
@Entity
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private long id;

    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private String gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOOKING_ID")
    @JsonIgnore
    @Getter @Setter
    private BookingRecord bookingRecord;

    public Passenger() { super(); }

    public Passenger(String firstName, String lastName, String gender, BookingRecord bookingRecord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.bookingRecord = bookingRecord;
    }

    public String toString() {
        return "Passenger [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
    }

}
