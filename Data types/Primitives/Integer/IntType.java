import java.lang.*;

class IntType {
    public static void main(String args[]) {
        // int takes 4bytes (32 bit) memory
        // range of int is from -2147483648 to 2147483647
        int a = 2147483646;
        System.out.println(a);
        a++;
        System.out.println(a);

        // Overflow ranges will cause of negative values
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);

    }
}
