class Animal {
    interface Activity {
        void move();
    }
}

class Dog implements Animal.Activity {
    public void move() {
        System.out.println("Dogs can bark and run");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.move();
    }
}