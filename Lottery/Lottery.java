import java.util.Random;

/**
   Lottery class
*/
public class Lottery
{
   private int NUM_DIGITS;
   private int[] lotteryNumbers;
   
   // Random generator to generate lottery numbers
   Random generator = new Random();

   /**
      Constructor
   */
   public Lottery()
   {
      NUM_DIGITS = 5;
      lotteryNumbers = new int[NUM_DIGITS];
      //Scanner keyboard = new Scanner(System.in);

      for (int i = 0; i < NUM_DIGITS; i++)
      {
          lotteryNumbers[i] = generator.nextInt(10);     
      }  
   }
   
   /**
      The numMatching method compares user's digits with random digits
      and returns matching digits in a string
   */

   public String numMatching(int[] arr)
   {
      String result = "Matched numbers: ";
      int count_matched = 0;
      
      for (int i = 0; i < arr.length; i++)
      {
          if (arr[i] == lotteryNumbers[i])
          {
            result = result + arr[i] + "  ";
            count_matched += 1;
          }    
      }
      String output =  "Number of digits matched: " + count_matched + ", " + result;
      return output;
   } 
   
   public String copy()
   {
      String output = "";
      for (int i = 0; i < lotteryNumbers.length; i++) 
      {
         output = output + lotteryNumbers[i] + "  ";
      }
      return output;
   }        
}