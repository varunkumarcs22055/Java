
class Calculator{
    int a = 10;
    public int add(int num1,int num2){
        int r = num1 + num2;
        return r;
    }
}
public class oops {

    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 4; 
        Calculator calc = new Calculator();
        Calculator calc2 = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
        System.out.println(calc.a);
        calc.a = 20;
        System.out.println(calc.a);
        System.out.println(calc2.a);
        // The changes made in calc object will not affect calc2 object
        // Because both are different objects
        // Each object has its own copy of properties
        // Each object can use the same methods
        // Methods are shared among all objects of a class
        // Properties are unique to each object
        // This is the main concept of Object Oriented Programming 
    }
}


// Object Oriented Programming in Java
// Object - Property and Behavior
// Class - Blueprint of Object