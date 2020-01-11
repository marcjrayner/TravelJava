import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlaneTest {
    Plane plane1;
    Plane plane2;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.DREAMLINER);
    }

    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.DREAMLINER, plane2.getPlaneType());
    }

    @Test
    public void canGetPlaneCapacity() {
        assertEquals(450, plane2.getCapacity());
    }

    @Test
    public void canGetPlaneMaxWeight() {
        assertEquals(15000, plane1.getMaxWeight());
    }

}
