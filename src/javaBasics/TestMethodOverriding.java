package javaBasics;

/*Rules for Method Overriding
The argument list should be exactly the same as that of the overridden method.

The return type should be the same or a subtype of the return type declared in the original 
overridden method in the superclass.

The access level cannot be more restrictive than the overridden method's access level. For 
example: If the superclass method is declared public then the overridding method in the sub 
class cannot be either private or protected.

Instance methods can be overridden only if they are inherited by the subclass.

A method declared final cannot be overridden.

A method declared static cannot be overridden but can be re-declared.

If a method cannot be inherited, then it cannot be overridden.

A subclass within the same package as the instance's superclass can override any superclass
 method that is not declared private or final.

A subclass in a different package can only override the non-final methods declared public or 
protected.

An overriding method can throw any uncheck exceptions, regardless of whether the overridden 
method throws exceptions or not. However, the overriding method should not throw checked 
exceptions that are new or broader than the ones declared by the overridden method. The 
overriding method can throw narrower or fewer exceptions than the overridden method.

Constructors cannot be overridden.*/



//https://www.geeksforgeeks.org/overriding-in-java//
class Animal {
	public void move() {
		System.out.println("Animals can move");
	}

	public void run (int speed) {
		System.out.println("Animals run at integer speed");
	}
}

class Dog extends Animal {
	public void move() {
		System.out.println("Dogs can walk and run");
	}
	public void bark() {
		System.out.println("Dogs can bark");
	}

	public void run (double speed) {
		System.out.println("Dogs run at double speed");
	}

	public void run (int speed) {
		System.out.println("Dogs run at integer speed");
	}
}

public class TestMethodOverriding {
	public static void main(String args[]) {
		Animal a = new Animal();   // Animal reference and object
		Animal b = new Dog();   // Animal reference but Dog object

		//  Dog d= (Dog) new Animal(); // will throw classcast exception
		a.move();   // runs the method in Animal class
		b.move();   // runs the method in Dog class
		/*b.bark();*///will throw compile time error
		a.run(10);
		b.run(10);
	}
}



