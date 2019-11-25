import java.util.ArrayList;

public class Passenger {

    private String name;
    private int numberOfBags;
    private ArrayList<Passenger> passengers;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;

    }

    public String getName(){
        return this.name;
    }

    public int getNumberOfBags(){
        return this.numberOfBags;
    }


}
