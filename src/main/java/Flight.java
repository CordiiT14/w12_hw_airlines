import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrew> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, ArrayList<CabinCrew> cabinCrew, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.cabinCrew = cabinCrew;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<>();
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public ArrayList<CabinCrew> getCabinCrew() {
        return cabinCrew;
    }

    public void setCabinCrew(ArrayList<CabinCrew> cabinCrew) {
        this.cabinCrew = cabinCrew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getNumberOfPassengers(){
        return this.passengers.size();
    }

    public void addPassenger(Passenger newPassenger){
        if (availableSeatsLeft() != 0) {
            this.passengers.add(newPassenger);
        }
    }

    public int availableSeatsLeft(){
        return this.plane.getPlanetype().getCapacity() - getNumberOfPassengers();
    }
}
