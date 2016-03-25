package aviaTableX;

/**
 * Created by Артём on 05.02.2016.
 */
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Eugen on 26.10.2015.
 */

@Entity
@Table(name = "flights")
public class InnerFlight implements Flight,Serializable {
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
    private RouteImpl route;////////////////////


    public InnerFlight(){

    }
    public InnerFlight(int number,String planeName,String startTime,String flightTime,Route route, Type type){
        this.number = number;
        this.planeName = planeName;
        this.startTime = startTime;
        this.flightTime = flightTime;
        this.route = (RouteImpl) route;
        this.type = type;
    }
    public int getId(){
        return id;
    }
    public int getNumber(){
        return number;
    }



    public String getPlaneName(){
        return planeName;
    }

    public String getStartTime(){
        return startTime;
    }

    public String getFlightTime(){
        return flightTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public void setRoute(RouteImpl route) {
        this.route = route;
    }

    public Route getRoute(){
        return route;
    }

    public String getType() {return type.getType();}
    /*public String toJson(){
        GsonBuilder builder=new GsonBuilder();
        Gson gson=builder.create();
        return gson.toJson(this);
    }*/
    public String toString(){
        return "Inner Flight "+Integer.toString(number) +" " + planeName + " from " + route.getFromPoint() + " to " + route.getToPoint() + " starts at " + startTime +
                " and arrives at " + flightTime;
    }

}