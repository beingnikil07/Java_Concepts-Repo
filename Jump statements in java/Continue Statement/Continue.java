// Continue statement is often used inside in programming languages inside loops
// control structures. Inside the loop, when a continue statement is encountered
// the control directly jumps to the beginning of the loop for the next
// iteration instead of executing the statements of the current iteration. The
// continue statement is used when we want to skip a particular condition and
// continue the rest execution. Java continue statement is used for all type of
// loops but it is generally used in for, while, and do-while loops.
// In the case of for loop, the continue keyword force control to jump
// immediately to the update statement.
// Whereas in the case of a while loop or do-while loop, control immediately
// jumps to the Boolean expression.

import java.util.*;

class Continue {

    // Main driver method
    public static void main(String args[]) {
        // For loop for iteration
        for (int i = 0; i <= 15; i++) {

            // Check condition for continue
            if (i == 10 || i == 12) {

                // Using continue statement to skip the
                // execution of loop when i==10 or i==12
                continue;
            }
            // Printing elements to show continue statement
            System.out.print(i + " ");
        }
    }
}