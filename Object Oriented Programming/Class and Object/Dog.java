package Classes;

/*
Create a class Dog with attributes breed and age. Create and print two objects.
*/

public class Dog {
	String breed;
	int age;
	
	public static void main(String[] args) {
		
		Dog obj1 = new Dog();
		Dog obj2 = new Dog();
		
		System.out.println("Object 1 : ");
		obj1.breed="RotWheeler"; 
		obj1.age=3;
		System.out.println("The breed is "+obj1.breed+" And its age is "+obj1.age);
		
		System.out.println("Object 2 : ");
		obj2.breed="GermanShepeard"; 
		obj2.age=4;
		System.out.println("The breed is "+obj2.breed+" And its age is "+obj2.age);
		
	}
}
