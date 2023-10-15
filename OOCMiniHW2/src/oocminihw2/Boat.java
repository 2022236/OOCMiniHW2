package oocminihw2;
import ioutils.IOUtils;
/** 
 *
 * @author lizm
 */
class Boat extends Vehicle implements Sailable { // This line is reponsible for calling the Vehicle and Sailable 
    // all the methods overriden came from the interface which here will have a body
    IOUtils myInput = new IOUtils();
    
    public Boat(int numSails) { 
        super(2);
        System.out.println("You have two sails in this boat.");
    }
    @Override
    public void hoistSail() { // This part will just make hoist sail, simulating
        System.out.println("First you have to hoist the sail. Pay attention in how the instructor do.");
        try {
          Thread.sleep(2000); // I chose a thread just to give the illusion that is taking time to hoist the sail
          // also the thread would just work inside a try-catch block
        } catch (InterruptedException ex) {
            System.out.println("Something went wrong");
        } finally { // Finally would run anyway 
         System.out.println("You hoisted well.");
        }
    }
    @Override
    public void lowerSail() { // This method is responsible for lower the sail
        String lowerSail = myInput.getUserText("Now you are going to lower the sail alone. Are you ready?");
        if (lowerSail.equalsIgnoreCase("yes")){
            System.out.println("Perfect! Well done!");
        }else {
            System.out.println("Take your time. If you are not ready, you will have to do all again.");
            System.exit(0);
        }   
    }
    @Override
    public boolean isSailHoisted() {  // This method is responsible to when the isSailedHoisted be called would return as a true statement
        return true;
    }
    @Override
    public void landHo() {// This method is responsible for land. Also I got confused with the name it was given and I just chose make simple
        System.out.println("Keep following the instructor, you are almost landing.");
        try {
          Thread.sleep(2000); // the thread would just work inside a try-catch block
        } catch (InterruptedException ex) {
            System.out.println("Something went wrong");
        } finally { 
         System.out.println("You did well. Thank you!");
        }
    }   
}