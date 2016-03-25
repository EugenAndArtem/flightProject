package aviaTableX;

/**
 * Created by Артём on 05.02.2016.
 */

import javax.persistence.*;
import java.beans.Transient;
import java.io.Serializable;

/**
 * Created by Eugen on 26.10.2015.
 */

@Entity
@Table(name = "flights")
public class WorldWideFlight implements Flight, Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "flighTtype")
    private Type type;

    @Column(name = "number")
    private int number;

    @Column(name = "planeName")
    private String planeName;

    @Column(name = "startTime")
    private String startTime;

    @Column(name = "flightTime")
    private String flightTime;

    @ManyToOne
    @JoinColumn(name = "idRoute")
    private RouteImpl route;


    public WorldWideFlight(){

    }

    public WorldWideFlight(int number, String planeName, String startTime, String flightTime, Route route, Type type) {
        this.number = number;
        this.planeName = planeName;
        this.startTime = startTime;
        this.flightTime = flightTime;
        this.route = (RouteImpl) route;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type.getType();
    }

    public String getPlaneName() {
        return planeName;
    }

    public String getStartTime() {
        return startTime;
    }
    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public String getFlightTime() {
        return flightTime;
    }

    @Transient
    public Route getRoute() {
        return route;
    }

    /*public String toJson(){
        GsonBuilder builder=new GsonBuilder();
        Gson Gson=builder.create();
        return Gson.toJson(this);
    }*/
    public String toString() {
        return "World Flight " + Integer.toString(number) + " " + planeName + " from " + route.getFromPoint() + " to " + route.getToPoint() + " starts at " + startTime +
                " and arrives at " + flightTime;
    }
}