import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUS320);
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.AIRBUS320, plane.getPlanetype());
    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(220, plane.getPlanetype().getCapacity());
    }

    @Test
    public void canGetPlaneMaxLoadingWeight(){
        assertEquals(36400, plane.getPlanetype().getMaxLoadWeight());
    }
}
