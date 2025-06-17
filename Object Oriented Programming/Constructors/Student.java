package Constructors;


//Coding Practice Tasks (Constructor Focused)
//1. Create a class Student with fields name, age, and grade.
//	○ Write a no-arg constructor that initializes default values.
//	○ Write a parameterized constructor to initialize all fields.
//	○ Write a method to display student details.
//	○ Create objects using both constructors and display details.



public class Student {
	
	//Fields
	String name;
	int age;
	char grade;
	
	//default constructor to initialize the values 
	public Student() {
		name="Ashok";
		age=20;
		grade='A';
	}
	
	public Student(String name,int age,char grade) {
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
	
	public void studentDetails() {
		System.out.println("The name of Student is : "+name);
		System.out.println("The age of "+name+" is "+age);
		System.out.println("grade is "+grade);
	}
	
	
	public static void main(String[] args) {
		
		Student object = new Student();
		Student Object = new Student("Sai",20,'A');
		object.studentDetails();
		Object.studentDetails();
	}
}
