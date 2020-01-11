import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Plane plane1;
    Passenger passenger1;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.DREAMLINER);
        passenger1 = new Passenger("Jon", 1);
        flight = new Flight(plane1, "EZ123", "VAN", "EDI", "14:00");
    }

    @Test
    public void canGetPlane() {
        assertEquals(plane1, flight.getPlane());
    }

    @Test
    public void canGetFlightNo() {
        assertEquals("EZ123", flight.getFlightNo());

    }

    @Test
    public void canGetDepartureAirport() {
        assertEquals("EDI", flight.getDepartureAirport());

    }

    @Test
    public void canGetDestination() {
        assertEquals("VAN", flight.getDestination());

    }
//
//    @Test
//    public void canGetDepartureTime() {
//        assertEquals("14:00", flight.getDepartureTime());
//
//    }

}
