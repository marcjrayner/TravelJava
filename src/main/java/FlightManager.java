public class FlightManager {
    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public int calculateBaggageWeightPerPassenger() {
        double totalWeightReservedForBags = (double)this.flight.getPlane().getMaxWeight() / 2;
        double amountOfWeightReservedPerPassenger = totalWeightReservedForBags / (double)this.flight.getPlane().getCapacity();
        return (int)Math.floor(amountOfWeightReservedPerPassenger);
    }

//    public int calculateBookedBaggageWeight() {
//        return this.fli
//    }
}
