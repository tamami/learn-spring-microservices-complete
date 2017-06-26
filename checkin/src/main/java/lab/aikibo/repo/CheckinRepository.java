package lab.aikibo.repo;

import lab.aikibo.entity.CheckInRecord;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tamami on 26/06/17.
 */
public interface CheckinRepository extends JpaRepository<CheckInRecord, Long> {
}
