package oocminihw2;
import ioutils.IOUtils;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lizam
 */
class Boat extends Vehicle implements Sailable {
    IOUtils myInput = new IOUtils();
    
    public Boat(int numSails) {
        super(2);
        System.out.println("You have two sails in this boat.");
    }
    @Override
    public void hoistSail() {
        System.out.println("First you have to hoist the sail. Pay attention in how the instructor do.");
        try {
          Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("Something went wrong");
        } finally { 
         System.out.println("You hoisted well.");
        }
    }
    @Override
    public void lowerSail() {
        String lowerSail = myInput.getUserText("Now you are going to lower the sail alone. Are you ready?");
        if (lowerSail.equalsIgnoreCase("yes")){
            System.out.println("Perfect! Well done!");
        }else {
            System.out.println("Take your time. If you are not ready, you will have to do all again.");
            System.exit(0);
        }   
    }
    @Override
    public boolean isSailHoisted() {
        return true;
    }
    @Override
    public void landHo() {
        System.out.println("Keep following the instructor, you are almost landing.");
        try {
          Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("Something went wrong");
        } finally { 
         System.out.println("You did well. Thank you!");
        }
    }   
}