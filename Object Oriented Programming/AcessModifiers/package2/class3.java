package package2;

import package1.class1;

public class class3 extends class1 {

    public static void main(String[] args) {
        class3 obj = new class3();

        // public
        System.out.println(obj.a);
        obj.add();

        // protected (Accessible via inheritance)
        System.out.println(obj.collegeName + " " + obj.rollNumber);
        obj.studentDetails();

        // default  (Not accessible outside package without inheritance)
//        System.out.println(obj.city + " " + obj.pinCode);
//        obj.address();

        // private 
//        System.out.println(obj.name + " " + obj.mblNumber);
//        obj.details();
    }
}
