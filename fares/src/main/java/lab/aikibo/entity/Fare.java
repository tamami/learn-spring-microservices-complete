package lab.aikibo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by tamami on 26/06/17.
 */
@Entity
@Data
public class Fare {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String flightNumber;
    private String flightDate;
    private String fare;

    public Fare() { super(); }

    public Fare(String flightNumber, String flightDate, String fare) {
        super();
        this.flightNumber = flightNumber;
        this.flightDate = flightDate;
        this.fare = fare;
    }

    public String toString() {
        return "Fares [id=" + id + ", flightNumber=" + flightNumber + ", flightDate=" + flightDate + ", fare=" + fare + "]";
    }

}
