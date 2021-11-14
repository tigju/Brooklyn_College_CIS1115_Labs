// TASK #2 Add an import statement for the Scanner class
// TASK #2(Alternate)
// Add an import statement for the JOptionPane class

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Math.*;

/**
   This program demonstrates how numeric types and
   operators behave in Java.
   This program prints full name
   and calculates volume of the sphere.
   
   Iuliia Stanina,
   Lab 2,
   09/16/2020
*/
public class NumericTypes
{
   public static void main (String [] args)
   {
      // TASK #2 Create a Scanner object here
      // (not used for alternate)

      // Identifier declarations
      final int NUMBER = 2;        // Number of scores
      final double SCORE1 = 100;       // First test score
      final double SCORE2 = 95;        // Second test score
      final int BOILING_IN_F = 212; // Boiling temperature
      int fToC;                     // Temperature Celsius
      double average;               // Arithmetic average
      String output;                // Line of output

      // TASK #2 declare variables used here
      // TASK #3 declare variables used here
      // TASK #4 declare variables used here

      // Find an arithmetic average.
      average = (SCORE1 + SCORE2) / NUMBER;
      output = SCORE1 + " and " + SCORE2 +
               " have an average of " + average;
      System.out.println(output);

      // Convert Fahrenheit temperature to Celsius.
      fToC = (BOILING_IN_F - 32) * 5/9;
      output = BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius.";
      System.out.println(output);
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #2 HERE
      Scanner keyboard = new Scanner(System.in);
      
      // Prompt the user for first name
      // System.out.print("Enter your first name: ");
      
      // Read the user's first name
      // String firstName = keyboard.nextLine();
      
      String first_name = JOptionPane.showInputDialog("First Name");
      
      // Prompt the user for last name
      // System.out.print("Enter your last name: ");
      
      // Read the user's last name
      // String lastName = keyboard.nextLine();
      
      String last_name = JOptionPane.showInputDialog("Last Name");
      
      // Concatenate the user's first and last names
      // String fullName = firstName + " " + lastName;
      
      String full_name = first_name + " " + last_name;
      
      // Print out the user's full name
      // System.out.println(fullName + " characters in your name " + fullName.length());

      System.out.println(full_name + " characters in your name " + full_name.length());
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #3 HERE
      // Get the first character from the user's first name
      // char firstChar = firstName.charAt(0);
      
      char firstInitial = first_name.charAt(0);
      char lastInitial = last_name.charAt(0);
      // Print out the user's first initial
      // System.out.println("First name initial: " + firstChar);
      
      System.out.println("Name initial: " + firstInitial + lastInitial);
     
      // Convert the user's full name to uppercase
      // String uppercaseName = firstName.toUpperCase();
      
      String uppercaseName = first_name.toUpperCase();
      
      // Print out the user's full name in uppercase
      // System.out.println("First name in uppercase: " + uppercaseName);
      
      System.out.println("First name in uppercase: " + uppercaseName);
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #4 HERE
      // Prompt the user for a diameter of a sphere
      System.out.print("Diameter of a sphere: ");
      
      // Read the diameter
      double diameter = keyboard.nextDouble();
      
      // Calculate the radius
      double radius = diameter/(double) 2;
      
      // Calculate the volume
      double volume = (double) 4/(double) 3 * Math.PI * Math.pow(radius, (double) 3);
      
      // Print out the volume
      System.out.println("Volume of a sphere: "+ volume);
   }
}