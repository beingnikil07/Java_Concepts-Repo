import java.lang.*;

class ShortDp {

    public static void main(String args[]) {
        // short takes 2 bytes (16bit) memory
        short a=32766;
        System.out.println(a);
        a++;
        System.out.println(a);
        //overflow krr lega -32768 se values print hone lagegi aur increment karne prr 
        //kyuki range ko paar krr gye aap short kii 
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
    }

}