public class Disc2
{
   public static void main(String[] args)
   {    
      // part of main

      int []  array = {1,2,3,4};
      
      int y = doOne(array,array[1]);
      
      System.out.println(y);
      
      for (int i=0; i<array.length; i++)System.out.print(array[i]+" ");
      
      System.out.println();
      
                 
      
      int [] array2 = {2,3,4,5};
      
      y = 25;
      
      array2[0] = doOne(array2, y);
      
      System.out.println(y);
      
      for (int i=0; i<array2.length; i++)System.out.print(array2[i]+" ");
      
      System.out.println();
      
       
      
      y = 3;
      
      int [ ] num = doTwo(array2, y);
      
      for (int i=0; i<num.length; i++)System.out.print(num[i]+" ");
      
      System.out.println();
      
      for (int i=0; i<array2.length; i++)System.out.print(array2[i]+" ");
      
      }// end of main    

   
   public static int doOne(int[] arr, int y){

    for (int i=2; i<arr.length; i++)

         arr[i] = arr[i]+4;

     y = y * 3;

     return y+2;

   }

 

   public static int[] doTwo(int[] arr, int y){

      int[] ret = new int[2];
   
      ret[0] = arr[0] - 2*y;
   
      ret[1] = arr[1] + y;
   
      y = arr[1]+1;
   
      return ret;

   }
}