// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
    void eat() {
        System.out.println("Animal eats");
    }

}

// Derived class
class Dog extends Animal {
    void sound() {
            System.out.println("Dog barks");
        }
    }

public class OverRiding {
    // Method Overriding in Java
    // Method overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already defined in its superclass or parent class.
    // When a method in a subclass has the same name, return type, and parameters as a method in its superclass, the method in the subclass overrides the method in the superclass.

    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create a Dog object
        myDog.sound(); // Calls the overridden method in Dog class
        myDog.eat(); // Calls the method in Animal class
    }
}
