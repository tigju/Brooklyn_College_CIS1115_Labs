import java.util.Scanner;  // Needed for the Scanner class

/**
   This class demonstrates the Television class.
*/

public class PortableTelevisionDemo
{
   public static void main(String[] args)
   {
      // Create a Scanner object to read from the keyboard
      Scanner keyboard = new Scanner (System.in);

      // Declare variables
      int station;         // The user's channel choice

      // Declare and instantiate a television object
      Television portable = new Television("Sharp", 19);

      // Turn the power on
      portable.power();

      // Display the state of the television
      System.out.println("A " +
                         portable.getScreenSize() +
                         " inch " +
                         portable.getManufacturer() +
                         " has been turned on.");

      // Prompt the user for input and store into station
      System.out.print("What channel do you want? ");
      station = keyboard.nextInt();

      // Change the channel on the television
      portable.setChannel(station);

      // Decrease the volume of the television
      portable.decreaseVolume();
      portable.decreaseVolume();
      
      // Display the the current channel and
      // volume of the television
      System.out.println("Channel: " +
                         portable.getChannel() +
                         " Volume: " +
                         portable.getVolume());


      System.out.println();   // For a blank line

   }
}