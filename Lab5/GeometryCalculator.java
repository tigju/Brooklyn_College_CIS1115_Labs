import java.util.Scanner;

public class GeometryCalculator {

   public static void main(String[] args) {
   
      boolean flag = true;
      
      while (flag == true) {
         Scanner keyboard = new Scanner(System.in);
         System.out.println("This is a geometry calculator");
         System.out.println("Choose what would you like to calculate: ");
         System.out.println("1. Find the area of a circle.");
         System.out.println("2. Find the area of a rectangle");
         System.out.println("3. Find the area of a triangle");
         System.out.println("4. Find the circumference of a circle");
         System.out.println("5. Find the perimeter of a rectangle");
         System.out.println("6. Find the perimeter of a triangle");
         System.out.println("Enter your choice: ");
         
         int choice = keyboard.nextInt();
         
         if (choice == 1) {
            areaCircle();
         }
         if (choice == 2) {
            areaRectangle();
         }
         if (choice == 3) {
            areaTriangle();   
         } 
         if (choice == 4) {
            circumferenceCircle();   
         }
         if (choice == 5) {
            perimeterRectangle();   
         }
         if (choice == 6) {
            perimeterTriangle();   
         } 
         
         System.out.println("Do you want to exit the program (Y/N)?: ");
         keyboard.nextLine();
         String str = keyboard.nextLine();
         System.out.println(str);
         char ch = str.charAt(0);
         if (ch == 'y') {
            flag = false;
         }
         else if (ch == 'n') {
            flag = true;
         }
         else {
            flag = true;
         }
      }
      
   }
    
   public static void areaCircle() {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the radius of a circle: ");
      double radius = keyboard.nextDouble();
      double areac = Math.PI * (radius * radius);
      System.out.printf("Area of a circle with the radius of %.1f is %f\n", radius, areac);
   }
   
   public static void areaRectangle() {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the width of a rectangle: ");
      double width = keyboard.nextDouble();
      System.out.print("Enter the length of a rectangle: ");
      double length = keyboard.nextDouble();
      double arear = width * length;
      System.out.printf("Area of a rectangle with the width of %.1f and the length of %.1f is %.1f\n", width, length, arear);
   }
   
   public static void areaTriangle() {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the base of a triangle: ");
      double base = keyboard.nextDouble();
      System.out.print("Enter the height of a triangle: ");
      double height = keyboard.nextDouble();
      double areat = (height*base)/2;
      System.out.printf("Area of a triangle with the base of %.1f and the height of %.1f is %.1f\n", base, height, areat);
   }
   
   public static void circumferenceCircle() {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the radius of a circle: ");
      double radius = keyboard.nextDouble();
      double circumference = 2 * Math.PI * radius;
      System.out.printf("Circumference of a circle with the radius of %.1f is %f\n", radius, circumference);
   }
   
   public static void perimeterRectangle() {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the width of a rectangle: ");
      double width = keyboard.nextDouble();
      System.out.print("Enter the length of a rectangle: ");
      double length = keyboard.nextDouble();
      double perimeter = width *2 + length*2;
      System.out.printf("Perimeter of a rectangle with the width of %.1f and the length of %.1f is %.1f\n", width, length, perimeter);
   }
   
   public static void perimeterTriangle() {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the base of a triangle: ");
      double base = keyboard.nextDouble();
      System.out.print("Enter the side 1 of a triangle: ");
      double side1 = keyboard.nextDouble();
      System.out.print("Enter the side 2 of a triangle: ");
      double side2 = keyboard.nextDouble();
      double perimetert = base + side1 + side2;
      System.out.printf("Perimeter of a triangle with the base of %.1f, side 1 of %.1f and side 2 of %.1f is %.1f\n", base, side1, side2, perimetert);
   }

    

}