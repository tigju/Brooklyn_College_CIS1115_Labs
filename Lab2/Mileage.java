import java.util.Scanner;
/**
   This program will calculate gallons
   of gas used per mile based on mileage and 
   number of gallons used.
   Iuliia Stanina,
   Lab 2,
   09/16/2020 
*/
public class Mileage
{
   public static void main(String[] args)
   {
   // Add your declaration and code here.
   // initialize scanner
    Scanner keyboard = new Scanner(System.in);
    
    //  ask for miles driven
    System.out.print("How many miles were driven: ");
    // get the input miles
    double miles = keyboard.nextDouble();
    
    // ask for gallons used
    System.out.print("How many gallons used: ");
    // get the input gallons
    double gallons = keyboard.nextDouble();
    // check for zero value (can't divide by 0)
    // if value is zero promt user again
    while (gallons == 0) {
      System.out.print("try again. How many gallons used: ");
      gallons = keyboard.nextFloat();
    } 
    // calculate miles divide by gallons
    double gallonsPerMile = miles/gallons;
    
    // print gallonsPerMile
    System.out.println("Gallons per mile: " + gallonsPerMile);
   }
}