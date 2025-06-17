package Constructors;

//4. Implement a class BankAccount with private fields and overloaded constructors.
//○ No-arg constructor initializes account with default balance.
//○ Parameterized constructor initializes with given account number and balance.
//○ Add methods to deposit, withdraw, and display balance , display details .
//Use constructor chaining.

public class BankAccount {

	private String name;
	private int age;
	private String accountNo;
	private double balance;
	
	public BankAccount() {
		this("Default-User",0,"10Ax123400",100.00);
	}
	
	public BankAccount(String name,int age,String accountNo,double balance) {
		this.name=name;
		this.age=age;
		this.accountNo=accountNo;
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println(amount+" is the deposited amount ");
		}
		else {
			System.out.println(amount +" is Invalid Deposit Amount ");
		}	
	}
	
	public void withDraw(double amount) {
		if(!(amount<=0)) {
			balance-=amount;
			System.out.println("You have sucessfully debited "+amount);
		}
		else {
			System.out.println("Amount is not suffcient "+amount);
		}
	}
	
	public void displayBalance() {
		System.out.println("The balance amount is "+ balance);
	}
	
	public void displayDetails() {
		System.out.println(" User name : "+ name);
		System.out.println(" Age       : "+ age);
		System.out.println(" AccountNo : "+ accountNo);
		System.out.println(" balance   : "+ balance);
	}
	
	public static void main(String args[]) {
		
		BankAccount account1=new BankAccount();
		account1.withDraw(50);
		account1.deposit(4950);
		account1.displayBalance();
		account1.displayDetails();
		
		BankAccount account2=new BankAccount("Ashok",20,"A10Wx2345",5000);
		account2.withDraw(500);
		account2.deposit(49500);
		account2.displayBalance();
		account2.displayDetails();
	}
	
}
