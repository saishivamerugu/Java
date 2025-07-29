package Methods;

public class StringMethods {
    public static void main(String[] args) {
        //String Creation
        String str1="Hello";
        String str2= "Hello";
        String str3 = new String("Hello");

        System.out.println("str1==str2: " +(str1 == str2));         
        System.out.println("str1== str3: " +(str1 == str3));         
        System.out.println("str1.equals(str3): "+ str1.equals(str3)); 

        // equals() and equalsIgnoreCase() 
        String a = "Java";
        String b = "java";

        System.out.println("a.equals(b): " + a.equals(b));                   
        System.out.println("a.equalsIgnoreCase(b): " + a.equalsIgnoreCase(b)); 

        // compareTo()
        int cmp = a.compareTo(b); // case-sensitive
        if (cmp == 0) {
            System.out.println("a and b are equal using compareTo()");
        } else if (cmp < 0) {
            System.out.println("a comes before b using compareTo()");
        } else {
            System.out.println("a comes after b using compareTo()");
        }

        // compareToIgnoreCase()
        cmp=a.compareToIgnoreCase(b);
        if (cmp==0){
            System.out.println("a and b are equal using compareToIgnoreCase()");
        } else if (cmp<0){
            System.out.println("a comes before b using compareToIgnoreCase()");
        } else{
            System.out.println("a comes after b using compareToIgnoreCase()");
        }

        // String Methods

        // toLowerCase()
        String s1="Welcome to Balaji Institute of Technology and Science";
        System.out.println("Lower Case: " + s1.toLowerCase());

        // toUpperCase()
        String s2="indian institute of technology";
        System.out.println("Upper Case: " + s2.toUpperCase());

        // length()
        String str="National Institute of Technology";
        System.out.println("Length : " +str.length());

        // indexOf()
        System.out.println("Index of 'of' : " +str.indexOf("of"));

        // lastIndexOf()
        System.out.println("Last index of 'to' : " +s1.lastIndexOf("to"));

        // startsWith() and endsWith()
        System.out.println("Starts with 'Welcome' : " +s1.startsWith("Welcome"));
        System.out.println("Ends with 'Science' : " +s1.endsWith("Science"));

        // substring()
        System.out.println("Substring (8, 10) : " +s1.substring(8, 10));

        // charAt()
        System.out.println("Character at index 5 in s1 : "+s1.charAt(5));

        // contains()
        System.out.println("s1 contains 'Institute' : "+s1.contains("Institute"));

        // replace()
        System.out.println("Replace 'Science' with 'Sciences' : " +s1.replace("Science", "Sciences"));

        // trim()
        String spaced ="   Trim me   ";
        System.out.println("Before trim : " +spaced+ "");
        System.out.println("After trim : "+spaced.trim()+"");

        // split()
        String csv ="Java,Python,C++,JavaScript";
        String[] parts=csv.split(",");
        System.out.println("Split result : ");
        for (String lang : parts) {
            System.out.println(lang);
        }

        // isEmpty()
        String empty ="";
        System.out.println("Is empty string empty? " +empty.isEmpty());

        // toCharArray()
        // String a="Java"; 
        char[] chars = a.toCharArray();
        System.out.println("Characters in 'a' : ");
        for (char ch : chars) {
            System.out.println(ch);
        }
    }
}


