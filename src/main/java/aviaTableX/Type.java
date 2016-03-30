package aviaTableX;

import javax.persistence.*;

/**
 * Created by Артём on 26.02.2016.
 */
@Entity
@Table(name = "flighttype")
public class Type {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "type")
    private int type;

    public Type() {
    }

    public Type(int typeOfFlight) {
        type = typeOfFlight;
    }

    public int getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setId(int id) {

        this.id = id;
    }
}
