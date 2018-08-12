package javaBasics.CompovsInheritance.goodDesign;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		// do nothing - can't quack
		System.out.println("Silence");

	}

}
