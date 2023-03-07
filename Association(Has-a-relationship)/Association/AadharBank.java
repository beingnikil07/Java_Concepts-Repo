class Person {
  String name;
  double id;

  // constructor for defining the class objects
  Person(String name, double id2) {
    this.name = name;
    this.id = id2;
  }
}

class AadharCard extends Person {
  String personName;

  AadharCard(String name, double id) {
    super(name, id);
    this.personName = name;
  }
}

public class AadharBank {
  public static void main(String args[]) {
    AadharCard obj = new AadharCard("Ninja", 981049321);
    System.out.println(obj.personName + " is a person with an Aadhar number: " + obj.id);
  }
}