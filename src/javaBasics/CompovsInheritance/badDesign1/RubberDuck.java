package javaBasics.CompovsInheritance.badDesign1;

public class RubberDuck  extends Duck {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	@Override	
	public void quack() {
		//rubber duck don't quack so overriden to squeak
	}
	@Override	
	public void swim () {
		//rubber duck don't swim so overriden to squeak
	}

}
