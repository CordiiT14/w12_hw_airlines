import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

   private Flight flight;
   private Plane plane;
   private Pilot pilot;
   private CabinCrew crewMember1;
   private CabinCrew crewMember2;
   private ArrayList<CabinCrew> crewList;
   private Passenger passenger1;
   private Passenger passenger2;
   private Passenger passenger3;
   private Passenger passenger4;
   private Passenger passenger5;


   @Before
    public void before(){
       passenger1 = new Passenger("Luke", 2);
       passenger2 = new Passenger("Leia", 2);
       passenger3 = new Passenger("Kylo", 3);
       passenger4 = new Passenger("Mandolorian", 1);
       passenger5 = new Passenger("The Child", 2);
       crewMember1 = new CabinCrew("Yoda", RankType.STEWARD);
       crewMember2 = new CabinCrew("Chewbacca", RankType.COPILOT);
       crewList = new ArrayList<>();
       crewList.add(crewMember1);
       crewList.add(crewMember2);
       pilot = new Pilot("Han Solo", RankType.CAPTAIN, "STW1997");
       plane = new Plane(PlaneType.BOEING707);
       flight = new Flight(pilot, crewList, plane, "TA009", "Tatooine", "Alderan", "14:30" );
   }

   @Test
   public void hasPilot(){
      assertEquals("Han Solo", flight.getPilot().getName());
   }

   @Test
   public void hasCabinCrew(){
      assertEquals(RankType.COPILOT, flight.getCabinCrew().get(1).getRank());
   }

   @Test
   public void hasPlane(){
      assertEquals(PlaneType.BOEING707, flight.getPlane().getPlanetype());
   }

   @Test
   public void hasAllOtherFlightAttributes(){
      assertEquals("TA009", flight.getFlightNumber());
      assertEquals("Tatooine", flight.getDestination());
      assertEquals("Alderan", flight.getDepartureAirport());
      assertEquals("14:30", flight.getDepartureTime());
   }

   @Test
   public void startsWithNoPassengers(){
      assertEquals(0, flight.getNumberOfPassengers());
   }

   @Test
   public void canAddPassengers(){
      flight.addPassenger(passenger5);
      flight.addPassenger(passenger4);
      assertEquals(2, flight.getNumberOfPassengers());
   }

   @Test
   public void canCalculateRemainingSeatsAvailable(){
      flight.addPassenger(passenger5);
      flight.addPassenger(passenger4);
      assertEquals(188, flight.availableSeatsLeft());
   }
}
