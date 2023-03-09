//A class created inside a method is called Local inner class
//Sometimes this block can be a method,loop,or if-else block

class Outer {
    // A method
    void display() {
        // Local inner class
        class Inner {
            void innerDisplay() {
                System.out.println("Hello local inner class");
            }
        }
        Inner i = new Inner();
        i.innerDisplay();
    }
} // end of outer class

public class Test {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
    }
}