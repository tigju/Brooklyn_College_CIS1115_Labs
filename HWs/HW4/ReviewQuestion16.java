import java.util.Random;
// Write the necessary import statement(s) here.
public class ReviewQuestion16
{
   public static void main(String[] args)
   {
      int random;
      Random randomNumbers = new Random();
      for (int count = 1; count<= 10; count++)
      {
         random = randomNumbers.nextInt(2);
         if (random == 0)
            System.out.println("No");
         else
            System.out.println("Yes");
      }
   }
}