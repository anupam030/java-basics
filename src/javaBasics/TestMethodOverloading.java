package javaBasics;

/*Polymorphism is the ability of an object to take on many forms. It is a fundamental concept in OOP
. Any Java object that can pass more than one IS-A test is considered to be polymorphic.

In simplest of terms, an object is a physical entity that has a state(variables) and a 
behaviour(methods).

In Java there are two types of polymorphism :

Compile Time Polymorphism : Method Overloading is an example of compile time polymorphism and 
usually occurs inside the same class. Methods are overloaded by changing the method 
signature(return type+parameter list). It is called compile time polymorphism because compiler 
decides which method to call based on the signature.
*/
class Adder {
	
/*	Different ways to overload the method
	There are two ways to overload the method in java

	By changing number of arguments
	By changing the data type of arguments*/

	/*In java, Method Overloading is not possible by changing the return type of the method only.*/
	static int add(int a,int b){return a+b;}  
	static int add(int a,int b,int c){return a+b+c;}
	static double add(double a, double b){return a+b;} 
	static double add(Double a, Double b){return a+b;} 
	/*static int add(double a,double b){return (int) (a+b);} */
	/*double add(Double a, Double b){return a+b;} */// will throw duplicate method error
	/*static double add(int a,int b){return a+b;}*/  // will throw duplicate method error not possible by changing return type
	
    
	
}


class OverloadingCalculation1{  

	//Type Promotion
	  void sum(int a,long b){System.out.println(a+b);}  
	  void sum(int a,int b,int c){System.out.println(a+b+c);}  
}

class OverloadingCalculation3{  
	  void sum(int a,long b){System.out.println("a method invoked");}  
	  void sum(long a,int b){System.out.println("b method invoked");}  
	} 
public class TestMethodOverloading {
	
	public static void main(String[] args){  
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(11,11,11)); 	
		
		 OverloadingCalculation1 obj=new OverloadingCalculation1();  
		  obj.sum(20,20);//now second int literal will be promoted to long  
		  obj.sum(20,20,20);  
		  OverloadingCalculation3 obj3=new OverloadingCalculation3();  
		 // obj3.sum(20,20);//now ambiguity  
	}  
	public static void main(String args){System.out.println("main with String");}  
	public static void main(){System.out.println("main without args");}  //overloading main method only String[] args will be called
}
