import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    Plane plane1;
    Passenger passenger1;
    Flight flight;
    FlightManager flightManger;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.DREAMLINER);
        passenger1 = new Passenger("Jon", 1);
        flight = new Flight(plane1, "EZ123", "VAN", "EDI", "14:00");
        flightManger = new FlightManager(flight);
    }

    @Test
    public void canCheckHowMuchBagWeightShouldReservedPerPassenger() {
        assertEquals(13, flightManger.calculateBaggageWeightPerPassenger(), 0.1);
    }
}
