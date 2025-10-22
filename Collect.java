import java.awt.color.ICC_ColorSpace;
import java.util.*;

public class Collect {
    public static void main(String[] args) {
        // Collections in Java
        // A collection is a data structure that groups multiple elements into a single unit.
        // The Java Collections Framework provides a set of classes and interfaces for storing and manipulating groups of objects.
        // Some commonly used collection classes are:
        // 1. ArrayList
        // 2. LinkedList
        // 3. HashSet
        // 4. TreeSet
        // 5. HashMap
        // 6. TreeMap

        // Example of ArrayList
        // ArrayList is a resizable array implementation of the List interface
        // It allows duplicate elements and maintains the insertion order
       Collection<Integer> nums = new ArrayList<Integer>();
         nums.add(10);
         nums.add(20);
         nums.add(30);
         System.out.println("ArrayList: " + nums);
        for(int num : nums){
            System.out.println(num);
        }


        // Example of HashSet
        // HashSet is a collection that implements the Set interface
        // It does not allow duplicate elements and does not maintain any order
        Collection<String> fruits = new HashSet<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("HashSet: " + fruits);
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // Example of TreeSet
        // TreeSet stores elements in a sorted order
        // It does not allow duplicate elements
        Collection<Integer> colors = new TreeSet<Integer>();
        colors.add(1);
        colors.add(2);
        colors.add(3);
        System.out.println("TreeSet: " + colors);
        for(int color : colors){
            System.out.println(color);
        }

        //Map Example
        // Map is an object that maps keys to values
        // It does not allow duplicate keys
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("HashMap: " + map);
        for(String name : map.keySet()){
            System.out.println("Key: " + name + ", Value: " + map.get(name));
        }
    }
}
