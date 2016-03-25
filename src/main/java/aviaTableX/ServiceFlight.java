package aviaTableX;

import java.sql.SQLException;

/**
 * Created by Артём on 24.03.2016.
 */
public interface ServiceFlight {
    public void addFlight(Flight flight) throws SQLException;
    public void updateFlight(int flightId, Flight flight) throws SQLException;
    public Flight getFlightById(int flightId) throws SQLException;
    public java.util.List<Flight> getAllFlights() throws SQLException;
    public void deleteFlight(Flight flight) throws SQLException;
}
