import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    private CabinCrew cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Chewbacca", RankType.ENGINEER);
    }

    @Test
    public void hasName(){
        assertEquals("Chewbacca", cabinCrew.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.ENGINEER, cabinCrew.getRank());
    }

    @Test
    public void canRelayMessage(){
        assertEquals("Listen up nerds, it's about to be a bumpy ride", cabinCrew.relayMessage("it's about to be a bumpy ride"));
    }
}
