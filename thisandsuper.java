class A{
    public A(int x){
        System.out.println("Constructor of class A with value: " + x);
    }
}

class B extends A{
    public B(){
        super(5);
        System.out.println("Constructor of class B");
    }
}

public class thisandsuper {
    public static void main(String[] args) {
       B objB = new B();


       new A(10); // Anonymous object of class A
    }
}
