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


public class Casting {
    public static void main(String[] args) {
        // Type Casting in Java
        // Type casting is the process of converting a variable from one data type to another.
        // There are two types of type casting in Java:
        // 1. Widening Casting (automatically) - converting a smaller type to a larger type size
        // 2. Narrowing Casting (manually) - converting a larger type to a smaller size type

        // Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println("Widening Casting:");
        System.out.println("Integer value: " + myInt);
        System.out.println("Double value: " + myDouble);

        // Narrowing Casting
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println("Narrowing Casting:");
        System.out.println("Double value: " + myDouble2);
        System.out.println("Integer value: " + myInt2);


        //Upcasting and Downcasting
        A objA = new B(); // Upcasting
        objA.display(); // Calls B's display method
        B objB = (B) objA; // Downcasting
        objB.display(); // Calls B's display method

    }
}
