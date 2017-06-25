package lab.aikibo.entity;

import lombok.Data;

/**
 * Created by tamami on 25/06/17.
 */
@Data
public class SearchQuery {

    private String origin;
    private String destination;
    private String flightDate;

    public SearchQuery() { super(); }

    public SearchQuery(String origin, String destination, String flightDate) {
        super();
        this.origin = origin;
        this.destination = destination;
        this.flightDate = flightDate;
    }

    @Override
    public String toString() {
        return "SearchQuery [origin=" + origin + ", destination=" + destination + ", flightDate=" + flightDate + "]";
    }

}
