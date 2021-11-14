import java.io.*;

/**
   This program does a few calculations with the grades
   by reading from a file.
*/

public class GradeProcessing
{
   public static void main(String[] args) throws IOException
   {  
      int count = 0;
      String line;
      FileReader file = new FileReader("grades.txt");
      BufferedReader input = new BufferedReader(file);
      
      line = input.readLine();
      while (line != null)
      {
         count++;
         // Read a new line from the file
         line = input.readLine();
      }
      // Close the input file
      input.close();
      String[] wordsArray = new String[count];
      double sortedScores[] = new double[cnt];
     
      readGrades();
            
   }
   /** this method reads the file and prints output
   
   */
   private static void readGrades() throws IOException
   {
      String line;
      FileReader file = new FileReader("grades.txt");
      BufferedReader input = new BufferedReader(file);
      
      line = input.readLine();
      while (line != null)
      {
         int cnt= 0;
         String word = line.substring(0, line.indexOf(" "));
         String numbers = line.substring(line.indexOf(" ")+1);
         
         // add results to arrays
         wordsArray[cnt] = word;
         sortedScores[cnt] 
         System.out.print(word + ":  " + numbers + "\n");
         // Read a new line from the file
         line = input.readLine();
      }
      // Close the input file
      input.close();

   }
}