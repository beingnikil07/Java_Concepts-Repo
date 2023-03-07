//Aggregation is a particular type of Association.
// It represents the has-a relationship between the two classes.
// The relationship between the two classes is entirely independent, which means if one of the objects of the class gets deleted, it won’t affect the other.

class Student {
  int id;
  String name;
  String school_name;

  Student(int id, String name, String school_name) {
    this.id = id;
    this.name = name;
    this.school_name = school_name;
    System.out.println("\nStudent name is " + name);
    System.out.println("Student Id is " + id);
    System.out.println("Student belongs to the " + school_name + "School");
  }
}

class school {
  String schoolName;
  int noOfStudents;

  school(String name, int numberOfStudents) {
    this.schoolName = name;
    this.noOfStudents = numberOfStudents;
  }
}

public class AggregationClass {
  public static void main(String[] args) {
    Student n1 = new Student(1, "NinjaA", "Coding Ninjas");
    Student n2 = new Student(2, "NinjaB", "Code");
    Student n3 = new Student(3, "NinjaC", "XYZ");
  }
}