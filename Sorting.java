import java.util.*;
class Students implements Comparable<Students>{
    String name;
    int age;
    Students(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int compareTo(Students that){
        if(this.age > that.age){
            return 1;
        }else{
            return -1;
        }
    }

    public String toString(){
        return this.name + " : " + this.age;
    }
}
class Sorting {
    public static void main(String[] args) {
        // Sorting algorithms in Java
        // Sorting is the process of arranging data in a specific order, typically in ascending or descending
        // order. There are several sorting algorithms available in Java, each with its own advantages
        List <Integer> numbers = new ArrayList<>();
        // numbers.add(5);
        // numbers.add(2);
        // numbers.add(8);
        // numbers.add(1);

        // Collections.sort(numbers); // Ascending order
        // System.out.println("Sorted in Ascending order: " + numbers);

        // Comparator<Integer> com = new Comparator<Integer>() {
        //     public int compare(Integer o1, Integer o2) {
        //         if(o1%10 > o2%10){
        //             return 1;
        //         }else{
        //             return -1;
        //         }
        //     }
        // };
        // numbers.add(55);
        // numbers.add(23);
        // numbers.add(78);
        // numbers.add(92);
        // Collections.sort(numbers,com);
        // System.out.println("Sorted based on last digit: " + numbers);

        //Now making class
        List<Students> students = new ArrayList<>();
        students.add(new Students("Alice", 22));
        students.add(new Students("Bob", 20));
        students.add(new Students("Charlie", 23));
        Collections.sort(students);
        System.out.println("Sorted students: " + students);
    }
}