import java.util.Scanner;

/**
   This program demonstrates static methods
*/

public class Geometry
{
   public static void main(String[] args)
   {
      int choice;       // The user's choice
      double value = 0; // The method's return value
      char letter;      // The user's Y or N decision
      double radius;    // The radius of the circle
      double length;    // The length of the rectangle
      double width;     // The width of the rectangle
      double height;    // The height of the triangle
      double base;      // The base of the triangle
      double side1;     // The first side of the triangle
      double side2;     // The second side of the triangle
      double side3;     // The third side of the triangle

      // Create a scanner object to read from the keyboard
      Scanner keyboard = new Scanner(System.in);

      // The do loop allows the menu to be displayed first
      do
      {
         // TASK #1 Call the printMenu method
         printMenu();

         choice = keyboard.nextInt();

         switch(choice)
         {
            case 1:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circleArea method and
               // store the result in the value variable
               value = areaCircle(radius);

               System.out.println("The area of the " +
                                  "circle is " + value);
               break;
            case 2:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the rectangleArea method and
               // store the result in the value variable
               value = areaRectangle(width, length);

               System.out.println("The area of the " +
                                  "rectangle is " + value);
               break;
            case 3:
               System.out.print("Enter the height of " +
                                "the triangle: ");
               height = keyboard.nextDouble();
               System.out.print("Enter the base of " +
                                "the triangle: ");
               base = keyboard.nextDouble();

               // TASK #3 Call the triangleArea method and
               // store the result in the value variable
               value = areaTriangle(height, base);

               System.out.println("The area of the " +
                                  "triangle is " + value);
               break;
            case 4:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circumference method and
               // store the result in the value variable
               value = circumferenceCircle(radius);

               System.out.println("The circumference " +
                                  "of the circle is " +
                                  value);
               break;
            case 5:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value = perimeterRectangle(width, length);

               System.out.println("The perimeter of " +
                                  "the rectangle is " +
                                  value);
               break;
            case 6:
               System.out.print("Enter the length of " +
                                "side 1 of the " +
                                "triangle: ");
               side1 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 2 of the " +
                                "triangle: ");
               side2 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 3 of the " +
                                "triangle: ");
               side3 = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value = perimeterTriangle(side1, side2, side3);
               

               System.out.println("The perimeter of " +
                                  "the triangle is " +
                                  value);
               break;
            default:
               System.out.println("You did not enter " +
                                  "a valid choice.");
         }
         keyboard.nextLine(); // Consume the new line

         System.out.println("Do you want to exit " +
                            "the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         letter = answer.charAt(0);

      } while(letter != 'Y' && letter != 'y');
   }

   // TASK #1 Create the printMenu method here
   /**
   * This method is used to show the menu of choices
   * for the geometry calculator. 
   * @param method doesn't take any parameters, it doesn't return anything, it prints the strings containing choices for geometry calculator
   * @author Iuliia Stanina
   * @since 10-17-2020
   */
   public static void printMenu() {
      System.out.println("This is a geometry calculator");
      System.out.println("Choose what would you like to calculate: ");
      System.out.println("1. Find the area of a circle.");
      System.out.println("2. Find the area of a rectangle");
      System.out.println("3. Find the area of a triangle");
      System.out.println("4. Find the circumference of a circle");
      System.out.println("5. Find the perimeter of a rectangle");
      System.out.println("6. Find the perimeter of a triangle");
      System.out.println("Enter your choice: ");
   }
   // TASK #2 Create the value-returning methods here
   /**
   * This method is used to calculate area of a circle when
   * radius value is given. 
   * @param radius The type of radius paramter is double of areaCircle method
   * @return double This returns area of a circle PI*(radius*radius)
   * @author Iuliia Stanina
   * @since 10-17-2020
   */
   public static double areaCircle(double radius) {
   
      double areac = Math.PI * (radius * radius);
      return areac;
   }
   
   /**
   * This method is used to calculate area of a rectangle when
   * width and length values are given. 
   * @param width The type of width is double 
   * @param length The type of length is double
   * @return double This returns area of a rectangle width*length
   * @author Iuliia Stanina
   * @since 10-17-2020
   */
   public static double areaRectangle(double width, double length) {
      double arear = width * length;
      return arear;
   }
   
   /**
   * This method is used to calculate area of a triangle when
   * base and height values are given. 
   * @param height The type of height is double 
   * @param base The type of base is double
   * @return double This returns area of a triangle (height*base)/2
   * @author Iuliia Stanina
   * @since 10-17-2020
   */
   public static double areaTriangle(double height, double base) {
      double areat = (height*base)/2;
      return areat;
   }
   
   /**
   * This method is used to calculate circumference of a circle when
   * radius value is given. 
   * @param radius The type of radius paramter is double
   * @return double This returns circumference of a circle 2*PI*radius
   * @author Iuliia Stanina
   * @since 10-17-2020
   */
   public static double circumferenceCircle(double radius) {
      double circumference = 2 * Math.PI * radius;
      return circumference;
   }
      
   /**
   * This method is used to calculate perimeter of a rectangle when
   * width and length values are given. 
   * @param width The type of width is double 
   * @param length The type of length is double
   * @return double This returns perimeter of a rectangle width*2 + length*2
   * @author Iuliia Stanina
   * @since 10-17-2020
   */

   public static double perimeterRectangle(double width, double length) {
      double perimeter = width *2 + length*2;
      return perimeter;
   }
   
   /**
   * This method is used to calculate perimeter of a triangle when
   * all three side values are given. 
   * @param base The type of base is double 
   * @param side1 The type of side1 is double
   * @param side2 The type of side2 is double
   * @return double This returns perimeter of a triangle base + side1 + side2
   * @author Iuliia Stanina
   * @since 10-17-2020
   */
   public static double perimeterTriangle(double base, double side1, double side2) {
      double perimetert = base + side1 + side2;
      return perimetert;
   }
   // TASK #4 Write javadoc comments for each method
}