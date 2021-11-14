import java.util.Scanner;

public class ThreeNames
{
   public static void main (String[] args)
   {   
      Scanner keyboard = new Scanner (System.in);
      
      String name1, name2, name3;
      char n1, n2, n3;
      System.out.println("Please enter 3 names of your choice ");
      System.out.print("Name 1: ");
      name1 = keyboard.nextLine();
      System.out.print("Name 2: ");
      name2 = keyboard.nextLine();
      System.out.print("Name 3: ");
      name3 = keyboard.nextLine(); 
      
      n1 = name1.toLowerCase().charAt(0);
      n2 = name2.toLowerCase().charAt(0);
      n3 = name3.toLowerCase().charAt(0);
      System.out.println(n1+" "+n2+" "+n3);
      System.out.println("Your chosen names in alphabetical order:");
      if (n1 > n2 && n1 > n3)
         if (n2 > n3) {
             System.out.println(name3);
             System.out.println(name2);
             System.out.println(name1);   
          }
          else {
             System.out.println(name2);
             System.out.println(name3);
             System.out.println(name1);
          } 
       else if (n2 > n3 && n2 > n1)
          if (n3 > n1) {
             System.out.println(name1);
             System.out.println(name3);
             System.out.println(name2);
          }
          else {
             System.out.println(name3);
             System.out.println(name1);
             System.out.println(name2);
          }
       else if (n3 > n1 && n3 > n2)
          if (n1 > n2) {
             System.out.println(name2);
             System.out.println(name1);
             System.out.println(name3);
          }
          else {
             System.out.println(name1);
             System.out.println(name2);
             System.out.println(name3);
          } 
       
   }
 }
