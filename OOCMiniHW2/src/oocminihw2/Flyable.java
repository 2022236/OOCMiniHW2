package oocminihw2;

/** This interface will inherit features from the Drivable class 
 * 
 * @author lizm
 */
public interface Flyable extends Drivable { 
    public void changeAltitude(float change);
    public float getAltitude();
}
