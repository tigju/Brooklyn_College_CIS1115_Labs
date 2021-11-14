import java.util.Scanner;

public class PresentValue {
   
   public static void main(String[] args) {
      
      
     double f = getFuture(); 
     double r = getRate();
     double y = getYears();
     double p = getPresent(f,r,y);
     displayData(p, f, r, y);
     
   }
   
   public static double getFuture() {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the future amount that you want to get: ");
      double future = keyboard.nextDouble();
      return future;

    }
    public static double getRate() {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the annual interest rate: ");
      double rate = keyboard.nextDouble();
      return rate;

    }
    public static double getYears() {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the number of years you let the money to sit in the account: ");
      double years = keyboard.nextDouble();
      return years;

    }
    
    public static double getPresent(double f, double r, double y) {
       double present = f / Math.pow((1+r), y);
       return present;

    }
    
     public static void displayData(double p, double f, double r, double y) {
       System.out.printf("The amount you need to deposit today is $%.2f\n", p);
       System.out.printf("in order to receive $%.2f with the annual interest rate of %.2f percent\n", f, r);
       System.out.printf("and after %.0f years\n", y);

    }

}