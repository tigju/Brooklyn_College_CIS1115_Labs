import java.io.*;
import java.util.Scanner;

public class CP4
{
   public static void main(String[] args) throws IOException
   {
       
      
      FileReader freader = new FileReader("students.txt");
      BufferedReader input = new BufferedReader(freader);
      // Perform a priming read to read the first line of
      // the file
      String[] line;
      String str = input.readLine();
      int id;
      int counter = 0;
      double correct;
      double wrong;
      double total;
      double answered;
      double ommited;
      double correctPercentage;
      double numericalGrade;
      
      while (str != null)
      {
         line = str.split(" ");
         id = Integer.parseInt(line[0]);
         correct = Integer.parseInt(line[1]);
         wrong = Integer.parseInt(line[2]);
         answered = correct + wrong;
         ommited = 50 - answered;
         total = answered + ommited; 
         correctPercentage = correct / answered;  
         numericalGrade = correct * 2;
         
         
         FileWriter fwriter = new FileWriter("Results.txt", true);

         PrintWriter output = new PrintWriter(fwriter);
            
         output.printf("student ID %d\n",id);
         output.printf("right answers %.0f wrong answers %.0f\n", correct, wrong);
         output.printf("Total answered %.0f\n", answered);
         output.printf("Ommited: %.0f\n", ommited);
         output.printf("grade is %.0f\n", numericalGrade);
         if (correct == wrong) {
            output.println("Same number of right and wrong answers");
         }
         else if (correct > wrong) {
            output.println("More right than wrong answers");
         }
         else {
            output.println("More wrong than right answers");
         }
         
         output.printf("correct percentage: %.3f\n", correctPercentage);
         
         if (ommited >= 10) {
            output.println("10 or more ommited");
         }
         if (ommited < 10) {
            output.println("less than 10 ommited");
         }
         
         output.println("*******************************************"); 
         fwriter.close();
         
         counter++;
         
         str = input.readLine();
         
      } 
      input.close();
      System.out.println("Total number of students is "+ counter);
   }
}
