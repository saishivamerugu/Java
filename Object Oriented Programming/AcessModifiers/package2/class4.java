package package2;

import package1.class1;

public class class4 {

	public static void main(String[] args) {
		class1 obj=new class1();
		System.out.println(obj.a);
		
		//for private
//		System.out.println(obj.name+" "+ obj.mblNumber); -> They cannot be accessed 
//		obj.details();
	}
}
