package Basics;

public class StringConcatenation {
    public static void main(String[] args) {
        String firstName = "Merugu";
        String lastName = "Sai Shiva";

        // Using + operator
        System.out.println("Using + Operator : ");
        String fullName1=firstName+" "+lastName;
        System.out.println("Full Name : "+fullName1);

        // Using concat() method
        System.out.println("Concat Method : ");
        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println("Full Name : "+fullName2);
    }
}
