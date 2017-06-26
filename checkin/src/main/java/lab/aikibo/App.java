package lab.aikibo;

import lab.aikibo.repo.CheckinRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    @Autowired
    CheckinRepository checkinRepository;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    @Override
    public void run(String... strings) throws Exception {

    }
}
