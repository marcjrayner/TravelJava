public enum PlaneType {
    BOEING747(600, 15000),
    DREAMLINER(450, 12000),
    AIRBUSA380(900, 20000);

    private final int capacity;
    private final int maxWeight;

    PlaneType(int capacity, int maxWeight) {
        this.capacity = capacity;
        this.maxWeight = maxWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
