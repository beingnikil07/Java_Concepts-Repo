//String.format() method allows to concatenate multiple strings using format specifier
// like %s followed by the string values or objects.
class Main {
    public static void main(String[] args) {
        String s1 = new String("Hello"); // String 1
        String s2 = new String(" World"); // String 2
        String s = String.format("%s%s", s1, s2); // String 3 to store the result
        System.out.println(s.toString()); // Displays result
    }
}
