package oocminihw2;
import ioutils.IOUtils;
/**
 *
 * @author lizam
 */
public class Car implements Drivable {
    IOUtils myInput = new IOUtils();
    private float speed; 
    
    @Override
    public void accelerate(float speed) {
        float newSpeed = (float) myInput.getUserInt("Please enter the speed you would like to start", 5, 35);
        this.speed = newSpeed;
        System.out.println("The car speed is " + newSpeed + " km/h");
    }
    @Override
    public void brake() {
        System.out.println("The car stopped.");
    }
    @Override
    public float getSpeed() {
        System.out.println("The current speed is 0km/h");
        String userInput = myInput.getUserText("Would you like to get speed now or later?");
        switch (userInput){
            case "now": 
                System.out.println("Great. Wait for a moment you are going to be redirected to Accelerate section!");
                System.out.println("Remember that this is just a simulator!");
                break;
            case "later": 
                System.out.println("No problem, take your time!");
               System.exit(0);
                break; 
            default: 
                System.out.println("Something went wrong.");
        }
        return 0;
    }
    @Override
    public void getDirection() {
        String keepDriving = myInput.getUserText("Would you like to keep driving");  
    }
}