//Object of static inner class can be created outside the Outer class.
//you can access anywhere ,you don't need to create object of outer class 

class Outer{
    static int x=10;
    int y=20;
    static class Inner{
        void display(){
            System.out.println(x);   //Allowed 
            System.out.println(y);   //Not Allowed
            //So static inner class can access the members of outer
            //class but only static members.It cannot access non-static 
            //members
        }
    }
}

class Test{
    public static void main(String[] args) {
        Outer.Inner i=new Outer.Inner();
        i.display();        
    }
}