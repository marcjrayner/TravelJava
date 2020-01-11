import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

}
