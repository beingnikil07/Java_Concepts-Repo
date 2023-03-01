// Break Statement is a loop control statement that is used to terminate the
// loop. As soon as the break statement is encountered from within a loop, the
// loop iterations stop there, and control returns from the loop immediately to
// the first statement after the loop.

// Java program to illustrate using
// break to exit a loop
class Break {
    public static void main(String args[]) {
        // Initially loop is set to run from 0-9
        for (int i = 0; i < 10; i++) {
            // terminate loop when i is 5.
            if (i == 5)
                break;

            System.out.println("i: " + i);
        }
        System.out.println("Loop complete.");
    }
}