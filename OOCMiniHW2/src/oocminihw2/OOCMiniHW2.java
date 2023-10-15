package oocminihw2;
import ioutils.IOUtils;

/** The idea of this code is learning a school simulator where is available to learn how to drive with simple 
 * directions. 
 * I have changed some parts comparing with the code given by Sam but still have the same idea and hopefully  
 * is not going to be a problem.
 * @author lizm 2022236 
 */
public class OOCMiniHW2 {

    public static void main(String[] args) {
        IOUtils myInput = new IOUtils(); // The IOUtils is a important validator which checks if the user is writting correctly what is being asked
       // boolean vehicleChosen = true;
        System.out.println("Welcome to VroomVille Driving School."); // Friendly prompt 

       // while (vehicleChosen){
        String userChoice = myInput.getUserText("Which one would you like to learn to drive? Car, Boat or Airplane");
        switch (userChoice){ // Using switch to make the code more organized, the moment the user input their choice
                            // will just redirect to the choice and each of it, will have actions from the class it is called 
            case "car":
               Car userCar = new Car(); // Creating a new object 
               userCar.getSpeed(); // each action leads to some movement and/or something to do
               userCar.accelerate(0);
               System.out.println("After this test lesson, we suggest you to stop and keep practicing on the app.");
               userCar.brake();
               System.exit(0);
                break;
            case "boat": 
               Boat userBoat = new Boat(2);// Creating a new object 
               userBoat.hoistSail(); // each action leads to some movement and/or something to do
               userBoat.lowerSail();
               userBoat.landHo();
               System.exit(0);
                break;
            case "airplane":
               Plane userPlane = new Plane(); // Creating a new object 
               userPlane.getSpeed(); // each action leads to some movement and/or something to do
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
  //  } 
}
