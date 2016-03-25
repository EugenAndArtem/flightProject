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
    private  String type;

    public Type(){}

    public Type(String typeOfFlight){
        type=typeOfFlight;
    }

    public String getType(){
        return type;
    }

    public int getId(){
        return id;
    }
}
