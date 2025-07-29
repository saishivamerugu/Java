package Basics;

public class StringComparision {
    public static void main(String[] args) {
        
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        //Reference are compared
        System.out.println("a == b : "+(a==b));       
        System.out.println("a == c : "+(a==c));       

        //Values are compared using equals method
        System.out.println("a.equals(b) : "+a.equals(b)); 
        System.out.println("a.equals(c) : "+a.equals(c));

        //Comparing values using compare method 
        String x = "Apple";
        String y = "Banana";
        System.out.println("x.compareTo(y): " + x.compareTo(y)); 
        //gives the negative (Apple < Banana)
        System.out.println("x.compareTo(y): " + y.compareTo(x));
        //gives the positive (Banana > Apple)
    }
}

