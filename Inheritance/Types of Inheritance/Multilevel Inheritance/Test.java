class Animal {
    public void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Dog {
    public void weep() {
        System.out.println("Weeping...");
    }
}

class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.bark();
        c.weep();
    }
}