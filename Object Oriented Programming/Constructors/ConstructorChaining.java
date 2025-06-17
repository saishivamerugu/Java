package Constructors;

//5. Write a program demonstrating constructor chaining using both this() and super().
//Create classes Person (parent) and Employee (child).
//Use constructor chaining in both classes.

class Person{
	
	String name;
	int age;
	
	public Person() {
		this("Default",0);
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println(name+" "+age);
	}

}

class Employee extends Person{
	
	String empName;
	int empId;
	
	public Employee() {
		this("Default",0,"None",000);
	}
	
	public Employee(String empName,int empId) {
		this("Default",0,empName,empId);
		System.out.println(name+" "+age+" "+empName+" "+empId);
	}
	
	
	public Employee(String name,int age,String empName,int empId) {
		super(name,age);
		this.empName=empName;
		this.empId=empId;
		System.out.println(name+" "+age+" "+empName+" "+empId);
	}
	
}


public class ConstructorChaining {
	public static void main(String[] args) {
		new Employee();
		new Employee("AsurajKumar",555);
		new Employee("Suraj",20,"AsurajKumar",555);
	}
}
