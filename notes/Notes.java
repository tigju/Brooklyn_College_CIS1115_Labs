import java.util.Scanner;

public class Notes
{
   public static void main (String[] args)
   {   
      // Scanner keyboard = new Scanner (System.in);
//       int x = 0;
//       int c = 0;
      // String word = "Computer";
//       int i,j;
//       i=0;
//       while(i < word.length()) {
//          for (j = 0; j < i; j++) {
//             System.out.print("  ");
//          }
//          System.out.println(word.charAt(i++));
//       }
//       i--;
//       while(i>=0) {
//          for (j = i-1; j >= 0; j--){
//             System.out.print("  ");
//          }
//          System.out.println(word.charAt(i));
//          i--;
//       }
//    }

 //      String line;
//       int i;
//       char c;
//       Scanner sc = new Scanner(System.in);
//       
//       i = 0;
//       while(sc.hasNext()) {
//          line = sc.nextLine();
//          word(line);
//          }
//          }
//          
//      public static void word(String s) {
//       char c;
//       for (int i = 0; i < s.length(); i++){
//          c = s.charAt(i);
//          if (c == ' ') {
//             System.out.println();
//          } else {
//             c = Character.toUpperCase(c);
//             System.out.print(c);
//          }
//       }


//          String str = "2900 Bedford Ave Brooklyn NY 12230-6843";
// 
//        int pos = str.indexOf(" ");            // 5
// 
//        String s1 = str.substring(0,pos);      // 
// 
//        System.out.println("pos: "+pos+" s1: " +s1);
// 
//  
// 
//        pos = str.indexOf("B",pos+1);
//       System.out.println("pos: "+pos);
//        pos = str.indexOf("B",pos+1);
//        System.out.println("pos: "+pos);
// 
//        String s2 = str.substring(pos,str.indexOf(" ",pos));
// 
//        System.out.println("pos: "+pos+" s2: "+s2);

//  
// 
//        String s3 = str.substring(str.lastIndexOf("1"));
// 
//        System.out.println("s3: "+s3);

//        String[ ] arr1 = {"A","B","C","D","E"};
// 
//      doThree(arr1[0]);
// 
//      System.out.println("arr1[1] "+arr1[1]);
// 
//      arr1[0] = doThree(arr1[2]);
// 
//      System.out.println("arr1[0] "+arr1[0]);   
// 
//        } // end of main
// 
//  
// 
//                 public static String doThree(String s){
// 
//             return s.concat("12345");
// 
//            }

//      int x = 5;
// 
//          int y = 10;
// 
//          while (x<15){
// 
//             System.out.println("while: x: "+x+" y: "+y);
// 
//             x = x + 3;
// 
//             y = y - 2;
// 
//             do {
// 
//               x++;
// 
//               y--;
// 
//               System.out.println("do while: x: "+x+" y: "+y);
// 
//            } while (y>7);
// 
//          }    

//           for (int i=1; i<8; i=i+2){
// // 
//              System.out.print("i "+i);
// // 
//             for (int j=i-2;j>=-1;j=j-2){
// // 
//               System.out.print(" j "+j);
// // 
//              }
// // 
//             System.out.println();
//             }
//          double inches = 245897;
//          System.out.printf("Inches %.2f", inches)
//          System.out.printf("Miles %.2f", inches/5280)
//          System.out.printf("feet %.2f", inches*12)
//          System.out.printf("Yards %.2f", inches/36)
            
//         int [ ] array = {1,2,3,4,5};
//         int x = 12;
//         int y = doOne(array,x);
        // System.out.println(y);
        
//           for (int i=0; i< array.length; i++){
//           System.out.println(i);
//          }
    
//         int [ ] array2 = {1,2,3,4,5};
//         int w = doOne(array2, array2[3]);
//                   for (int i=0; i< array2.length; i++){
//           System.out.println(i);
//          }
//         } // end of main 
// 
//         public static int doOne(int[] arr, int x){
//             for (int i=0; i<arr.length-1; i++) 
//                 arr[i] = arr[i]*arr[i+1];
//             x = x+3;
//             return x;
//         } 
// 
// int []  array3 = {1,2,3,4,5};
//          int s = 12;
//          int v = 32;
//          int [] num = doTwo(array3, v,s);
//        
//          }  // end of main
// 
//          public static int[] doTwo(int[] arr, int x, int y){
//           int[] ret = new int[2];
//           x = arr[2] ;
//           y = arr[3] ;
//           ret[0] = x+arr[1];
//           ret[1] = y-arr[0];
//           return ret;
//          }
// 
// 

         int x = 5;
         int y = 10;
         System.out.println("x"+x);
         System.out.println("y"+y);
         do{
            x++;
            y--;
            System.out.println("x"+x);
            System.out.println("y"+y);
            while (y >8){
              x = x+2;
              y = y-3;
              System.out.println("x"+x);
               System.out.println("y"+y);
           }	
         } while (x < 10);


      }     
}