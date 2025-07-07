package package1;

public class class1 {

    // public
    public int a = 10;
    public int b = 20;

    // protected
    protected String collegeName = "ABC College";
    protected int rollNumber = 101;

    // default (package-private)
    String city = "Hyderabad";
    int pinCode = 500001;

    // public method
    public void add() {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

    // protected method
    protected void studentDetails() {
        System.out.println("College: " + collegeName + ", Roll Number: " + rollNumber);
    }

    // default method
    void address() {
        System.out.println("City: " + city + ", Pincode: " + pinCode);
    }

    // private
    private String name = "Aman";
    private long mblNumber = 98989989;

    private void details() {
        System.out.println("Name " + name + " Mobile Number: " + mblNumber);
    }

    public static void main(String[] args) {
        class1 obj = new class1();
        System.out.println(obj.name + " " + obj.mblNumber);
        obj.details();
    }
}




//------Notes--------
//class1
//│
//├── public       → Anywhere
//├── protected    → Same package + Inherited subclasses outside package + without subclass in the package
//├── default      → Same package only
//└── private      → Same class only

