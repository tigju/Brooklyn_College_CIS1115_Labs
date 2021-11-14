// Write the necessary import statement(s) here.
import java.util.Random;

public class ReviewQuestion15
{
   public static void main(String[] args)
   {   
      Random randomNumbers = new Random();
      int random = randomNumbers.nextInt(10)+1;
      System.out.print("Random integer between 1 and 10: "+ random);
   }
}