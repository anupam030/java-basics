package javaBasics.MethodOverriding;


/*From Java 5.0 onwards it is possible to have different return type for a overriding method in 
child class, but child’s return type should be sub-type of parent’s return type. 
This phenomena is known as covariant return type.*/
/*Co-variant return type is based on Liskov substitution principle.*/

//Java program to demonstrate that we can have
//different return types if return type in
//overridden method is sub-type

//Two classes used for return types.
class A {}
class B extends A {}

class Base
{
Number fun(int i,int j)
 {
     System.out.println("Base fun()");
     return new Integer(i);
 }
}

class Derived extends Base
{
 Integer fun(int i,int j)
 {
     System.out.println("Derived fun()");
     return new Integer(i);
 }
}

public class CovarianReturnType
{
 public static void main(String args[])
 {
    Base base = new Base();
    base.fun(1,2);

    Derived derived = new Derived();
    derived.fun(1,2);
 }
}