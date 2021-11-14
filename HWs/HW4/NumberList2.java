import java.io.*;
import java.util.Scanner;

public class NumberList2
{
   public static void main(String[] args) throws FileNotFoundException
   {
      int total = 0;
      File myFile = new File("NumberList.txt");
      Scanner inputFile = new Scanner(myFile);
      while (inputFile.hasNext())
      {
         int number = inputFile.nextInt();
         total += number;
      } 
      inputFile.close();  
      System.out.print("Total: "+ total);
   }
}
