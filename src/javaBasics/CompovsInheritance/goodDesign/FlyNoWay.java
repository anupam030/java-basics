package javaBasics.CompovsInheritance.goodDesign;

public class FlyNoWay implements FlyBehaviour {

	@Override
	public void fly() {
		// do nothing - can't fly
		System.out.println("I can't fly");

	}

}
