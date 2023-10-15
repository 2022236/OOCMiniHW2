package oocminihw2;

/**
 *
 * @author lizam
 */
public abstract class Vehicle {
    private float speed;
    private float direction = 0;
    private String make;
    private String type;
    protected int numWheels = 0;
    protected int numWings = 0;
    private int numSails;
    private int numPassengers;

    public Vehicle(int numSails) {
        this.numSails = numSails;
    }
    public int getNumSails() {
        return numSails;
    }
    public void setNumSails(int numSails) {
        this.numSails = numSails;
    }
    

}

