// 1.A constructor that has no parameter is known as the No-argument or Zero
// argument constructor. If we don’t define a constructor in a class, then the
// compiler creates a constructor(with no arguments) for the class.

// 2. Default constructor provides the default values to the object like 0,
// null, etc. depending on the type.

class Geek {
    int num;
    String name;

    // this would be invoked while an object
    // of that class is created.
    Geek() {
        System.out.println("Constructor called");
    }
}

class Main {
    public static void main(String[] args) {
        // this would invoke default constructor.
        Geek geek1 = new Geek();

        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(geek1.name);
        System.out.println(geek1.num);
    }
}
