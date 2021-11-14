import java.io.*;
import java.util.Scanner;

public class NumberList1
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File myFile = new File("NumberList.txt");
      Scanner inputFile = new Scanner(myFile);
      while (inputFile.hasNext())
      {
         String str = inputFile.nextLine();
         System.out.println(str);
      } 
      inputFile.close();  
   }
}
