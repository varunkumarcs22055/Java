class NewException extends Exception {
    public NewException(String message) {
        super(message);
    }
}

class A{
    public void display() throws ClassNotFoundException {
        Class.forName("NewException");
    }
}
public class Exception2 {
    public static void main(String[] args) {
        System.out.println("This is an exception example file.");

        int i =20;
        int j = 10;
        try {
            j = 18/i;
        } 
        catch(Exception e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("Value of j: " + j);

        // Specific Exception Handling
        int arr[] = new int[5];
        try {
            j = 18/i;
            if(j==0) {
                throw new NewException("Here i am");
            }
        } 
        catch(NewException e) {
            System.out.println("New Exception caught: " + e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught: " + e); 
    }

        // Checked Exception Handling
        A objA = new A();
        try {
            objA.display();
        } 
        catch(ClassNotFoundException e) {
            System.out.println("Class Not Found Exception caught: " + e);
        }
 }
}
