package javaBasics.MethodOverriding;

/*Static methods can not be overridden(Method Overriding vs Method Hiding) : When you defines a 
static method with same signature as a static method in base class, it is known as method hiding.
The following table summarizes what happens when you define a method with the same signature as 
a method in a super-class.

 	SUPERCLASS INSTANCE METHOD	SUPERCLASS STATIC METHOD
SUBCLASS INSTANCE METHOD	Overrides	Generates a compile-time error
SUBCLASS STATIC METHOD	Generates a compile-time error	Hides.*/

/* Java program to show that if static method is redefined by
a derived class, then it is not overriding,it is hiding */
 
class Parent1
{
    // Static method in base class which will be hidden in subclass 
    static void m1() { System.out.println("From parent static m1()");}
     
    // Non-static method which will be overridden in derived class 
    void m2() { System.out.println("From parent non-static(instance) m2()"); }
}
 
class Child1 extends Parent1
{
    // This method hides m1() in Parent
    static void m1() { System.out.println("From child static m1()");}
     
    // This method overrides m2() in Parent 
    @Override
    public void m2() { System.out.println("From child non-static(instance) m2()");}
     
}
 
// Driver class
public class MethodHiding
{
    public static void main(String[] args)
    {
        Parent1 obj1 = new Child1();
         
        // As per overriding rules this should call to class Child static 
        // overridden method. Since static method can not be overridden, it 
        // calls Parent's m1() 
        obj1.m1(); 
     
        // Here overriding works and Child's m2() is called 
        obj1.m2(); 
    }
}
