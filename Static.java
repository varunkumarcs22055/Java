class Phone{
    String brand;
    static String color;
    int price;


    // Static block to initialize static variable
    // This block is executed when the class is loaded
    // This block runs only once however many objects are created
    static{
        color="White"; // Default color for all phones
        System.out.println("Static block executed");
    }

    public Phone(){
        System.out.println("Phone Object Created");
    }
    public static void show(){
        System.out.println("Static method called");
    }
}

public class Static {
    public static void main(String[] args) throws ClassNotFoundException {
        // Phone.color = "Black"; // Accessing static variable
        // All Phone objects share the same color Because it a class member
        // Phone p1 = new Phone();
        // p1.brand = "Samsung";
        // p1.price = 1000;

        // Phone p2 = new Phone();
        // p2.brand = "Apple";
        // p2.price = 1200;

        // System.out.println("Phone 1 Brand: " + p1.brand);
        // System.out.println("Phone 1 Color: " + Phone.color);
        // System.out.println("Phone 1 Price: " + p1.price);

        // System.out.println("Phone 2 Brand: " + p2.brand);
        // System.out.println("Phone 2 Color: " + Phone.color);
        // System.out.println("Phone 2 Price: " + p2.price); 


        // Calling Class without creating object
        Class.forName("Phone"); // This will trigger the static block in Phone class
    }
}

