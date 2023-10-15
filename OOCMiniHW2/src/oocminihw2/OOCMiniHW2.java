package oocminihw2;

import ioutils.IOUtils;
/**
 *
 * @author lizam
 */
public class OOCMiniHW2 {

    public static void main(String[] args) {
        IOUtils myInput = new IOUtils();
        boolean vehicleChosen = true;
        System.out.println("Welcome to VroomVille Driving School.");

        while (vehicleChosen){
        String userChoice = myInput.getUserText("Which one would you like to learn to drive? Car, Boat or Airplane");
        switch (userChoice){
            case "car":
               Car userCar = new Car();
               userCar.getSpeed();
               userCar.accelerate(0);
               System.out.println("After this test lesson, we suggest you to stop and keep practicing on the app.");
               userCar.brake();
               System.exit(0);
                break;
            case "boat": 
               Boat userBoat = new Boat(2);
               userBoat.hoistSail();
               userBoat.lowerSail();
               userBoat.landHo();
               System.exit(0);
                break;
            case "airplane":
                System.out.println("Choosing airplane you are able to just simulate in our virtual simulator.");
               Plane userPlane = new Plane();
               userPlane.getSpeed();
               userPlane.accelerate(0);
               userPlane.getAltitude();
               userPlane.getDirection();
               userPlane.changeAltitude(0);
               userPlane.brake();
               System.exit(0);
                break;
            default: 
                System.out.println("Please enter a valid choice.");
                System.exit(0);
                
        }
    }
    }
    
}
