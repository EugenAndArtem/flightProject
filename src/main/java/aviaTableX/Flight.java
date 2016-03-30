package aviaTableX;

/**
 * Created by Артём on 05.02.2016.
 */

public interface Flight {
    int getId();

    int getNumber();

    int getType();

    String getPlaneName();

    String getStartTime();

    String getFlightTime();

    Route getRoute();

    void setPlaneName(String newPlaneName);

}

