package lab.aikibo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by tamami on 26/06/17.
 */
@Entity
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private long id;

    @Getter @Setter
    private String flightNumber;
    @Getter @Setter
    private String flightDate;
    @Getter @Setter
    private int available;

    public Inventory() {}

    public Inventory(String flightNumber, String flightDate, int available) {
        super();
        this.flightNumber = flightNumber;
        this.flightDate = flightDate;
        this.available = available;
    }

    public boolean isAvailable(int count) {
        return ((available-count) > 5);
    }

    public int getBookableInventory() {
        return available - 5;
    }

    public String toString() {
        return "Inventory [id=" + id + ", flightNumber=" + flightNumber + ", flightDate=" + flightDate +
            ", available=" + available + "]";
    }

}
