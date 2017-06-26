package lab.aikibo;

import lab.aikibo.entity.CheckInRecord;
import lab.aikibo.repo.CheckinRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class CheckInApp implements CommandLineRunner
{
    private static final Logger logger = LoggerFactory.getLogger(CheckInApp.class);

    @Autowired
    CheckinRepository checkinRepository;

    public static void main( String[] args )
    {
        SpringApplication.run(CheckInApp.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        CheckInRecord record = new CheckInRecord("Franc", "Gean", "28A", new Date(),
            "BF101", "22-JAN-16", 1);

        CheckInRecord result = checkinRepository.save(record);

        logger.info("Looking to load checkedIn record...");
        logger.info("Result: " + checkinRepository.findOne(result.getId()));
    }
}
