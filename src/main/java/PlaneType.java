public enum PlaneType {

    BOEING747(200, 1000),
    BOEING767(220, 1100),
    BOEING777(235, 1200),
    BOEING787(225, 1300),
    AIRBUSA300(250, 1500),
    AIRBUSA330(240, 1400);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getTotalWeight(){
        return this.totalWeight;
    }


    public int getCapacity(){
        return this.capacity;
    }



}
