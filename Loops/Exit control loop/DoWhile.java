// do while loop is similar to while loop with only difference that it checks
// for condition after executing the statements, and therefore is an example of
// Exit Control Loop.

import java.io.*;

class DoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}