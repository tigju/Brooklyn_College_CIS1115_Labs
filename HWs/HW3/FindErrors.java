import java.util.Scanner;

public class FindErrors
{
   public static void main (String[] args)
   {   
      double tax = 12345.6789;
      System.out.printf("The tax is: $%.1f\n", tax);
      System.out.printf("The tax is: $%,.2f\n", tax);
      System.out.printf("The tax is: $%,d\n", 1234567);
  }
 }
