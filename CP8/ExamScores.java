import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExamScores {
   static Scanner sc = null;

   public static void main(String[] args) throws FileNotFoundException {
       int cnt = 0;
       sc = new Scanner(new File("grades.txt"));

       while (sc.hasNext()) {
           sc.nextLine();
           cnt++;
       }
       sc.close();
       String names[] = new String[cnt];
       double minScores[] = new double[cnt];

       readFile(names, minScores);
       sort(names,minScores);
       display(names,minScores);


   }

   private static void sort(String[] names, double[] array) {
       //This Logic will Sort the Array of elements in Decending order
       double temp1;
       String name;
       for (int i = 0; i < names.length; i++)
   {
   for (int j = i + 1; j < names.length; j++)
   {
   if (array[i] < array[j])
   {
   temp1 = array[i];
   array[i] = array[j];
   array[j] = temp1;
  
   name=names[i];
   names[i]=names[j];
   names[j]=name;
   }
   }
   }
      
   }

   private static void display(String[] names, double[] minScores) {
       System.out.printf("%-10s%10s\n","name","min");
       for(int i=0;i<names.length;i++)
       {
           System.out.printf("%-10s%10.2f\n",names[i],minScores[i]);
       }
      
   }

   private static void readFile(String[] names, double[] minScores)
           throws FileNotFoundException {
       double scores[][] = new double[names.length][5];
       sc = new Scanner(new File("grades.txt"));
       double min;
       for (int i = 0; i < names.length; i++) {
           names[i] = sc.next();
          
           for (int j = 0; j < 5; j++) {
               scores[i][j] = sc.nextDouble();
           }
          
           min = scores[i][0];
          
           for (int j = 0; j < 5; j++) {
               if (min > scores[i][j]) {
                   min = scores[i][j];
               }
           }
           minScores[i]=min;
       }
       sc.close();

   }
   
   
 ///////////////////////////////////////////////////////////////////
   public static void sortArray(words,min,numRecs);
        output.printf("%-12s%12s","name","min");
        output.println();
        for (int i=0; i<numRecs;i++){
          output.printf("%-12s%12.2f%n",words[i],min[i]);
          
          
          
   public static int process(String[] name, double[] min, int num){
            int count=0;
            for (int i=0; i<num;i++){
                if (!name[i].equals("final"))
                    min[i]+=5;

}