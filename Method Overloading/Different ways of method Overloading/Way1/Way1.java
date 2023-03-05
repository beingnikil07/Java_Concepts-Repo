// Way1:  By changing the number of parameters. 

import java.io.*;

class Addition {

    // Method 1
    // Adding two integer values
    public int add(int a, int b) {

        int sum = a + b;
        return sum;
    }

    // Method 2
    // Adding three integer values
    public int add(int a, int b, int c) {

        int sum = a + b + c;
        return sum;
    }
}

// Class 2
// Main class
class Way1 {

    // Main driver method
    public static void main(String[] args) {

        // Creating object of above class inside main()
        // method
        Addition ob = new Addition();

        // Calling method to add 2 numbers
        int sum1 = ob.add(1, 2);

        // Printing sum of 2 numbers
        System.out.println("sum of the two integer value :"
                + sum1);

        // Calling method to add 3 numbers
        int sum2 = ob.add(1, 2, 3);

        // Printing sum of 3 numbers
        System.out.println(
                "sum of the three integer value :" + sum2);
    }
}