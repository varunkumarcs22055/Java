// New changes in Java: Local Variable Type Inference with 'var' keyword
// Introduced in Java 10, the 'var' keyword allows developers to declare local variables

//Its an error to declare a class, interface, or enum with the name 'var'

// class var{

// }

// sealed class A permits B, C {

// }
// final class B extends A{
       
// }
// final class C extends A{

// }

public class ChangesNew {
    public static void main(String[] args) {
       //Local variable type inference using 'var' keyword
       int a = 9;
       var b = 10; // 'b' is inferred as int
       System.out.println("Value of a: " + a);
       System.out.println("Value of b: " + b);
       int var =5; // 'var' can still be used as an identifier
       System.out.println("Value of var: " + var);

       // var can be used with arrays and making for the objects...
       var obj = new int[]{1,2,3,4,5}; // 'obj' is inferred as int[]
       System.out.println("Array elements:");
       for (var element : obj) {
           System.out.println(element);
       }



       // Sealed classes 

    }
}
