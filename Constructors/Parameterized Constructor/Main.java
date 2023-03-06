// 1. A constructor that has parameters is known as parameterized constructor.
//    If we want to initialize fields of the class with our own values, then use a
//    parameterized constructor.

class Geek {
    // data members of the class.
    String name;
    int id;

    Geek(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Main {
    public static void main(String[] args) {
        // This would invoke the parameterized constructor.
        Geek geek1 = new Geek("avinash", 68);
        System.out.println("GeekName :" + geek1.name + " and GeekId :" + geek1.id);
    }
}