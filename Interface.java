interface A{
    // by default, variables in interface are final and static
    // We cant change the value of variables in interface
    int x = 10;
    // int x;
    void show();
    void display();
}

class B implements A{
    public void show(){
        System.out.println("This is show method from interface A");
    }
    public void display(){
        System.out.println("This is display method from interface A");
    }
}

public class Interface {
    public static void main(String[] args) {
        System.out.println("This is an interface example file.");
        B b = new B();
        b.show();
        b.display();
    }
}
