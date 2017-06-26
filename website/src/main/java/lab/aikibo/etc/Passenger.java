package lab.aikibo.etc;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * Created by tamami on 25/06/17.
 */
@Data
public class Passenger {

    private long id;
    private String firstName;
    private String lastName;
    private String gender;

    @JsonIgnore
    private BookingRecord bookingRecord;

    public Passenger() {}

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
