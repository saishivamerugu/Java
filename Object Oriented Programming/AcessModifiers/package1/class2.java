package package1;

public class class2  {

    public static void main(String[] args) {
        class1 obj = new class1();

        // public
        System.out.println(obj.a + " + " + obj.b);
        obj.add();

        // protected
        System.out.println(obj.collegeName + " " + obj.rollNumber);
        obj.studentDetails();

        // default
        System.out.println(obj.city + " " + obj.pinCode);
        obj.address();

        // private  (Not accessible)
//        System.out.println(obj.name + " " + obj.mblNumber);
//        obj.details();
    }
}


