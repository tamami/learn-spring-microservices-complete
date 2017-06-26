package lab.aikibo.etc;

import lombok.Data;

/**
 * Created by tamami on 25/06/17.
 */
@Data
public class Flight {

    private long id;
    private String flightNumber;
    private String origin;
    private String destination;
    private String flightDate;
    Fares fares;

    public Flight() { super(); }

    public Flight(String flightNumber, String origin, String destination, String flightDate, Fares fares) {
        super();
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.flightDate = flightDate;
        this.fares = fares;
    }

    public String toString() {
        return "Flight [id=" + id + ", flightNumber=" + flightNumber + ", origin=" + origin + ", destination=" + destination +
            ", flightDate=" + flightDate + ", fares=" + fares + "]";
    }

}
