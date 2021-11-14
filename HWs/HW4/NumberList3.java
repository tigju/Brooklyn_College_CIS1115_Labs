import java.io.*;

public class NumberList3
{
   public static void main(String[] args) throws IOException
      {
         FileWriter fw = new FileWriter("NumberList.txt", true);
         PrintWriter pw = new PrintWriter(fw);
         pw.write(String.valueOf(101));
         System.out.print("Number appended to file");
         fw.close();
      }
}
