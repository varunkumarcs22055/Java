public class Laptop{
    String brand;
    String model;
}

public class Object {
    public static void main(String[] args) {

   Laptop laptop = new Laptop();
   laptop.brand = "Dell";
   laptop.model = "XPS 13";
   System.out.println("Laptop Brand: " + laptop.brand);
   System.out.println("Laptop Model: " + laptop.model);

   // Now this method is from the Object class
   // This object class is the superclass of all classes in Java
   System.out.println(laptop.getClass());
    }
}
