package aviaTableX;

import java.sql.SQLException;

/**
 * Created by Артём on 09.02.2016.
 */
public interface FlightDAO {
    public void addFlight(Flight flight) throws SQLException;
    public void updateFlight(Flight flight) throws SQLException;
    public Flight getFlightById(int flightId) throws SQLException;
    public java.util.List<Flight> getAllFlights() throws SQLException;
    public void deleteFlight(Flight flight) throws SQLException;
}
