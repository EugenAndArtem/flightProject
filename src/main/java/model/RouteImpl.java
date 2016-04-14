package model;

/**
 * Created by Артём on 05.02.2016.
 */

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Eugen on 25.10.2015.
 */
@Entity
@Table(name = "routes")
public class RouteImpl implements Route, Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "fromPoint")
    private String fromPoint;
    @Column(name = "toPoint")
    private String toPoint;

    public RouteImpl() {

    }

    public RouteImpl(String from, String to) {
        fromPoint = from;
        toPoint = to;
    }

    public String getFromPoint() {
        return fromPoint;
    }

    public int getId() {
        return id;
    }

    public String getToPoint() {
        return toPoint;
    }

    public String toString() {
        return "Route from " + fromPoint + " to " + toPoint;
    }

}