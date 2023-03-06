// If we do not create any constructor, the Java compiler automatically create a
// no-arg constructor during the execution of the program. This constructor is
// called default constructor.

class Main {

    int a;
    boolean b;

    public static void main(String[] args) {

        // A default constructor is called
        Main obj = new Main();

        System.out.println("Default Value:");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }
}