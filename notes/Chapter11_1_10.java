import java.util.Scanner;

public class Chapter11_1_10
{
   public static void main (String[] args)
   {  
//     String a,b,c;
//     String d = new String("It was too wet to play.");
//     String e = new String("It was too wet to play.");
//     
//     a = "The sun did not shine.";
//     b = "It was too wet to play.";
//     c = a;
//     System.out.println(c);
//     System.out.println(b);
//     
//     if (b==d){
//        System.out.println("b and d refer to the same string");
//       } else {
//        System.out.println("b and d do not refer to the same string");
//       }
//       
//     if (b.equals(d)){
//        System.out.println("b and d refer to the same string");
//       } else {
//        System.out.println("b and d do not refer to the same string");
//       }
//       
//      
//     System.out.println(a);
//     
//     if (a==c){
//        System.out.println("a and c refer to the same string");
//       } else {
//        System.out.println("a and c do not refer to the same string");
//       }
//       
//     if (a.equals(c)){
//        System.out.println("a and c are the same string");
//       } else {
//        System.out.println("a and c do not refer to the same string");
//       }
//       
//       
//       c = "It was to wet to play.";
//       System.out.println(a);
//       System.out.println(c);
//       if (a==c){
//        System.out.println("a and c refer to the same string");
//       } else {
//        System.out.println("a and c do not refer to the same string");
//       }
//       
//     if (a.equals(c)){
//        System.out.println("a and c are the same strings");
//       } else {
//        System.out.println("a and c do not refer to the same string");
//       }
//    
//     
//       System.out.println(d);
//       System.out.println(e);
//       if (d==e){
//        System.out.println("d and e refer to the same string");
//       } else {
//        System.out.println("d and e do not refer to the same string");
//       }
//       
//     if (d.equals(e)){
//        System.out.println("d and e are the same strings");
//       } else {
//        System.out.println("d and e are not the same string");
//       }
      
      
//       String a,b;
//       a = "so we sat in the house";
//       b = "all that cold, cold, wet day.";
//       System.out.println(a);
//       System.out.println(b);
//       change(a,b);
//       System.out.println(a);
//       System.out.println(b);
//    }
//    
//    public static void change(String s, String t) {
//       String c;
//       c = s;
//       c = s + " " + t;
//       System.out.println(c);
//       String str1 = "ABCDE12345",str2, str;
//       int i=3,j;
//       str = str1;
//       System.out.println(str);
//       
//       str2 = str1.substring(5,9);
//       str = str2;
//       System.out.println(str);
//       
//       str = "";
//       for (i = 0; i < 5; i++){
//          str = str + Character.toString(str1.charAt(i+3));
//       }
//       str = str + str1.substring(i+1, str1.length());
//       System.out.println(str);
//       
//       str = "";
//       for (j = 5; j < str1.length(); j++){
//          str = str + Character.toString(str1.charAt(j));
//       }
//       System.out.println(str);
//       
//       str = str1;
//       for (j = 1; j < str1.length() - 2; j++){
//          str = str + Character.toString(str1.charAt(j));
//       }
//       System.out.println(str);

//          String word1, word2, blank=" ", empty = "";
//          int len;
//          word1 = "ALPHA";
//          word2 = "ALPHA ";
//          if (word1.equals(word2)) {
//             System.out.println("Blanks at the end don't count.");
//          } else {
//             System.out.println("Blanks at the end do count.");
//          }
//          if (word1.length() == word2.length()) {
//             System.out.println("A blank is an empty string");
//          } else {
//             System.out.println("A blank is not an empty string");
//          }
//          System.out.println("The blank within quotes is a legal character");
//          word1 = word1 + empty;
//          System.out.println(word1);
//          len = word1.length();
//          System.out.println(len);
//          word1 = word1 + blank;
//          System.out.println(word1);
//          len = word1.length();
//          System.out.println(len);
//          
//          System.out.println(empty + "A blank and an empty sring are diferent");
//          System.out.println(blank + "A blank and an empty sring are diferent");
//             String str = "ABC123";
//             System.out.println("ABCBA".indexOf("A"));
//             System.out.println("A".indexOf("ABCBA"));
//             System.out.println("BBBAA".indexOf("AA"));
//             System.out.println(str.indexOf("str"));
//             System.out.println("4ABC123123".indexOf(str));

//             String first = "Monticello", last = "NY", middle = "Liberty";
//             int k,m;
//             char c;
//             
//             k = middle.length();
//             m = "Liberty".length();
//             System.out.println(k + " " + m);
//             
//             middle += last;
//             last = "Fallsburg";
//             first = first + "N";
//             first = first + "Y";
//             System.out.println(first + " " + middle + " " + last);
//             
//             if ("LMNOP".compareTo("LMNOPTUVWXYZ") > 0) {
//                System.out.println("bigger");
//             } else {
//                System.out.println("smaller");
//             }
//             
//             c = (char) (middle.charAt(5) + 1);
//             System.out.println(c);
//             middle = middle.substring(0,5) + Character.toString(c) + middle.substring(6);
//             
//             System.out.println(middle);

               // String [] stringarray = new String[10];
//                String str, temp;
//                
//                str = "AAAAA";
//                stringarray[0] = "b";
//                for (int i = 0; i < 9; i++){
//                   temp = "a";
//                   temp += stringarray[i];
//                   temp += "A";
//                   stringarray[i+1] = temp;
//                   System.out.println(stringarray[i] + " " + stringarray[i].length());
//                }
//                stringarray[2] = "z";
//                System.out.println(stringarray[3] + "z" + str);

//                String s = "Hello, How are you?", s1;
//                s = s.substring(0,15) + "we?";
//                System.out.println(s);
//                
//                s1 = s.substring(0,4);
//                s = s.substring(5);
//                s1 += s + "\n";
//                System.out.println(s1);
//                
//                if(s.indexOf("Hello") != -1){
//                   System.out.println("Hello");
//                } else {
//                   System.out.println("Goodbye");
//                }


  //              String str1 = new String("Is this not fun?");
//                String str2 = new String("ABCDEFG ");
//                int i;
               
//                System.out.println("str1: "+ str1);
//                System.out.println("str2: "+ str2);
//                
//                i = str1.length();
//                str1 = str1.substring(0, i-5)+ str2 + str1.substring(12);
//                System.out.println(str1);
//                
//                str1 = str1.substring(0, 4)+ str1.substring(6);
//                System.out.println(str1);
//                
//                str1 = str1.substring(0, 5)+ str2 + str1.substring(5);
//                System.out.println(str1);
                  
//                   int[] arr = new int[3];
//                   arr[0] = 5;
//                   arr[1]=2;
//                   arr[2]=3;
//                   double avg = 0;
//                   int sum = 0;
//                     int n = arr.length;
//                     System.out.println(n);
//                   for (int k =0; k<arr.length; k++) {
//                   System.out.println(arr[k]);
//                      sum = sum + arr[k];
//                   }
//                   avg = sum/n;
//                    System.out.println(sum/n);
// //                   System.out.println(n);
//                   System.out.println(avg);
//                   
//                   avg = sum / n;
                        
                        
//       int [ ] a = {1,2,3,4,5};
//       int [ ] b = new int[5];
//       for (int i=1; i< a.length; i++) {
//           b[i-1] = a[a.length-i];
//           System.out.println(a[a.length-i]);
//           System.out.println(b[i-1]);
//       }
//       System.out.println(a);
       int x = 5;
     do {
    System.out.println(x);
    x = x + 3;
} while( x < 10 );
System.out.println("now"+ x);
   }
}