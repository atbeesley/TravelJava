import java.util.ArrayList;

public class Flight {

    public String getPointOfDeparture;
    private Plane plane;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;


    public Flight(
            Plane plane, ArrayList<Passenger> passengers, String flightNumber, String destination, String departureAirport, String departureTime
    ){
        this.plane = plane;
        this.passengers = passengers;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    };


    public Plane getPlane(){
        return this.plane;
    }


    public ArrayList<Passenger> getPassengers(){
        return this.passengers;
    }
//
    public boolean seatIsAvailable(){
      return (this.passengers.size() <= this.plane.getCapacityFromEnum());
    }
//
    public String getFlightNumber() {
        return this.flightNumber;
    }
//
//
    public void bookPassenger(Passenger passenger){
        if (this.passengers.size() < this.plane.getCapacityFromEnum()) {
            this.passengers.add(passenger);
        }
    }
//
    public int getNumberOfAvailableSeats() {
        ArrayList<Passenger> unavailableSeats = new ArrayList<Passenger>();
        int availableSeats = this.plane.getCapacityFromEnum();
        for (Passenger passenger : this.passengers) {
                unavailableSeats.add(passenger);
            }
        return availableSeats -= unavailableSeats.size();
    }


    public String getFlightTime() {
        return this.departureTime;

    }

    public String getDepartureAirport() {
        return this.departureAirport;

    }

    public String getFlightDestination() {
        return this.destination;
    }
}



