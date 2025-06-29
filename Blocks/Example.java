
public class Example {

	static int a=10;
	int b=20;
	
	public Example() {
		System.out.println("This is a constructor...");
		System.out.println("This is executed after executing the instance blocks...");
	}
	static {
		System.out.println("This is 1st Static Block");
		a=20; 
		/*
		 * b=20; 
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	        at StaticBlockAndBlockScope.Example.main(Example.java:24)
			We cannot acess the instance variables or methods 
		 */
		
		System.out.println(a);
	}
	
	static {
		System.out.println("This is 2nd Static Block");
		System.out.println(a);
	}
	
	static {
		System.out.println("This is 3rd Static Block");
	}
	
	public static void main(String[] args) {
		System.out.println("This is the main method");
		Example obj = new Example();
		Example obj1 = new Example();
	}
	
	{
		System.out.println("This is 1st Instance block");
		System.out.println(b);
		System.out.println(a);
	}
	{
		System.out.println("This is 2nd Instance block");
	}
}
