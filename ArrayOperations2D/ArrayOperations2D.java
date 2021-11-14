import java.util.Scanner;

/**
   Array Operations 2D class
*/
public class ArrayOperations2D
{
   private int NUM_DIGITS = 3;
   private double[][] data;
   /**
      Constructor
   */
   public ArrayOperations2D()
   {
      data = new double[NUM_DIGITS][NUM_DIGITS];
      
     Scanner keyboard = new Scanner(System.in);
     
     System.out.print("This is 2D array containing 3 rows and 3 columns, " +
                      "enter all the decimal values to fill the 2D array\n");
     
     for (int i = 0; i < data.length; i++)
     {
         System.out.print("Enter 4 float numbers for row " +
                          (i + 1) + ": \n");
          for (int j = 0; j < data.length; j++) 
          {
            System.out.print("Enter number " + (j + 1) + ": ");               
            data[i][j] = keyboard.nextDouble();
          }
     }
     
    System.out.println("Printing all the results of the calculations ");
     
    // Printing all the results of total and average
    System.out.printf("Total : %.2f\n", getTotal(data));
    System.out.printf("Average : %.2f\n", getAverage(data));
    
    // Printing all the results of total per each row
    System.out.printf("Total of row 0 : %.2f\n", getRowTotal(data, 0));
    System.out.printf("Total of row 1 : %.2f\n", getRowTotal(data, 1));
    System.out.printf("Total of row 2 : %.2f\n", getRowTotal(data, 2));

    // Printing all the results of total per each column
    System.out.printf("Total of col 0 : %.2f\n", getColumnTotal(data, 0));
    System.out.printf("Total of col 1 : %.2f\n", getColumnTotal(data, 1));
    System.out.printf("Total of col 2 : %.2f\n", getColumnTotal(data, 2));

    // Printing all the highest value within each row
    System.out.printf("Highest in row 0 : %.2f\n", getHighestInRow(data, 0));
    System.out.printf("Highest in row 1 : %.2f\n",getHighestInRow(data, 1));
    System.out.printf("Highest in row 2 : %.2f\n", getHighestInRow(data, 2));
            
    // Printing all the highest value within each column            
    System.out.printf("Lowest in row 0 : %.2f\n", getLowestInRow(data, 0));
    System.out.printf("Lowest in row 1 : %.2f\n", getLowestInRow(data, 1));
    System.out.printf("Lowest in row 2 : %.2f\n", getLowestInRow(data, 2));
     
   }
   
   /**
      The getTotal method calculates the sum of all the values in 2D array
      and returns it
   */
   public static double getTotal(double[][] array) {
      double total = 0;

      for (int row = 0; row < array.length; row++) {
         for (int col = 0; col < array[row].length; col++) {
            total += array[row][col];
         }
      }
      
    return total;
   } 
   
   /**
      The getAverage method calculates the mean of all the values in 2D array
      and returns it
   */
   public static double getAverage(double[][] array) {
      return getTotal(array) / getElementCount(array);
   }
   
   /**
      The getElementCount method counts the number of all the values in 2D array
      and returns it. It is helper function to calculate average
   */
   public static int getElementCount(double[][] array) {
    int count = 0;

    for (int row = 0; row < array.length; row++) {
        count += array[row].length;
    }
    return count;
}
   
   /**
      The getRowTotal method calculates the sum of the row specified
      and returns the result
   */
   public static double getRowTotal(double[][] array, int row) {
      double total = 0;

      for (int col = 0; col < array[row].length; col++) {
         total += array[row][col];
      }

      return total;
   }

   /**
      The getColumnTotal method calculates the sum of the column specified
      and returns the result
   */
   public static double getColumnTotal(double[][] array, int col) {
      double total = 0;

      for (int row = 0; row < array.length; row++) {
         total += array[row][col];
      }

      return total;
   }

   /**
      The getHighestInRow method gets the highest value of the row specified
      and returns the result
   */   
   public static double getHighestInRow(double[][] array, int row) {
      double highest = array[row][0];

      for (int col = 1; col < array[row].length; col++) {
         if (array[row][col] > highest) {
               highest = array[row][col];
         }
      }
      return highest;
   }
   /**
      The getLowestInRow method gets the lowest value of the row specified
      and returns the result
   */  
   public static double getLowestInRow(double[][] array, int row) {
      double lowest = array[row][0];

      for (int col = 1; col < array[row].length; col++) {
         if (array[row][col] < lowest) {
            lowest = array[row][col];
         }
      }
      return lowest;
   }
}