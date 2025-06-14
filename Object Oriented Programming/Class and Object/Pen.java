package Classes;

//Create a class Pen with a method write(). Call it from main().

public class Pen {
	
	public void write() {
		System.out.println("The Pen is used to write the exam ");
	}
	
	public static void main(String args[]) {
		Pen object = new Pen();
		object.write();
	}
}
