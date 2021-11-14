public class PetDemo
{
   public static void main(String[] args)
   {        
      Pet cat = new Pet();
      
      cat.setAnimal("cat");
      cat.setName("Caesar");
      cat.setAge(8);
      
      System.out.println("The pet is "+ cat.getAnimal());
      System.out.println("The pet's name is "+ cat.getName());
      System.out.println("The pet's age is "+ cat.getAge());

   }
}