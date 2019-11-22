import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;


    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(200, PlaneType.BOEING747.getCapacity());
    }

    @Test
    public void canGetTotalWeight(){
        assertEquals(1000, PlaneType.BOEING747.getTotalWeight());
    }

}
