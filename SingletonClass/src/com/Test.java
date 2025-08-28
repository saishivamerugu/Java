package com;

public class Test {

	public static void main(String[] args) {
//		Employee emp = new Employee();
//		Employee emp2 = new Employee();
//		
//		System.out.println(emp.hashCode());
//		System.out.println(emp2.hashCode());
//		
//		System.out.println(emp == emp2);
		Employee emp = Employee.getEmployee();
		System.out.println(emp); // return the hashcode
		
		Employee emp2 = Employee.getEmployee();
		System.out.println(emp == emp2);
		// we have created the object only once so it gives me true
		
	}
}
