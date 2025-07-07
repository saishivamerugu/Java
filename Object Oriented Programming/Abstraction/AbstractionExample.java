package Abstraction.java;

abstract class Animal{
	
	String animalName;
	
	public Animal() {
		this("Unknown Animal");
	}
	
	public Animal(String animalName) {
		this.animalName=animalName;
	}
	
	public abstract void sound();
	
	public void sleeping() {
		System.out.println("The "+animalName+" is Sleeping");
	}
}

abstract class Lion extends Animal{
	
	public Lion() {
		super("Lion");
	}
	
	public void eat() {
		System.out.println("I eat flesh");
	}
	
	@Override
	public void sound() {
		System.out.println("The "+super.animalName+" Roars!");
	}
	
	public abstract void noOfLegs();
}

class cub extends Lion{

	@Override
	public void eat() {
		System.out.println("I drink milk ");
	}
	
	@Override
	public void sound() {
		super.eat();
		eat();
		System.out.println("The cub also roars!");
	}
	
	@Override
	public void noOfLegs() {
		System.out.println("4 legs");
	}
}


public class AbstractionExample {

	public static void main(String[] args) {
		
		cub c = new cub();
		c.sound();
		c.sleeping();
	}
}
