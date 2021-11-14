import java.io.*;

/**
   This program does a few calculations with the grades
   by reading from a file.
*/

public class GradeProcessing
{
   public static void main(String[] args)throws IOException
   {
      
      public double[] grades_data;
      
      FileReader file = new FileReader("grades.txt");
      BufferedReader input = new BufferedReader(file);
      
      readGrades();
            
   }
   
   public void readGrades()
   {
      String line;
      line = input.readLine();
      while (line != null)
      {
         System.out.print("Grades:  ");
         // Read a new line from the file
         line = input.readLine();
      }

      // Close the input file
      input.close();
   }
}