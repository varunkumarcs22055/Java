// What is Enumeration in Java?
// An enumeration is a special data type that enables for a variable to be a set of predefined
// constants. The variable must be equal to one of the values that have been predefined for it.
// Common examples include compass directions (values of NORTH, SOUTH, EAST, and WEST) and
// the days of the week.
// To define an enumeration, use the enum keyword (instead of class or interface), and separate
// the constants with a comma. By convention, the names of an enum type's constants are
// written in uppercase letters.

enum Status{
    Running, Failed, Pending, Success;
}

enum Laptop{
    Dell(2000, 400), HP(2300, 300), Apple(2500, 200), Asus(1800, 100);
    private int stock;
    private int price;
    Laptop(int p, int s){
        this.price = p;
        this.stock = s;
    }
    public int getPrice(){
        return this.price;
    }
    public int getStock(){
        return this.stock;
    }
}

public class Enumeration {
    public static void main(String[] args) {
        // System.out.println("This is an enumeration example file.");
        // Status ss = Status.Running;
        // System.out.println("Current Status: " + ss);
        // for(Status s : Status.values()){
        //     System.out.println(s);
        // }

        Status s = Status.Pending;
        if(s==Status.Running){
            System.out.println("All good");
        } else if(s==Status.Failed){
            System.out.println("Try Again");
        } else if(s==Status.Pending){
            System.out.println("Please wait...");
        } else if(s==Status.Success){
            System.out.println("Done Successfully");
        }


        // Using switch case with enumeration We dont have to use Status. before each constant Because the variable s is already of type Status.
        switch(s){
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please wait...");
                break;
            case Success:
                System.out.println("Done Successfully");
                break;
        }


        Laptop lp = Laptop.Dell;
        System.out.println("Selected Laptop: " + lp);
        System.out.println("Price: " + lp.getPrice());

        for(Laptop l : Laptop.values()){
            System.out.println(l + " costs $" + l.getPrice());
        }

        System.out.println("Available Stock:");
        for(Laptop l : Laptop.values()){
            System.out.println(l + " has stock of " + l.getStock() + " units.");
        }

    }
}
