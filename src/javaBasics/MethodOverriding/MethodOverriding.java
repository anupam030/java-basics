package javaBasics.MethodOverriding;



/*Rules for method overriding*/

/*Overriding and Access-Modifiers : The access modifier for an overriding method can allow more, 
but not less, access than the overridden method. For example, a protected instance method in the
super-class can be made public, but not private, in the subclass. Doing so, will generate
compile-time error.*/
//A Simple Java program to demonstrate 
//Overriding and Access-Modifiers

 class Parent
{
 // private methods are not overridden
 private void m1() { System.out.println("From parent m1()");}
  
 protected void m2() { System.out.println("From parent m2()"); }
}

class Child extends Parent
{
 // new m1() method
 // unique to Child class
 private void m1() { System.out.println("From child m1()");}
  
 // overriding method
 // with more accessibility
 @Override
 public void m2() { System.out.println("From child m2()");}
  
}

//Driver class
public class MethodOverriding
{
 public static void main(String[] args)
 {
     Parent obj1 = new Parent();
     obj1.m2();
     Parent obj2 = new Child();
     obj2.m2();
 }
}

/*Final methods can not be overridden : If we don’t want a method to be overridden, we declare it 
as final. Please see Using final with Inheritance .*/
//A Java program to demonstrate that
//final methods cannot be overridden


