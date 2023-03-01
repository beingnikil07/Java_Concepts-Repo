// Java program to illustrate if-else-if ladder

import java.io.*;

class Index {
    public static void main(String[] args) {

        // initializing expression
        int i = 20;

        // condition 1
        if (i < 10)
            System.out.println("i is less than 10\n");

        // condition 2
        else if (i < 15)
            System.out.println("i is less than 15\n");

        // condition 3
        else if (i < 20)
            System.out.println("i is less than 20\n");

        else
            System.out.println("i is greater than "
                    + "or equal to 20\n");

        System.out.println("Outside if-else-if");
    }
}