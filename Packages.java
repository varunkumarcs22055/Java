import other.tools.*;

public class Packages {
    public static void main(String[] args) {
        // Using classes from the Tools package
        Calc calculator = new Calc();
        int sum = calculator.add(10, 5);
        int difference = calculator.subtract(10, 5);
        int product = calculator.multiply(10, 5);
        int quotient = calculator.divide(10, 5);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        AdvCalc advCalculator = new AdvCalc();
        double powerResult = advCalculator.power(2, 3);
        double sqrtResult = advCalculator.squareRoot(16);

        System.out.println("2 raised to the power 3: " + powerResult);
        System.out.println("Square root of 16: " + sqrtResult);
    }
}
