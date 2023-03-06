class Animal {
    protected String name;
    protected void display() {
      System.out.println("I am an animal.");
    }
  }
  
  class Dog extends Animal {
  
    public void getInfo() {
      System.out.println("My name is " + name);
    }
  }
  
  class Main {
    public static void main(String[] args) {
  
      // create an object of the subclass
      Dog labrador = new Dog();
  
      // access protected field and method
      // using the object of subclass
      labrador.name = "Rocky";
      labrador.display();
  
      labrador.getInfo();
    }
  }