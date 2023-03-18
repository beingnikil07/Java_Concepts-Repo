//Final is just like constant or const in c/c++;
//There are 3 ways of initializing a final variable
//1.When you declare a final variable 
//2.Inside static method or block
//3.Inside an constructor

public class Main {
    public static void main(String[] args) {
        //Way 1 of initializing 
        final int MIN=1;
        final int NORMAL;
        final int MAX;
        //way2 of initializing 
        static{
            NORMAL=5;  //trying to modify
        }
        //way3 of initializing 
        Main(){
            MAX=10;
            MIN=0;
        }
    }
}
