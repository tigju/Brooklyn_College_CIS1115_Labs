
public class CP7
{
   public static void main(String[] args)
   {
      // String str = "CIS Room 2109N Ingersoll Hall Brooklyn,NY 11210";
// 
//        int pos = str.indexOf(" ",str.indexOf(" ",0)+1);
// 
//        String s1 = str.substring(0,pos);
// 
//        System.out.println("pos: "+pos+" s1: " +s1);
// 
//  
// 
//        pos = str.indexOf(" ",pos+1);
// 
//        String s2 = str.substring(pos+1,str.indexOf(" ",pos+1));
// 
//        System.out.println("pos: "+pos+" s2: "+s2);
// 
//  
// 
//        String s3 = str.substring(str.lastIndexOf(",")+1);
// 
//        System.out.println("s3: "+s3);
                
//                 
//        String s1 = "abABC";
// 
//        String s2 = "ABabc";
// 
//        System.out.println(s1.compareTo(s2)>0);
// 
//        System.out.println(s2.compareTo(s1)>0);
            
         String str="12aN87G3p";
         System.out.println(str.length());
  	      for (int i=0; i<str.length(); i++){
         System.out.println(i);
    	   if ((str.charAt(i)<'A' || str.charAt(i) >'Z') &&
    	   (str.charAt(i)<'a' || str.charAt(i) >'z'))
        	System.out.println("message");
  	}
   }
}