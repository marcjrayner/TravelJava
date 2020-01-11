import java.util.ArrayList;
import java.util.Date;

public class Flight {
    private Plane plane;
    private ArrayList<Passenger> passengers;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private Date departureTime;

    public Flight(Plane plane, String flightNo, String destination, String departureAirport, Date departureTime) {
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }


    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNo() {
        return this.flightNo;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDestination() {
        return this.destination;
    }

    public Date getDepartureTime() {
        return this.departureTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return new ArrayList<Passenger>(this.passengers);
    }

    public int getAvailableSeats() {
        int noOfPassengers = this.passengers.size();
        if (noOfPassengers > 0) {
            return this.plane.getCapacity() - noOfPassengers;
        } else {
            return this.plane.getCapacity();
        }
    }

    public void bookPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }
}
