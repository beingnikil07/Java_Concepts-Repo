//If you need to do the computation in order to initialize your static variables,
//you can declare a static block that gets executed exactly once, when the class is first loaded. 


// Java program to demonstrate use of static blocks
class Test
{
    // static variable
    static int a = 10;
    static int b;
     
    // static block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
 
    public static void main(String[] args)
    {
       System.out.println("from main");
       System.out.println("Value of a : "+a);
       System.out.println("Value of b : "+b);
    }
}