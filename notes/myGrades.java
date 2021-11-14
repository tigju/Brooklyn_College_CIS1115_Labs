import java.io.*;
import java.util.Scanner;

/**
   This program does a few array manipulations
   by reading the data from a file.
*/

public class myGrades
{
   public static void main(String[] args) throws Exception
   {  
   
      // this code below used to find the number of records in file
      File file = new File("mygrades.txt");
      Scanner sc = new Scanner(file);
      int cnt = 0;
      sc = new Scanner(new File("mygrades.txt"));

       while (sc.hasNextLine()) {
           sc.nextLine();
           cnt++;
       }
       sc.close();
      
       // initiate two arrays with the number of places that calculated records in file 
       String names[] = new String[cnt];
       double avgGrades[] = new double[cnt];
       
       // save returned count value from readData                 
       int number_of_records = readData(names, avgGrades);
       
       // System.out.println("Number of records "+ number_of_records);
       
       // envoke method computeOverall to see the overall average grades 
       computeOverallAvg(avgGrades, number_of_records);
       
       // sort array in descending order 
       sortArray(avgGrades, names, number_of_records);
        
       // write data to file
       PrintWriter output = new PrintWriter("sortedOutput.txt");
       for (int k = 0; k < number_of_records; k++) {
          output.printf("%.2f  %s\n", avgGrades[k], names[k]);
          System.out.printf("%.2f  %s\n", avgGrades[k], names[k]);
       }
       output.close();
       
        
//          for (int i = 0; i < names.length; i++) {
//           System.out.println(names[i]);
//           System.out.println(avgGrades[i]);
//          }
   }
   
   /**
      Reads the data into two arrays of Strings names and doubles avgGrades, with both arrays as parameters. 
      The return value is an integer, number of all records read.
   */
   public static int readData(String[] names, double[] avgGrades) throws IOException
   {
      // read the file     
      File file = new File("mygrades.txt");
      Scanner scan = new Scanner(file);
      
      // initiate count 
      int count = 0;
      
//       System.out.println("NAME " + "G1 " + "G2 " + "G3");
//       System.out.println("---------------------" );
      
      // read file line by line until no more lines
      while(scan.hasNextLine()) {
        
        // print out the table of records of students and grades 
         String str = scan.nextLine();
//         System.out.println(str);
        
        // get the index of first white space in order to get first word as a substring
        int position = str.indexOf(" ");
        
        // get the first word (student name) and put it in array of names
        names[count] = str.substring(0, position);
        
        // get the rest of he string after the first word (name)
        String position2 = str.substring(position+1);
        
        // split it by spaces to get the strings of numbers
        String[] numbers = position2.split(" ");
        
        // initiate sum and avg variables
        double sum = 0;
        double avg = 0;
        
        // go through the array of strings of numbers, convert them into doubles, 
        // calculate the average
        for (int i = 0; i < numbers.length; i++){
             double num = Double.parseDouble(numbers[i]);
             sum = sum + num;
             avg = sum/numbers.length; 
         }
         
         // store avg value into avgGrades array
         avgGrades[count] = avg;
         
         // increment count of records
         count++;
        }
        
        // return number of records
        return count;
   }
   
    /**
    Takes averages per student and calculates overall average per records in file
    */
    public static void computeOverallAvg(double[] avgGrades, int count){
      // initilize sum
      double sum = 0;
      // go through the array of averages and calculate the overall average
      for (int i = 0; i < avgGrades.length; i++) {
         sum = sum + avgGrades[i];
      }
      // save average value in variable
      double allAvgs = sum / count;
      
      // initialize less, equal and greater counters
      int less = 0;
      int equal = 0;
      int greater = 0;
      
      // go through array of averages and count how many are less than, greater then or equal to overall average
      for (int i = 0; i < avgGrades.length; i++) {
         if (allAvgs > avgGrades[i]) {
            greater++;
         }
         else if (allAvgs < avgGrades[i]) {
            less++;
         }
         else {
            equal++;
         }
      }
      
      // print out averall average, and less, greater and equal counts
      System.out.printf("Overall average is: %.2f \n", allAvgs);
      System.out.printf("Greater than average: %d \n", greater);
      System.out.printf("Equal to average: %d \n", equal);
      System.out.printf("Less than average: %d \n", less);
    }
   
    /**
    Takes an array of averages and performs parallel sorting by average grades in descending order
    */
    public static void sortArray(double[] avgGrades, String[] names, int count){
      // initialize hold variables
      double holdGrade;
      String holdName;
      boolean switched = true;
      // go through all the average grades
      for (int i = 0; i < count-1 && switched; i++){
         switched = false;
         // compare all average grades
         for (int j = 0; j < count - i - 1; j++){
            if(avgGrades[j] < avgGrades[j + 1]){
               switched = true;
               // swap the grades
               holdGrade = avgGrades[j];
               avgGrades[j] = avgGrades[j + 1];
               avgGrades[j + 1] = holdGrade;
               // swap the names
                holdName = names[j];
                names[j] = names[j + 1];
                names[j + 1] = holdName;
            }
         }       
      }
      // print out sorted result
//       for (int k = 0; k < avgGrades.length; k++) {
//           System.out.printf("%.2f  %s\n", avgGrades[k], names[k]);
//       }
    }

}