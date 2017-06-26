package lab.aikibo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by tamami on 26/06/17.
 */
@Entity
@Data
public class Fares {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fare_id")
    private long id;

    private String fare;
    private String currency;

    public Fares() { super(); }

    public Fares(String fare, String currency) {
        super();
        this.fare = fare;
        this.currency = currency;
    }

    public String toString() {
        return "Fares [id=" + id + ", fare=" + fare + ", currency=" + currency + "]";
    }

}
