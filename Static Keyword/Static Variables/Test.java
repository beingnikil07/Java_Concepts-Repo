/*
 * When a variable is declared as static, then a single copy of the variable is
 * created and shared among all objects at the class level. Static variables
 * are, essentially, global variables. All instances of the class share the same
 * static variable.
 * 
 * Important points for static variables:
 * 
 * We can create static variables at the class level only. See here
 * static block and static variables are executed in the order they are present
 * in a program.
 * 
 */

 // Java program to demonstrate execution
// of static blocks and variables
 
class Test
{
    // static variable
    static int a = m1();
     
    // static block
    static {
        System.out.println("Inside static block");
    }
     
    // static method
    static int m1() {
        System.out.println("from m1");
        return 20;
    }
     
    // static method(main !!)
    public static void main(String[] args)
    {
       System.out.println("Value of a : "+a);
       System.out.println("from main");
    }
}