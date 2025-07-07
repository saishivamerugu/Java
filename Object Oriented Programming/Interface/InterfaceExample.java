package Abstraction.java;

interface Trai{
	
	public static final int a=500;
	
	public void calling();
	public void messaging();
	public void internet();
	public void recharge();
}


class Airtel implements Trai{
	
	@Override
	public void calling() {
	System.out.println("Call are allowed 1paise/1minute ");
	}
	
	@Override
	public void messaging() {
		System.out.println("Call are allowed 1rupee/1message ");
	}
	
	@Override
	public void internet() {
		System.out.println("You get 1gb per day at 100 rs per gb ");
	}
	
	@Override
	public void recharge() {
		System.out.println("Features ");
		calling();
		messaging();
		internet();
		System.out.println("Recharge cost is 500 per month of the above features  ");
	}
	
	
}

	
public class InterfaceExample {
	public static void main(String[] args) {
		
		Airtel sim=new Airtel();
		sim.calling();
		sim.internet();
		sim.messaging();
		sim.recharge();
	}
}
