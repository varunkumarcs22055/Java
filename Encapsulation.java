class Human{
    private int age;
    private String name;



    //Why this.age = age; because of this keyword we can differentiate between instance variable and parameter variable
    // this keyword refers to current object
    public void setAge(int age){
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
    
}

public class Encapsulation {
    public static void main(String[] args) {
        // Encapsulation is the wrapping of data (variables) and code (methods) together as a single unit.
        // In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class.
        // Therefore, it is also known as data hiding.

        // Example of Encapsulation
        Human h1 = new Human();
        // h1.age = 25;
        // h1.name = "John";
        // System.out.println("Name: " + h1.name + ", Age: " + h1.age);
        h1.setAge(25);
        h1.setName("John");
        System.out.println("Name: " + h1.getName() + ", Age: " + h1.getAge());
    }
}
