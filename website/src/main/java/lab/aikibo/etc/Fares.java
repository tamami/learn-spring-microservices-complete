package lab.aikibo.etc;

import lombok.Data;

/**
 * Created by tamami on 25/06/17.
 */
@Data
public class Fares {

    private long id;
    private String fare;
    private String currency;


    public Fares() { super(); }

    public Fares(String fare, String currency) {
        this.fare = fare;
        this.currency = currency;
    }

    public String toString() {
        return "Fares [id=" + id + ", fare=" + fare + ", currency=" + currency + "]";
    }

}
