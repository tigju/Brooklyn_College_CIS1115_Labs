import java.io.*;
import java.util.Scanner;

/**
   This program calculates average Miles of the trips per each sales rep 
   by reading the data from a file.
*/

public class SalesReps
{
   public static void main(String[] args) throws Exception
   {  
   
      // this code below used to find the number of records in file
      File file = new File("salesrep.txt");
      Scanner sc = new Scanner(file);
      int cnt = 0;
      sc = new Scanner(new File("salesrep.txt"));

       while (sc.hasNextLine()) {
           sc.nextLine();
           cnt++;
       }
       sc.close();
      
       // initiate two arrays with the number of places that calculated records in file 
       String names[] = new String[cnt];
       double avgMiles[] = new double[cnt];
       
        FileWriter fileName = new FileWriter("sortedMiles.txt", true);
        PrintWriter output = new PrintWriter(fileName);
       
       // save returned count value from readData                 
       int number_of_records = readData(names, avgMiles);
       
       // envoke method computeOverallAvg to see the overall miles average across all sales reps
       computeOverallAvg(avgMiles, number_of_records);
       
       // sort array in descending order 
       sortArray(avgMiles, names, number_of_records);
        
       // write data to file in descending order
       for (int k = 0; k < number_of_records; k++) {
          output.printf("%s %.2f\n", names[k], avgMiles[k]);
       }
       output.close();
     
   }
   
   /**
      Reads the data into two arrays of Strings names and doubles avgMiles, with both arrays as parameters. 
      The return value is an integer, number of all records read.
   */
   public static int readData(String[] names, double[] avgMiles) throws IOException
   {
      // read the file     
      File file = new File("salesrep.txt");
      Scanner scan = new Scanner(file);
      
      // initiate count 
      int count = 0;
      
      // read file line by line until no more lines
      while(scan.hasNextLine()) {
        
        // get each record of the file
         String str = scan.nextLine();
        
        // get the index of first white space in order to get first word as a substring
        int position = str.indexOf(" ");
        
        // get the first word (sales rep name) and put it in array of names
        names[count] = str.substring(0, position);
        
        // get the rest of the string after the first word (name)
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
         
         // store avg value into avgMiles array
         avgMiles[count] = avg;
         
         // increment count of records
         count++;
        }
        
        // return number of records
        return count;
   }
   
    /**
    Takes averages per student and calculates overall average per records in file
    */
    public static void computeOverallAvg(double[] avgMiles, int count) throws Exception
    {
      // initilize sum
      double sum = 0;
      // go through the array of averages and calculate the overall average
      for (int i = 0; i < avgMiles.length; i++) {
         sum = sum + avgMiles[i];
      }
      // save average value in variable
      double allAvgs = sum / count;
      
      // initialize less, equal and greater counters
      int less = 0;
      int equal = 0;
      int greater = 0;
      
      // go through array of averages and count how many are less than, greater then or equal to overall average
      for (int i = 0; i < avgMiles.length; i++) {
         if (allAvgs > avgMiles[i]) {
            greater++;
         }
         else if (allAvgs < avgMiles[i]) {
            less++;
         }
         else {
            equal++;
         }
      }
      
       FileWriter fileName = new FileWriter("sortedMiles.txt", true);
       PrintWriter output = new PrintWriter("sortedMiles.txt");
      
      // write to file averall average, and less, greater and equal counts
      output.printf("Overall average is: %.2f \n", allAvgs);
      output.printf("Greater than average: %d \n", greater);
      output.printf("Equal to average: %d \n", equal);
      output.printf("Less than average: %d \n", less);
      
      output.close();
    }
   
    /**
    Takes an array of averages and performs parallel sorting by average grades in descending order
    */
    public static void sortArray(double[] avgMiles, String[] names, int count){
      // initialize hold variables
      double holdGrade;
      String holdName;
      boolean switched = true;
      // go through all the average grades
      for (int i = 0; i < count-1 && switched; i++){
         switched = false;
         // compare all average grades
         for (int j = 0; j < count - i - 1; j++){
            if(avgMiles[j] < avgMiles[j + 1]){
               switched = true;
               // swap the grades
               holdGrade = avgMiles[j];
               avgMiles[j] = avgMiles[j + 1];
               avgMiles[j + 1] = holdGrade;
               // swap the names
                holdName = names[j];
                names[j] = names[j + 1];
                names[j + 1] = holdName;
            }
         }       
      }
    }

}