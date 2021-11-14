import java.util.Scanner;

public class LotteryDemo
{
   public static void main(String[] args)
   {
      Lottery playLot = new Lottery();
      int[] data = new int[5];
      
      Scanner keyboard = new Scanner(System.in);

      for (int i = 0; i < data.length; i++)
      {
          System.out.print("Enter number between 0 and 9 : ");
          data[i] = keyboard.nextInt();
      }
      String yourNumbers = "";
      for (int i = 0; i < data.length; i++)
      {
         yourNumbers = yourNumbers + data[i] + "  ";
      }
      System.out.print("Your numbers: "+ yourNumbers + "\n");
      System.out.print(playLot.numMatching(data) + "\n");
      System.out.print("Winning numbers: "+ playLot.copy());
   }
}