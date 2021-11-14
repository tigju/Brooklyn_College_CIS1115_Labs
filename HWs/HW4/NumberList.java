import java.io.*;

public class NumberList
{
   public static void main(String[] args) throws FileNotFoundException
   {
      PrintStream o = new PrintStream(new File("NumberList.txt")); 
      // Store current System.out before assigning a new value 
      PrintStream console = System.out; 
  
      // Assign o to output stream 
      System.setOut(o); 
      
      for (int count = 1; count <= 100; count++)
      {
         System.out.println(count);
      }     
   }
}
