package lab.aikibo.repo;

import lab.aikibo.entity.BookingRecord;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tamami on 26/06/17.
 */
public interface BookingRepository extends JpaRepository<BookingRecord, Long> {
}
