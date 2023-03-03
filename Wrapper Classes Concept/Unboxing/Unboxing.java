// The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing. 
//It is the reverse process of autoboxing. Since Java 5, we do not need to use the intValue() method of
// wrapper classes to convert the wrapper type into primitives.

class Unboxing {
    public static void main(String[] args) {

        // creates objects of wrapper class
        Integer aObj = Integer.valueOf(23);
        Double bObj = Double.valueOf(5.55);

        // converts into primitive types
        int a = aObj.intValue();
        double b = bObj.doubleValue();

        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);
    }
}