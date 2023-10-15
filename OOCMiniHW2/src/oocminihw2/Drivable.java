package oocminihw2;

/** This interface has some basic movements, it is a bit less comparing with the one Sam gave 
 * but based from the idea that I thought about this game, those are enough
 *
 * @author lizm
 */
public interface Drivable {
    public void accelerate(float speed);
    public void brake();
    public float getSpeed();   
    public void getDirection();
}
