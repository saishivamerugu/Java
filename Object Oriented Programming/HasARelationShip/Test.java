package HasARelationShip;

public class Test {

	public static void main(String[] args) {
		
		College clg=new College("Dr Kalam International University",7,new Department(new Professor("Akash","ECE",5),"ECE",150));
		System.out.println(clg);
		
	}
}
