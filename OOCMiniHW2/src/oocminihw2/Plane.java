package oocminihw2;
import ioutils.IOUtils;
/**
 *
 * @author lizm
 */
class Plane implements Flyable { 
    // all the methods overriden came from the interface which here will have a body 
    // I would have liked more to make it organised but since this one Sam chose Flyable extending Drivable, all the methods 
    // would inherit in the sequency from the class. However, once is in the main class is being called in the right order.  
    // Airplane is the longest of methods but I tried to make something that makes sense on prompts
    IOUtils myInput = new IOUtils();
    private float speed; 
    
    @Override // inherited from the Flyable
    public void changeAltitude(float change) { // fifth in the calling ordemr
       float newAltitute = (float) myInput.getUserInt("Would you like to change the altitude?", 100, 350);
    }
    @Override // inherited from the Flyable
    public float getAltitude() { // third on the calling ordem
        String getAltitude = myInput.getUserText("We suggest you to get more altitude now. Are you ready?");
        if (getAltitude.equalsIgnoreCase("yes")){
            float newSpeed = (float) myInput.getUserInt("Please enter the altitude", 80, 110);
            this.speed = newSpeed;
            System.out.println("Perfect! Airplane is getting altitude.");
        }else {
            System.out.println("Take your time. If you are not ready, you will have to do all again since is just one way and cannot wait.");
            System.exit(0);
        }
        return 0;
    }
    @Override // inherited from the drivable that was called inside the Flyable
    public void accelerate(float speed) { // sscond on the calling order
        String getAltitude = myInput.getUserText("We suggest you to get accelerate now. Are you ready?");
        if (getAltitude.equalsIgnoreCase("yes")){
            try { // I chose a thread just to give the illusion of time on the game
          Thread.sleep(2000); //the thread would just work inside a try-catch block
        } catch (InterruptedException ex) {
            System.out.println("Something went wrong");
        }
            System.out.println("Perfect! Airplane will accelerate with the speed you are going to choose.");
            float newSpeed = (float) myInput.getUserInt("Please enter the speed you would like to start get altitude", 80, 110);
            // here is actually the part made for the method, a float
            this.speed = newSpeed;
        }else {
            System.out.println("Take your time, however if you are not ready, you will have to do all again.");
            System.exit(0);
        }
        return;
    }
    @Override
    public void brake() { // sixth on the order
        System.out.println("The airplane has arrived in the destination.");
    }
    @Override // inherited from the drivable that was called inside the Flyable
    public float getSpeed() { // first on the order 
        // .getSpeed() and .accelerate look the same but they are not. The .getSpeed will retrieve the current speed but do not change the speed
       // but the .accelerate will actually accelerate to then .getAltitude
        System.out.println("");
        float newSpeed = (float) myInput.getUserInt("Please enter the speed you would like to start",150 , 250);
        this.speed = newSpeed;
        try { // I chose a thread just to give the illusion of time on the game
          Thread.sleep(2000); //the thread would just work inside a try-catch block
        } catch (InterruptedException ex) {
            System.out.println("Something went wrong");
        }
        return newSpeed;
    }
    @Override  // inherited from the drivable that was called inside the Flyable
    public void getDirection() { // fourth on the order 
        String direction = myInput.getUserText("Which direction would you like to go? North, East or West");
        switch (direction){
            case "north": 
                System.out.println("Changing routes to North");
                break;
            case "east": 
                System.out.println("Changing routes to East");
                break;    
            case "west": 
                System.out.println("Changing routes to West");
                break; 
            default: 
                System.out.println("Something went wrong.");
        }
        System.out.println("Great, however it is time to end this lesson. ");
        System.exit(0);
    }   
}
