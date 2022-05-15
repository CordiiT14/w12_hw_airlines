import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Han Solo", 3);
    }

    @Test
    public void hasName(){
        assertEquals("Han Solo", passenger.getName());
    }

    @Test
    public void hasNumberOfBags(){
        assertEquals(3, passenger.getNumberOfBags());
    }
}
