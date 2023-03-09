class Outer {
    int x = 10;

    class Inner {
        int y = 20;

        void innerDisplay() {
            // Inner class can directly access the members or member functions of outer
            // class
            System.out.println(x);
            System.out.println(y);
        }
    }// End of inner class

    void outerDisplay() {
        Inner i = new Inner(); // Creates an object of inner class
        // remember that inner class ko always hum outer class mai he banate hai aur
        // outer
        // class se hum directly access nii kar sakte inner class ke material ko
        i.innerDisplay();
        System.out.println(i.y); // accessing outer class variable from inner class object
    }

}

public class Test {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();

        //Q.Can we access the inner class from the outside class ?
        //yeah,you can  but you cannot directly refer to inner class To use inner class outside 
        //you have to first give the outer class name 
        //for example :
        Outer.Inner i=new Outer().new Inner();
      
    }
}
