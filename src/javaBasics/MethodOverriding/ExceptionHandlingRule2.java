package javaBasics.MethodOverriding;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*If the super-class overridden method does throws an exception, subclass overriding method can 
only throw same, subclass exception. Throwing parent exception in Exception hierarchy will lead
to compile time error.Also there is no issue if subclass overridden method is not throwing any
exception.*/

/*2) Rule: If the superclass method does not declare an exception, subclass overridden method 
cannot declare the checked exception but can declare unchecked exception.*/
/* Java program to demonstrate overriding when 
  superclass method does declare an exception*/
  
class Parent
{
    void m1() throws RuntimeException
    { System.out.println("From parent m1()");}
    
    
    void m2()
    { System.out.println("From parent m2()");}
    
    void m3() throws IOException
    { System.out.println("From parent m3()");}
     
}
 
class Child1 extends Parent
{
    @Override
    // no issue while throwing same exception
    void m1() throws RuntimeException
    { System.out.println("From child1 m1()");}
     
}
class Child2 extends Parent
{
    @Override
    // no issue while throwing subclass exception
    void m1() throws ArithmeticException
    { System.out.println("From child2 m1()");}
     
}
class Child3 extends Parent
{
    @Override
    // no issue while not throwing any exception
    void m1() throws IOException
    { System.out.println("From child3 m1()");}
    
    void m2()
    { System.out.println("From child3 m2()");}
    void m3()
    { System.out.println("From parent m3()");}
     
}
class Child4 extends Parent
{
	   static int[] delta_encode(int[] array) {
	        List<Integer> l = new ArrayList<Integer>();
	      //  Arrays.stream(array).
	        l.add(array[0]);
	        int difference=0;
	           for (int i=1;i<array.length;i++) {
	               difference = array[i]-array[i-1];
	              if(difference<-127 || difference >127) 
	                  l.add(-128);
	               
	           }
	          int[] modifiedarray = new int[l.size()] ;
	          
	          for(int i=0;i<l.size();i++) {
	        	  modifiedarray[i]=l.get(i);
	          }
	        return modifiedarray;
	    }
    @Override
    // compile-time error
    // issue while throwing parent exception
    void m1() throws Exception
    { System.out.println("From child4 m1()");}
     
    void m2() throws RuntimeException
    { System.out.println("From child4 m2()");}
    
    void m3() throws IOException
    { System.out.println("From parent m3()");}
     
}