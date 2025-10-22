
// Base class
class Calc{
    int add(int a, int b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }
    int multiply(int a, int b) {
        return a * b;
    }
    int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
}


// Single Inheritance
class AdvancedCalculator extends Calc {
    // This class inherits all methods from Calc
    int modulus(int a, int b) {
        return a % b;
    }
    double power(int a, int b) {
        return Math.pow(a, b);
    }
}

// Multilevel Inheritance
class VeryAdvancedCalculator extends AdvancedCalculator {
    // This class inherits all methods from AdvancedCalculator and Calc
    double squareRoot(int a) {
        return Math.sqrt(a);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        //Inheritance is a mechanism where one class acquires the properties (fields) and behaviors (methods) of another class.
        // It promotes code reusability and establishes a relationship between classes.
        // Example of Inheritance
        Calc calculator = new Calc();
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(5, 3));
        System.out.println("Division: " + calculator.divide(5, 0));


        // Single Inheritance
        // AdvancedCalculator inherits from Calc
        // Thus, AdvancedCalculator has access to methods from Calc
        AdvancedCalculator advCalculator = new AdvancedCalculator();
        System.out.println("Modulus: " + advCalculator.modulus(5, 3));
        System.out.println("Power: " + advCalculator.power(5, 3));
        System.out.println("Addition using AdvancedCalculator: " + advCalculator.add(10, 4));
        System.out.println("Subtraction using AdvancedCalculator: " + advCalculator.subtract(10, 4));
        System.out.println("Multiplication using AdvancedCalculator: " + advCalculator.multiply(10, 4));
        System.out.println("Division using AdvancedCalculator: " + advCalculator.divide(10, 2));


        // Multilevel Inheritance
        // VeryAdvancedCalculator inherits from AdvancedCalculator, which in turn inherits from Calc
        // Thus, VeryAdvancedCalculator has access to methods from both AdvancedCalculator and Calc
        VeryAdvancedCalculator veryAdvCalculator = new VeryAdvancedCalculator();
        System.out.println("Square Root: " + veryAdvCalculator.squareRoot(16));
        System.out.println("Power using VeryAdvancedCalculator: " + veryAdvCalculator.power(2, 8));
        System.out.println("Addition using VeryAdvancedCalculator: " + veryAdvCalculator.add(20, 30));
        System.out.println("Subtraction using VeryAdvancedCalculator: " + veryAdvCalculator.subtract(20, 30));
        System.out.println("Multiplication using VeryAdvancedCalculator: " + veryAdvCalculator.multiply(20, 30));
        System.out.println("Division using VeryAdvancedCalculator: " + veryAdvCalculator.divide(20, 30));
    }

}
