package lab.aikibo.etc;

import lombok.Data;

import java.util.List;

/**
 * Created by tamami on 25/06/17.
 */
@Data
public class UIData {

    private SearchQuery searchQuery;
    private List<Flight> flights;
    private Flight selectedFlight;
    private Passenger passenger;
    private String bookingId;

}
