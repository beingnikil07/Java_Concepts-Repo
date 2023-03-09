//A anonymous inner class can be defined at the time of creation an object itself
//In Simple,A class that has no name is known as anonymous inner class
//Java anonymous inner class can be created in two ways:
// 1.Class(may be abstract or concrete )
// 2.Interface

abstract class My {
    abstract void display();
}

class Outer {
    public void method() {
        // You can't create object of abstract class ,it is rule
        // here we are declaring not creating object of My class
        My m = new My() {
            public void display() {
                System.out.println("Hello");
            }
        };
        m.display(); // This will print Hello
    }
}

class Test {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }
}