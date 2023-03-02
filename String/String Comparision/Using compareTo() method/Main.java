class Main {
    public static void main(String[] args) {
        String s1 = "Nikhil";
        String s2 = "Nikhil";
        String s3 = "Kumar";
        System.out.println(s1.compareTo(s2)); // 0 ,becz both have eqaul len data
        System.out.println(s1.compareTo(s3)); // 1 ,becz s1>s3
        System.out.println(s3.compareTo(s2)); // -1 ,becz s3<s2
    }
}
