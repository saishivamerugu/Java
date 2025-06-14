package Classes;

// Create a Circle class with radius, and methods to calculate area and circumference.

public class Circle {
	
	double radius;
	
	public double area(double radius) {
		return Math.PI*radius*radius;
	}
	
	public double circumfurence(double radius) {
		return 2*Math.PI*radius;
	}
	
	public static void main(String[] args) {
		
		Circle a=new Circle();
		Circle c=new Circle();
		
		System.out.println("Area of circle             : "+a.area(20.34));
		System.out.println("Circumfurence of circle is : "+c.circumfurence(18.98));
	}
}
