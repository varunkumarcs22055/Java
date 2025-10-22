import java.util.*;
import java.io.*;


public class Input {
    public static void main(String[] args) throws IOException {
        System.out.println("This is an input example file.");
        System.out.println("Please enter your name:");
        // Using BufferedReader to take input
        // InputStreamReader reader = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(reader);
        // String name = br.readLine();
        // System.out.println("Hello, " + name + "!");

        // int num = Integer.parseInt(br.readLine());
        // System.out.println("You entered number: " + num);
        // br.close();

        // Using Scanner to take input
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
