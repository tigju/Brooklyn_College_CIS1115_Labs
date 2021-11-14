import java.io.File;
import java.util.Scanner;

/**
   This program does a few array manipulations
   by reading the data from a file.
*/

public class myGrades
{
   public static void main(String[] args) throws Exception
   {  

      readData();
   }
   
   /**
      Reads the data into two arrays of doubles arr1 and arr2, with both arrays as parameters. 
      The return value is an integer variable num
   */
   public static void readData() throws Exception
   {
      
      File file = new File("grades.txt");
      Scanner sc = new Scanner(file);
      
      while(sc.hasNextLine()) {
         String str = sc.nextLine();
         System.out.println("line": str);
        }
   }
   
   /**
      Modifies all of the values in the arr2 , passing both arrays and num as parameters
   */
   

}