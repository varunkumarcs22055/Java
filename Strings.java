public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2); // true

        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println(str3 == str4); // false

        //Mutable String using StringBuilder / StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.capacity()); // Default capacity is 16 + length of string
        System.out.println(sb.length()); // Length of the string
        System.out.println(sb); // Prints Hello
        sb.insert(0, "World "); // Inserts World at the beginning
        System.out.println(sb); // Prints World Hello
        sb.replace(0, 5, "Java"); // Replaces World with Java
        System.out.println(sb); // Prints Java Hello
        sb.delete(0, 5); // Deletes Java
        System.out.println(sb); // Prints Hello
        sb.append(" World"); // Appends World at the end
        System.out.println(sb); // Prints Hello World
    }
}
