package FinalJava;

// final class - > can't get Inherited
final class FinalClass {
	
    void showMessage() {
        System.out.println("This is a final class, cannot be extended.");
    }
}

class Base {
	
    // final variable
    final int accountNumber = 12345;

    // final method
    final void accountDetails() {
        System.out.println("Account Number is: " + accountNumber);
    }
}

class Derived extends Base {
	
    // void accountDetails() {} // cannot override final method
}

public class FinalExample {
	
    public static void main(String[] args) {
        Base obj=new Base();
        obj.accountDetails();
        System.out.println("Account Number is: " + obj.accountNumber);

        FinalClass fObj = new FinalClass();
        fObj.showMessage();
    }
}
