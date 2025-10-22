public class Wrapper {
    public static void main(String[] args) {
        // Wrapper classes in Java
        // Wrapper classes are used to convert primitive data types into objects.
        // Each primitive data type has a corresponding wrapper class.

        int num = 10;

        // Converting primitive int to Wrapper class Integer
        // Storing primitive into an object
        Integer num1 = new Integer(num); // Boxing
        // Storing primitive into an object automatically
        Integer num2 = num; // Autoboxing
        System.out.println("Primitive int: " + num);
        System.out.println("Wrapper Integer (Boxing): " + num1);
        System.out.println("Wrapper Integer (Autoboxing): " + num2);
        // Converting Wrapper class Integer back to primitive int

        int num3 = num2.intValue(); // Unboxing
        // Converting Wrapper class Integer back to primitive int automatically 
        int num4 = num2; // Auto-unboxing
        System.out.println("Unboxed int (Unboxing): " + num3);
        System.out.println("Unboxed int (Auto-unboxing): " + num4);

        // Similarly, we can use other wrapper classed methods
        String str = "123";
        int num5 = Integer.parseInt(str); // Converting String to primitive int
        System.out.println("String to primitive int: " + num5*3);

        // Wrapper classes have useful methods
        // That can be used for various operations
    }
}
