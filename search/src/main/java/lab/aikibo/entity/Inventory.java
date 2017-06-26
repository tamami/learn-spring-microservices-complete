package lab.aikibo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by tamami on 26/06/17.
 */
@Entity
@Data
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "inv_id")
    private long id;

    private int count;

    public Inventory() { super(); }

    public Inventory(int count) {
        super();
        this.count = count;
    }

    public String toString() {
        return "Inventory [id=" + id + ", count=" + count + "]";
    }

}
