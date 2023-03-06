//owever, if the same method is present in both the superclass and subclass, what will happen?
// In this case, the method in the subclass overrides the method in the superclass. This concept is known as method overriding in Java.

class Animal {

    // method in the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Dog inherits Animal
class Dog extends Animal {

    // overriding the eat() method
    @Override
    public void eat() {
        System.out.println("I eat dog food");
    }

    // new method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of the subclass
        Dog labrador = new Dog();

        // call the eat() method
        labrador.eat();
        labrador.bark();
    }
}
