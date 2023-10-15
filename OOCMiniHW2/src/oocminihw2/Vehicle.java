package oocminihw2;

/** 
 *
 * @author lizam
 */
public abstract class Vehicle {
    // I chose not call much this class since I found confusing how to call all this attributes in methods and having 
    // a school driving simulator. So I made sure to call at least one just to show that it was called with the one
    // it made sense to my idea of code
    
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

