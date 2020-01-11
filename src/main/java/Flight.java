import java.util.ArrayList;

public class Flight {
    private Plane plane;
    private ArrayList<Passenger> passengers;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNo, String destination, String departureAirport, String departureTime) {
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
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

    public String getDepartureTime() {
        return this.departureTime;
    }
}
