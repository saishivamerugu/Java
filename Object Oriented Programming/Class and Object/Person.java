package Classes;


//Create a class Person with attributes name, age. Instantiate and print using System.out.println().

public class Person {
	
	String name;
	int age;
	
	
	public static void main(String[] args) {
		Person obj = new Person();
		
		obj.name="Sai";
		obj.age=21;
		
		System.out.println("The person name is "+ obj.name);
		System.out.println("The person age  is "+ obj.age);
		
	}
}
