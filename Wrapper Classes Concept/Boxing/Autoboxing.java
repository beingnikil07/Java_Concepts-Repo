//The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing, for example,
// byte to Byte, char to Character, int to Integer, long to Long, float to Float, boolean to Boolean, double to Double, and short to Short.
//Since Java 5, we do not need to use the valueOf() method of wrapper classes to convert the primitive into objects.

//Java program to convert primitive into objects  
//Autoboxing example of int to Integer  

class Autoboxing {
    public static void main(String args[]) {
        // Converting int into Integer
        int a = 20;
        Integer i = Integer.valueOf(a);// converting int into Integer explicitly
        Integer j = a;// autoboxing, now compiler will write Integer.valueOf(a) internally

        System.out.println(a + " " + i + " " + j);
    }
}