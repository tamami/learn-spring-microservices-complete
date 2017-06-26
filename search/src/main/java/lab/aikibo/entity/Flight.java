package lab.aikibo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by tamami on 26/06/17.
 */
@Entity
@Data
public class Flight {

    @Id
    @GeneratedValue
    private long id;

    private String flightNumber;
    private String origin;
    private String destination;
    private String flightDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fare_id")
    Fares fares;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "inv_id")
    Inventory inventory;

    public Flight() { super(); }

    public Flight(String flightNumber, String origin, String destination, String flightDate, Fares fares, Inventory inventory) {
        super();
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.flightDate = flightDate;
        this.fares = fares;
        this.inventory = inventory;
    }

    public String toString() {
        return "Flight [id=" + id + ", flightNumber=" + flightNumber + ", origin=" + origin + ", destination=" +
            destination + ", flightDate=" + flightDate + ", fares=" + fares + ", inventory=" + inventory + "]";
    }

}
