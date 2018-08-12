package javaBasics.CompovsInheritance.badDesign2;

public class RubberDuck  extends Duck implements Quackable{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	@Override	
	public void quack() {
		//rubber duck don't quack so overriden to squeak
	}

}
