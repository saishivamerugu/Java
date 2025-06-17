package Constructors;

//2. Create a class Rectangle with fields length and width.
//○ Implement constructor chaining using this().
//○ Write a method to calculate and return area.
//Test different ways to create objects.

public class Rectangle {
	
	double length,breadth;
	
	public Rectangle() {
		this(10,20);
	}
	
	public Rectangle(int length) {
		this.length=length;
		this.breadth=30;
	}
	
	public Rectangle(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	public double calcArea() {
		return length*breadth;
	}
	
	public static void main(String[] args) {
		
		Rectangle defaultRectangle = new Rectangle();
        Rectangle customRectangle = new Rectangle(10, 49);
        Rectangle singleValueRectangle = new Rectangle(10);
        
        System.out.println("Area (default): " + defaultRectangle.calcArea());
        System.out.println("Area (custom): " + customRectangle.calcArea());
        System.out.println("Area (single value): " + singleValueRectangle.calcArea());
	}
}
