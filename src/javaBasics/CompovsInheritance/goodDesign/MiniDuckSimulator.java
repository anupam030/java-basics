package javaBasics.CompovsInheritance.goodDesign;

public class MiniDuckSimulator {

	public static void main(String[] args) {
    
		Duck mallard = new MallardDuck();
		mallard.setQuackBehaviour(new Quack());
		mallard.setFlyBehaviour(new FlywithWings());
		
		mallard.performQuack();
        mallard.performFly();

	}

}
