package javaBasics;

class InstanceInitializer {
	/*	https://www.geeksforgeeks.org/instance-initialization-block-iib-java/
		https://www.geeksforgeeks.org/g-fact-26-the-initializer-block-in-java/	
	 */}

class A{  
	A(){  
		System.out.println("parent class constructor invoked");  
	}  
}  

public class B3 extends A{  
	B3(){  
		super();  
		System.out.println("child class constructor invoked");  
	}  

	B3(int a){  
		super();  
		System.out.println("child class constructor invoked "+a);  
	}  

	{
		System.out.println("instance initializer block is invoked");
		}  

	public static void main(String args[]){  
		B3 b1=new B3();  
		B3 b2=new B3(10);  
	}  
}