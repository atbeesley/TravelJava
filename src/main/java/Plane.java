public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }


    public PlaneType getPlaneType(){
        return this.planeType;
    }

    public int getTotalWeightFromEnum(){
        return this.planeType.totalWeight();
    }


    public int getCapacityFromEnum(){
        return this.planeType.capacity();
    }



}
