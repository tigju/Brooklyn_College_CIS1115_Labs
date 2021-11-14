import javax.swing.JOptionPane;

public class AreaOfRectangle {

   public static void main(String[] args) {
    
      
     double w = getWidth(); 
     double l = getLength();
     double a = getArea(w, l);
     displayData(l, w, a);
     
   }
   
   public static double getWidth() {
      String widthStr = JOptionPane.showInputDialog("Enter a width of a Rectangle");
      double width = Double.parseDouble(widthStr);
      return width;

    }
    public static double getLength() {
      String lengthStr = JOptionPane.showInputDialog("Enter a length of a Rectangle");
      double length = Double.parseDouble(lengthStr);
      return length;
    }
      
    public static double getArea(double x, double y) {
      double area = (x * y);
      return area;
    }
    
     public static void displayData(double l, double w, double a) {
      JOptionPane.showMessageDialog(null, "The area of a rectangle with length: "+ l +" and width: "+ w +" is: " + a);

    }

}