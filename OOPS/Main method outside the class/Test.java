// In real time development, we create classes and use it from another class. It
// is a better approach than previous one. Let's see a simple example, where we
// are having main() method in another class

//Java Program to demonstrate having the main method in   
//another class  
//Creating Student class.  
class Student {
    int id;
    String name;
}

// Creating another class TestStudent1 which contains the main method
class Test {
    public static void main(String args[]) {
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}