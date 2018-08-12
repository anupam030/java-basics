package javaBasics.CompovsInheritance.badDesign1;


//Duck pond simulation game .The game can show a large variety of duck species swimming and making quakcing sounds.The initial
//designers of the system used OO techniques and created one duck superclass from which all other duck tyes inherit.

public abstract class Duck {
	
	public void quack() {
		//default implementation
	}
	
	public void swim () {
		// default implementation
	}
	
	public abstract void display();
	
	
	//Now a new requirement come and we need ducks to fly 
	public void fly() {
		// default implementation
	}
   
	//But the problem comes it will give flying ability to all ducks and  and it will also make Rubber Duck flyable
	
	//one way to overcome is override fly method in RubberDuck and do nothing
	
	// But what happens when we add wooden and decoy ducks in the program they are not supposed to fly or quack
}


