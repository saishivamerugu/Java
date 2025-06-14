package Classes;



//Create a class Rectangle with length and breadth. Add methods to calculate area and perimeter. Use multiple objects.


public class Rectangle {
	
	double length;
	double breadth;
	
	public void calculatePerimeter() {
		System.out.println("The perimeter of rectangle is "+ 2*(length+breadth));
	}
	
	public static void main(String[] args) {
		Rectangle calc = new Rectangle();
		
		calc.length=10.2;
		calc.breadth=30.56;
		calc.calculatePerimeter();
	}
}
