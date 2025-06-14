package Classes;


//Build a Car class with variable Engine .  demonstrate functionality of engine.

public class Car {
	String carCompany;
	String Engine;
	int fuelCapacity;
	
	public void CarDetails() {
		System.out.println("The Car company is "+carCompany+" of "+Engine+" having fuel Capacity of "+fuelCapacity+" litres");
	}
	
	public static void Move() {
		Car obj1 = new Car();
		obj1.carCompany="Mahindra";
		obj1.Engine="Diesel Engine";
		obj1.fuelCapacity=32;
		System.out.println("The Car company is "+obj1.carCompany+" of "+obj1.Engine+" having fuel Capacity of "+obj1.fuelCapacity+" litres");
	}
}

class Test{
	public static void main(String... args) {
		Car obj = new Car();
		obj.carCompany="Tata";
		obj.Engine="Petrol Engine";
		obj.fuelCapacity=32;
		obj.CarDetails();
		Car.Move();
		
	}
}

























