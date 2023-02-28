import java.lang.*;

class ByteType {
    public static void main(String args[]) {
        // byte takes 1byte(8bit) of memory
        byte a = 126;
        System.out.println(a);
        a++;
        System.out.println(a);

        // It overflows here because the range of the byte data type can hold is
        // -128 to 127

        a++;
        System.out.println(a); // that is -128
        a++;
        System.out.println(a);
    }

}