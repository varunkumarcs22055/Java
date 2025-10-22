// FunctionalInterface means interface with single abstract method
@FunctionalInterface //It allows to have one abstract method in the interface With this annotation, if we try to add more than one abstract method, it will give a compile-time error
interface A{
    void show(int i);
    // void display(); // This will cause a compile-time error because FunctionalInterface can have only one abstract method
}

public class FunctionalInterface2 {
    public static void main(String[] args) {
        // A obj = new A(){ // Anonymous class implementing the Functional Interface A
        //     public void show(){
        //         System.out.println("This is show method of Functional Interface A");
        //     }
        // };
        // obj.show();

        // Using Lambda Expression to implement the Functional Interface A
        // A obj = () -> System.out.println("This is show method of Functional Interface A using Lambda Expression");
        // obj.show();

        // Another Example
        A obj = (i) -> System.out.println("Hello, Functional Interface with Lambda! " + i);
        obj.show(5);
    }
}