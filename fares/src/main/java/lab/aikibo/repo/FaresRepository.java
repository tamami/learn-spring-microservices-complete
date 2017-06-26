package lab.aikibo.repo;

import lab.aikibo.entity.Fare;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tamami on 26/06/17.
 */
public interface FaresRepository extends JpaRepository<Fare, Long> {

    Fare getFareByFlightNumberAndFlightDate(String flightNumber, String flightDate);

}
