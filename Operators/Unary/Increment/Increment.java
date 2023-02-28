
class Increment {
    public static void main(String args[]) {
        byte a = 5;
        System.out.println(a);
        // post increment
        /*
         * When placed after the variable name, the value of the operand is incremented
         * but the previous value is retained temporarily until the execution of this
         * statement and it gets updated before the execution of the next statement.
         * 
         */
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
    }
}
