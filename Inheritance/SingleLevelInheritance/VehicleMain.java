// Create a base class Vehicle with a method start(),
// and a derived class Car that adds a method drive().
// Show how the derived class can access both methods.


class Vehicle{
    public void start(){
        System.out.println("The car Engine started");
    }
}

class Car extends Vehicle{
    public void drive(){
        super.start();
        System.out.println("The car is started");
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Car car=new Car();
        car.drive();
    }
}
