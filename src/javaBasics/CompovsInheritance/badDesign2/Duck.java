package javaBasics.CompovsInheritance.badDesign2;


//we can take out the fly and quack method out of the duck superclass and make flyable and quackable interface
//that way only those ducks which are supposed to implment quack and fly will implement those behaviour

public abstract class Duck {

	public void swim () {
		// default implementation
	}
	
	public abstract void display();
}


// Very bad approach since what if we need to make change to fly behaviour then we need to make chnage in every class which is implementing fly interface