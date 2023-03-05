// Way3:  By changing the Order of the parameters 

// Class 1
// Helper class
class Geek {

    // Method 1
    public void geekIdentity(String name, int id) {

        // Printing name and id of person
        System.out.println("geekName :" + name + " "
                + "Id :" + id);
    }

    // Method 2
    public void geekIdentity(int id, String name) {

        // Again printing name and id of person
        System.out.println("Id :" + id + " "
                + "geekName :" + name);
    }
}

// Class 2
// Main class
class Way3 {

    // Main driver method
    public static void main(String[] args) {

        // Creating object of above class
        Geek geek = new Geek();

        // Passing name and id
        // Note: Reversing order
        geek.geekIdentity("Mohit", 1);
        geek.geekIdentity(2, "shubham");
    }
}