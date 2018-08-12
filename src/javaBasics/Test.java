package javaBasics;
// filename: Main.java

/*This code inside static block is executed only once: the first time you make an object of that 
class or the first time you access a static member of that class (even if you never make an 
object of that class)*/

public class Test {
    static int i;
    int j;
    static {
        i = 10;
        System.out.println("static block called ");
    }
    Test(){
        System.out.println("Constructor called");
    }
    
    public static void main(String args[]) {
    	 
        // Although we have two objects, static block is executed only once.
        Test t1 = new Test();
        Test t2 = new Test();
     }
}
 
