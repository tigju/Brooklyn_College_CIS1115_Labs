import java.io.File;
import java.util.Scanner;

/**
   This program does a few array manipulations
   by reading the data from a file.
*/

public class Question7
{
   public static void main(String[] args) throws Exception
   {  
      double arr1[] = new double[1000];
      double arr2[] = new double[1000];
      
      int k = readData(arr1,arr2);
      changeArray(arr1, arr2, k);
      sortArray(arr1,k);
      sortArray(arr2,k);
      
      // print out the header columns
      System.out.println(String.format("%5s%10s", "arr1", "arr2"));
      
      // print out values of arr1 and  modified arr2
      for (int i = 0; i <k; i++) {
         System.out.println(String.format("%5s%10s", arr1[i], arr2[i]));
      }
   }
   
   /**
      Reads the data into two arrays of doubles arr1 and arr2, with both arrays as parameters. 
      The return value is an integer variable num
   */
   public static int readData(double arrOne[], double arrTwo[]) throws Exception
   {
      int num = 0;
      File file = new File("input.txt");
      Scanner sc = new Scanner(file);
      
      while(sc.hasNextLine()) {
         String str = sc.nextLine();
         String s[] = str.split(" ");
 
         arrOne[num] = Double.parseDouble(s[0]);
         arrTwo[num] = Double.parseDouble(s[1]);
         
         num++;
      }
      return num;
   }
   
   /**
      Modifies all of the values in the arr2 , passing both arrays and num as parameters
   */
   public static void changeArray(double alpha[], double beta[], int k)
   {
         for(int i = 0; i < k; i++) {
            beta[i] = alpha[i] * beta[i];
         }

   }

   /**
      Sorts array in ascending order
   */
   public static void sortArray(double sortArr[],int k) {

      double temp;

      for (int i = 0; i < k; i++) {

            for (int j = i + 1; j < k; j++) {

                if (sortArr[i] > sortArr[j]){

                    temp = sortArr[i];
                    sortArr[i] = sortArr[j];
                    sortArr[j] = temp;
                }
            }
        }
   }
}