class A{
    void display(){
        System.out.println("Class A display method");
    }
}
class B extends A{
    void display(){
        System.out.println("Class B display method");
    }
}
class C extends A{
    void display(){
        System.out.println("Class C display method");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism in Java
        // Polymorphism allows methods to do different things based on the object that it is acting upon.
        // Dynamic method dispatch is a mechanism by which a call to an overridden method is resolved at runtime rather than compile-time.
        // This is also known as runtime polymorphism.
        A obj = new A() ;
        obj.display(); // Calls A's display method

        obj = new B();
        obj.display(); // Calls B's display method

        obj = new C();
        obj.display(); // Calls C's display method
    }
}

        // There are two types of polymorphism in Java:
        // 1. Compile-time polymorphism (Method Overloading)
        // 2. Runtime polymorphism (Method Overriding)
