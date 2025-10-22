class Human{
    private int age;
    private String name;

    // Constructor
    // Default constructor
    // No-argument constructor
    public Human(){
        this.age = 0;
        this.name = "Unknown";
    }
    // Parameterized constructor
    // Constructor with parameters
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Constructor is a special method that is called when an object is instantiated.
        // It is used to initialize the object.
        // It has the same name as the class and does not have a return type.

        // Example of Constructor
        Human h1 = new Human(25, "John");
        System.out.println("Name: " + h1.getName() + ", Age: " + h1.getAge());
        Human h2 = new Human();
        System.out.println("Name: " + h2.getName() + ", Age: " + h2.getAge());
       
    }
}
