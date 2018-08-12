package javaBasics.CompovsInheritance.goodDesign;

//Identiy the aspects of the programme which may vary and seperate them from what stays the same

// Take what varies and "encapsulate" it and so it won't affect the rest of the code

// Program for interface and not implementation and compose this as inheritance

//This favours composition over inheritance



public abstract class Duck {

	private FlyBehaviour flyBehaviour;

	private	QuackBehaviour quackBehaviour;

	public void swim () {
		// default implementation
	}

	public abstract void display();

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void performFly() {
		flyBehaviour.fly();
	}
}
