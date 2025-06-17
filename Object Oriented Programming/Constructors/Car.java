package Constructors;

//3. Create a class hierarchy:
//	○ Parent class Vehicle with a parameterized constructor.
//	○ Child class Car calls parent constructor using super().
//	○ Add fields and methods in both classes to display details.
//Instantiate the Car object and observe constructor chaining.

class Vehicle{
	String model;
	double price;
	
	public Vehicle() {
		this("Tata Harrier",2850000.00);
	}
	
	public Vehicle(String model,double price) {
		this.model=model;
		this.price=price;
	}
	public void displayDetails() {
		System.out.println(model+" "+price);
	}
}

class ChildCar extends Vehicle{
	String carCompany;
	int fuelCapacity;
	
	public ChildCar() {
		super();
		this.carCompany="Tata";
		this.fuelCapacity=50;
	}
	
	public ChildCar(String carCompany,int fuelCapacity,String model,double price) {
		super(model,price);
		this.carCompany=carCompany;
		this.fuelCapacity=fuelCapacity;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println(carCompany+" "+ fuelCapacity+" "+ model+" "+price);
	}
}

class Car{
	public static void main(String... args) {
		ChildCar obj=new ChildCar();
		ChildCar object = new ChildCar("Mahindra",52,"Thar",2500000);
		obj.displayDetails();
		object.displayDetails();
	}
}