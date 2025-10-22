abstract class Car{
    abstract void run();
    public void musicSystem(){
        System.out.println("Music system is ON");
    }
}

//Concrete class
// A class that extends the abstract class and provides implementation for abstract methods
class Honda extends Car{
    void run(){
        System.out.println("Honda car is running");
    }
}

public class Abstract {
    public static void main(String[] args) {
        System.out.println("This is an abstract class example file.");
        Honda hondaCar = new Honda();
        hondaCar.run();
        hondaCar.musicSystem();
    }
}
