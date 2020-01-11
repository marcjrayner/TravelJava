import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    Plane plane1;
    Passenger passenger1;
    Passenger passenger2;
    Flight flight;
    FlightManager flightManger;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.DREAMLINER);
        passenger1 = new Passenger("Jon", 2);
        passenger2 = new Passenger("Joan", 1);
        flight = new Flight(plane1, "EZ123", "VAN", "EDI", "14:00");
        flightManger = new FlightManager(flight);
    }

    @Test
    public void canCheckHowMuchBagWeightShouldReservedPerPassenger() {
        assertEquals(13, flightManger.calculateBaggageWeightPerPassenger(), 0.1);
    }

    @Test
    public void canCalculateHowMuchBaggageWeightTakenByPassengers() {
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(15, flightManger.calculateBookedBaggageWeight());
    }

    @Test
    public void canCalculateRemainingBaggageWeightReserved() {
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(5985, flightManger.calculateRemainingBaggageWeightReserved());
    }
}
