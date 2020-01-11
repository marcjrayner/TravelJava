import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Jimothy Burberidge", 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Jimothy Burberidge", passenger.getName());
    }

    @Test
    public void canGetNumOfBags() {
        assertEquals(2, passenger.getNumOfBags());
    }

}
