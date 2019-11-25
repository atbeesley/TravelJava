public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }


    public PlaneType getPlaneType(){
        return this.planeType;
    }

    public int getTotalWeightFromEnum(){
        return this.planeType.getTotalWeight();
    }


    public int getCapacityFromEnum(){
        return this.planeType.getCapacity();
    }



}
