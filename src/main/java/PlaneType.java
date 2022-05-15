public enum PlaneType {
    AIRBUSA830(525, 92900),
    AIRBUS320(220, 36400),
    BOEING707(190, 40000),
    BOEING727(149, 19660);

    private final int capacity;
    private final int maxLoadWeight;

    PlaneType(int capacity, int maxLoadWeight){
        this.capacity = capacity;
        this.maxLoadWeight = maxLoadWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMaxLoadWeight() {
        return maxLoadWeight;
    }
}
