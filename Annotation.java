class A{
    void show(){
        System.out.println("This is show method from class A");
    }
    void display(){
        System.out.println("This is display method from class A");
    }
}

// In class B, we are overriding the methods of class A
// We are using @Override annotation to indicate that we are overriding the methods
// This is not mandatory, but it is a good practice to use it
// It helps to avoid mistakes, like if we misspell the method name, the compiler will give an error
// without @Override annotation, it would be treated as a new method in class B
class B extends A{
    @Override
    void show(){
        System.out.println("This is overridden show method from class B");
    }
    @Override
    void display(){
        System.out.println("This is overridden display method from class B");
    }
}

public class Annotation {
    public static void main(String[] args) {
        System.out.println("This is an annotation example file.");

        A a = new A();
        a.show();
        a.display();

        B b = new B();
        b.show();
        b.display();
    }
}
