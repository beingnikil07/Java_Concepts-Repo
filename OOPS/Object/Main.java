class Main {

    static String Employee_name;
    static float Employee_salary;

    static void set(String n, float p) {
        Employee_name = n;
        Employee_salary = p;
    }

    static void get() {
        System.out.println("Employee name is: " + Employee_name);
        System.out.println("Employee CTC is: " + Employee_salary);
    }

    public static void main(String args[]) {
        // Class ke Static methods ko hum direct class ke name ke through
        // Access krr sakte hai ,No need to create object of class

        Main.set("Rathod Avinash", 10000.0f);
        Main.get();
    }
}