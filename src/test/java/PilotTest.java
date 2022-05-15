import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Han Solo", RankType.CAPTAIN, "STWAR1996");
    }

    @Test
    public void hasPilotLicense(){
        assertEquals("STWAR1996", pilot.getPilotLicense());
    }

    @Test
    public void canChangeRankType(){
        pilot.setRank(RankType.COPILOT);
        assertEquals(RankType.COPILOT, pilot.getRank());
    }
}
