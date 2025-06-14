package Classes;


//Define a class Fan with state speed and method rotate().

public class Fan {
	
	int speed;
	
	public void rotate() {
		System.out.println("The fan is rotating at speed of "+speed);
	}
	
	public static void main(String[] args) {
			Fan obj = new Fan();
			obj.speed=3;
			obj.rotate();
	}
	
}
