class AccessModi{
    private int data = 40;
    protected int protData = 50;
    public int pubData = 60;
    int defData = 70; // default access modifier
}

public class AccessModifiers {
    public static void main(String[] args) {
        // Access Modifiers in Java
        // 1. Public: The member is accessible from any other class.
        // 2. Private: The member is accessible only within its own class.
        // 3. Protected: The member is accessible within its own package and by subclasses.
        // 4. Default (no modifier): The member is accessible only within its own package.

        AccessModi obj = new AccessModi();
        System.out.println("Public Data: " + obj.pubData); // Accessible
        // System.out.println("Private Data: " + obj.data); // Not Accessible
        // System.out.println("Protected Data: " + obj.protData); // Not Accessible
        // System.out.println("Default Data: " + obj.defData); // Not Accessible

        // Accessing members within the same package
        AccessModi obj2 = new AccessModi();
        System.out.println("Public Data: " + obj2.pubData); // Accessible
        // System.out.println("Private Data: " + obj2.data); // Not Accessible
        // System.out.println("Protected Data: " + obj2.protData); // Accessible
        // System.out.println("Default Data: " + obj2.defData); // Accessible

        // Note: To test access from a different package, create another package and try to access the members of AccessModi class.
        // You can create a new Java file in a different package and import the AccessModi class to test the access modifiers.
    }
}
