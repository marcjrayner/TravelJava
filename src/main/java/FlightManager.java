public class FlightManager {
    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public int calculateBaggageWeightPerPassenger() {
        double totalWeightReservedForBags = (double) this.flight.getPlane().getMaxWeight() / 2;
        double amountOfWeightReservedPerPassenger = totalWeightReservedForBags / (double) this.flight.getPlane().getCapacity();
        return (int) Math.floor(amountOfWeightReservedPerPassenger);
    }


    public int calculateBookedBaggageWeight() {
        int totalBookedBagsWeight = 0;
        for (Passenger passenger : this.flight.getPassengers()) {
            totalBookedBagsWeight += (passenger.getNumOfBags() * 5); // weight of every bag is 5
        }
        return totalBookedBagsWeight;
    }

    public int calculateRemainingBaggageWeightReserved() {
        int totalWeightReservedForBags = this.flight.getPlane().getMaxWeight() / 2;
        return totalWeightReservedForBags - calculateBookedBaggageWeight();
    }
}
