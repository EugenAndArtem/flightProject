package aviaTableX;


import model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Артём on 24.03.2016.
 */
@Service("FlightService")

public class FlightServiceImpl implements ServiceFlight {
    @Autowired
    private FlightDAO flightDAO;

    @Transactional
    public void addFlight(Flight flight) throws SQLException {
        flightDAO.addFlight(flight);
    }
    @Transactional
    public void updateFlight(Flight flight) throws SQLException {
        flightDAO.updateFlight(flight);
    }
    @Transactional
    public Flight getFlightById(int flightId) throws SQLException {
        return flightDAO.getFlightById(flightId);
    }
    @Transactional
    public List<Flight> getAllFlights() throws SQLException {
        return flightDAO.getAllFlights();
    }
    @Transactional
    public void deleteFlight(Flight flight) throws SQLException {
        flightDAO.deleteFlight(flight);
    }
}
