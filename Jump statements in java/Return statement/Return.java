// Java Program to Illustrate Usage of return Keyword

// Main method
class Return {

    // Method 1
    // Since return type of RR method is double
    // so this method should return double value
    double RR(double a, double b) {
        double sum = 0;
        sum = (a + b) / 2.0;

        // Return statement as we already above have declared
        // return type to be double
        return sum;
    }

    // Method 2
    // Main driver method
    public static void main(String[] args) {
        // Print statement
        System.out.println(new Return().RR(5.5, 6.5));
    }
}