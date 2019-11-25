import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

private Flight flight;
private Plane plane;
private ArrayList<Passenger> passengers;
private Passenger passenger;
private Passenger passenger2;
private Passenger passenger3;

@Before
public void before(){
    plane = new Plane(PlaneType.BOEING747);
    passenger = new Passenger("Bob", 2);
    passenger2 = new Passenger("Angela", 1);
    passenger3 = new Passenger("Juan", 6);
    passengers = new ArrayList<Passenger>();
    flight = new Flight(plane, passengers,"EZY4567", "EDINBURGH","SEVILLA", "0950");
}

@Test
public void canGetPlane(){
    assertEquals(PlaneType.BOEING747, flight.getPlane().getPlaneType());
}

@Test
public void canGetFlightNumber(){
    assertEquals("EZY4567", flight.getFlightNumber());
}

@Test
public void canGetPlaneType(){
assertEquals(PlaneType.BOEING747, flight.getPlane().);
}

@Test
public void canGetPointOfDeparture(){
assertEquals("SEVILLA", flight.getDepartureAirport());
}

@Test
public void canGetDestination(){
    assertEquals("EDINBURGH", flight.getFlightDestination());
}

@Test
public void canGetFlightTime(){
    assertEquals("0950", flight.getFlightTime());
}

//@Test
//public void canGetNumberOfPassengers(){
//    return flight.passengers.size();
//}


@Test
    public void isThereAnAvailableSeat(){
    flight.getPassengers();
    assertEquals(true, flight.seatIsAvailable());
}


@Test
    public void flightCanBookPassenger(){
    flight.bookPassenger(passenger);
    assertEquals(1, flight.getPassengers().size());
}

@Test
    public void canGetAvailableSeats(){
    flight.bookPassenger(passenger);
    flight.bookPassenger(passenger2);
    assertEquals(198, flight.getNumberOfAvailableSeats());
}

}


