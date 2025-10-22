// final keyword with the class we cannot inherit the class

// final class A{
//     void display(){
//         System.out.println("Class A display method");
//     }
// }

// class B extends A{
//     void display(){
//         System.out.println("Class B display method");
//     }
// }

class A{
    // final method cannot be overridden by subclasses
    final void show(){
        System.out.println("Final method in class A");
    }
}
class B extends A{
    // void show(){ // This will cause a compilation error
    //     System.out.println("Overriding final method in class B");
    // }
}

public class Final {
    public static void main(String[] args) {
        // Final keyword in Java
        // The final keyword is used to restrict the user.
        // The final keyword can be used with variables, methods, and classes.

        // 1. Final Variable: A final variable cannot be changed once it is initialized.
        final int var = 100;
        System.out.println("Final Variable: " + var);
        // var = 200; // This will cause a compilation error

        A obj = new A();
        obj.show();
       
    }
}
