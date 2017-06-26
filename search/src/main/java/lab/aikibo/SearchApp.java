package lab.aikibo;

import lab.aikibo.entity.Fares;
import lab.aikibo.entity.Flight;
import lab.aikibo.entity.Inventory;
import lab.aikibo.repo.FlightRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class SearchApp implements CommandLineRunner
{
    private static final Logger logger = LoggerFactory.getLogger(SearchApp.class);

    @Autowired
    private FlightRepository flightRepository;

    public static void main( String[] args ) {
        SpringApplication.run(SearchApp.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("BF100", "SEA", "SFO", "22-JAN-16", new Fares("100", "USD"), new Inventory(100)));
        flights.add(new Flight("BF101", "NYC", "SFO", "22-JAN-16", new Fares("101", "USD"), new Inventory(100)));
        flights.add(new Flight("BF105", "NYC", "SFO", "22-JAN-16", new Fares("105", "USD"), new Inventory(100)));
        flights.add(new Flight("BF106", "NYC", "SFO", "22-JAN-16", new Fares("106", "USD"), new Inventory(100)));
        flights.add(new Flight("BF102", "CHI", "SFO", "22-JAN-16", new Fares("102", "USD"), new Inventory(100)));
        flights.add(new Flight("BF103", "HOU", "SFO", "22-JAN-16", new Fares("103", "USD"), new Inventory(100)));
        flights.add(new Flight("BF104", "LAX", "SFO", "22-JAN-16", new Fares("104", "USD"), new Inventory(100)));

        flightRepository.save(flights);

        logger.info("Looking to load flights... ");
        for(Flight flight : flightRepository.findByOriginAndDestinationAndFlightDate("NYC", "SFO", "22-JAN-16")) {
            logger.info(flight.toString());
        }
    }
}
