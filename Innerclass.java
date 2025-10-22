class Outer {
    int outerField = 10;

    void showOuter() {
        System.out.println("This is the outer class method.");
    }

    static class Inner {
        void display() {
            System.out.println("Outer field is: " + new Outer().outerField);
        }
    }
}

class A{
    public void show(){
        System.out.println("This is class A");
    }
}

public class Innerclass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        // Outer.Inner inner = outer.new Inner(); // Alternative way to create inner class instance by making it static
        Outer.Inner inner = new Outer.Inner();
        inner.display();
        outer.showOuter();

        //Anonymous class example
        A a = new A(){
            public void show(){
                System.out.println("This is an anonymous class extending class A");
            }
        };
        a.show();
    }
}
