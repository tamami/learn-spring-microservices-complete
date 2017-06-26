package lab.aikibo.entity;

import lombok.Data;

/**
 * Created by tamami on 26/06/17.
 */
@Data
public class Fare {

    private String flightNumber;
    private String flightDate;
    private String fare;

    public String toString() {
        return "Fare [flightNumber=" + flightNumber + ", flightDate=" + flightDate + ", fare=" + fare + "]";
    }

}
