// Rules for Java Method Overriding

// The method must have the same name as in the parent class

// The method must have the same parameter as in the parent class.

// There must be an IS-A relationship (inheritance).

//Creating a parent class.  
class Vehicle {
    // defining a method
    void run() {
        System.out.println("Vehicle is running");
    }
}

// Creating a child class
class Bike2 extends Vehicle {
    // defining the same method as in the parent class
    void run() {
        System.out.println("Bike is running safely");
    }
}
class Main{
    public static void main(String args[]) {
        Bike2 obj = new Bike2();// creating object
        obj.run();// calling method
    }
}