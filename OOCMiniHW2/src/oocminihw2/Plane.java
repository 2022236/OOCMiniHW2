package oocminihw2;

import ioutils.IOUtils;

/**
 *
 * @author lizam
 */
class Plane implements Flyable {
    IOUtils myInput = new IOUtils();
    private float speed; 
    
    @Override
    public void changeAltitude(float change) { // quinto
       float newAltitute = (float) myInput.getUserInt("Would you like to change the altitude?", 100, 350);
      //  System.out.println("You chose change to " + newAltitude + " km/h");
    }

    @Override
    public float getAltitude() { //terceiro
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
    @Override
    public void accelerate(float speed) { //segundo
        String getAltitude = myInput.getUserText("We suggest you to get accelerate now. Are you ready?");
        if (getAltitude.equalsIgnoreCase("yes")){
            try {
          Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("Something went wrong");
        }
            System.out.println("Perfect! Airplane will accelerate with the speed you are going to choose.");
            float newSpeed = (float) myInput.getUserInt("Please enter the speed you would like to start get altitude", 80, 110);
            this.speed = newSpeed;
        }else {
            System.out.println("Take your time, however if you are not ready, you will have to do all again.");
            System.exit(0);
        }
        return;
    }
    
    @Override
    public void brake() { //sexto
        System.out.println("The airplane has arrived in the destination.");
    }

    @Override
    public float getSpeed() { //primeiro
        System.out.println("");
        float newSpeed = (float) myInput.getUserInt("Please enter the speed you would like to start",150 , 250);
        this.speed = newSpeed;
        try {
          Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("Something went wrong");
        }
        return newSpeed;
    }

    @Override
    public void getDirection() { //quarto
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
