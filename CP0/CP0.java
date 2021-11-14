//

public class CP0
{
   public static void main(String[] args)
   {
      int month = 2, days = 28;

      // Store 1 in bVar.
      byte bVar = Byte.parseByte("1");
      // Store 2599 in iVar.
      int iVar = Integer.parseInt("2599");
      // Store 10 in sVar.
      short sVar = Short.parseShort("10");
      // Store 15908 in lVar.
      long lVar = Long.parseLong("15908");
      // Store 12.3 in fVar.
      float fVar = Float.parseFloat("12.3");
      // Store 7945.6 in dVar.
      double dVar = Double.parseDouble("7945.6");
      System.out.println("Month " + month + " has " + days + " Days.\n");
      System.out.println("byte: " + bVar);
      System.out.println("int: " + iVar);
      System.out.println("short: " + sVar);
      System.out.println("long: "+ lVar);
      System.out.println("float: "+fVar);
      System.out.println("double: "+dVar);
   }
}
