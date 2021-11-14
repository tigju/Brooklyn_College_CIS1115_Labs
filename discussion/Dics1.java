public class Dics1
{
   public static void main(String[] args)
   {        
   int count=0;
   String str1= "The deed is done";
   String str2 = "The name is Bond, JAMES Bond";
   for(String str: str1.split(" ")) {
       if(str.charAt(0)>=65 && str.charAt(0)<=90)
       {
            count++;
       }
   }
   System.out.println(count);
   
   count=0;
   for(String str: str2.split(" ")) {
       if(str.charAt(0)>=65 && str.charAt(0)<=90)
       {
            count++;
       }
   }
   System.out.println(count);
   
   String answer = "YES"; 
   String s="llo";
    int num=2;
    for (int i=0; i<num; i++) {
      if (s.substring(i+1).indexOf(s.charAt(i))==-1 &&
                          s.substring(0,i).indexOf(s.charAt(i))==-1)
            answer="NO";
    }
    System.out.println(answer);
    
    String word = grunf("Hello", "NOPE", "hello");
    System.out.println(word);
}
   public static String grunf(String s1, String s2, String s3) {
      String s = s1.substring(1,2);
         if (s1.length()>s2.length() && s2.compareTo(s3)<0 && s3.indexOf(s)>0)
            return s1.substring(0,1) + s2.substring(1);
         else
            return s1.substring(0,1) + s2.substring(0,1) +

      s1.substring(0,1);

    }
}