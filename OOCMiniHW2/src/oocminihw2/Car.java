package oocminihw2;
import ioutils.IOUtils;
/**
 *
 * @author lizm
 */
public class Car implements Drivable {
    // all the methods overriden came from the interface which here will have a body
    IOUtils myInput = new IOUtils();
    private float speed; 
    
    @Override
    public void accelerate(float speed) { // this part is reponsible for getting from user the spped the want with min and max values 
        // since they are learning how to drive
        float newSpeed = (float) myInput.getUserInt("Please enter the speed you would like to accelerate", 20, 50);
        this.speed = newSpeed;
        System.out.println("The car speed is " + newSpeed + " km/h");
    }
    @Override
    public void brake() {
        System.out.println("The car stopped.");
    }
    @Override
    public float getSpeed() { // this part is reponsible to get speed 
        System.out.println("The current speed is 0km/h");
        String userInput = myInput.getUserText("Would you like to get speed now or later?");
        switch (userInput){ // put some text just to make more intereactive
            case "now": 
            float newSpeed = (float) myInput.getUserInt("Please enter the speed you would like to start", 5, 35);
            this.speed = newSpeed;
            System.out.println("The car speed is " + newSpeed + " km/h");
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
    public void getDirection() { // this part is reponsible for just getting from the user if they want to keep driving or no
        String direction = myInput.getUserText("Would you like to keep driving?");
        switch (direction){
            case "yes": 
                System.out.println("Great, keep straigth");
                break;
            case "no": 
                System.out.println("No problem.");
                System.exit(0);
                break;    
            default: 
                System.out.println("Something went wrong.");
        }
    }
}