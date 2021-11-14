// CP2
/**
   This program will compute the values 
   of a formula that expresses y in terms of x
   
   Iuliia Stanina
   CP 2
   09/20/2020
**/

// import Math
import java.io.*;
import java.lang.Math.*;

public class CP2
{
   public static void main(String[] args) throws FileNotFoundException
   {
         PrintStream o = new PrintStream(new File("Output.txt")); 
        // Store current System.out before assigning a new value 
        PrintStream console = System.out; 
  
        // Assign o to output stream 
        System.setOut(o); 
      // declare variables
      double x, y, temp1, temp2;
      // assign x variable to starting point -3
      x = -3;
      // print the beginnig of the program
      System.out.print("======================================\n");
      System.out.print("This is the output of my first program\n");
      System.out.print("======================================\n");
      // loop until x is 4
      while (x <= 4) {
         // break down the formula in two temporary variables
         // temp1 is numerator of the formula 
         temp1 = (9 * Math.pow(x,3)) - (27 * Math.pow(x,2)) - (4 * x) + 12;
         // temp2 is denominator of the formula
         temp2 = (Math.sqrt((3 * Math.pow(x,2)) + 1)) + (Math.abs(5 - Math.pow(x, 4))); 
         // finally calculate y value deviding numerator by denominator (temp1/temp2)
         y = temp1 / temp2;
         // print out the result of the formula after each calculation
         System.out.print("X = " + String.format("%.1f", x) + "\t\t Y = " + String.format("%.3f", y) + "\t\t");
         // check if y equals 0 
         if (y == 0) {
            System.out.print("Y IS ZERO\n");
         }
         // check if y greater than 0
         if (y > 0) {
            System.out.print("Y IS POSITIVE\n");
         }
         // check if y less than 0
         if (y < 0) {
            System.out.print("Y IS NEGATIVE\n");
         }
         // increment x by 0.5
         x += 0.5;
      }  
      // print out the end of the program
      System.out.print("======================================\n");
      System.out.print("The program is halting\n");
      System.out.print("Stop\n");
      System.out.print("======================================\n");
   }
}
