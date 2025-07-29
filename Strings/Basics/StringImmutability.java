package Basics;

public class StringImmutability {
    public static void main(String[] args){
        String original = "Hello";
        String modified = original.concat(" World");

        System.out.println("Original: " + original);   // Hello
        System.out.println("Modified: " + modified);   // Hello World

        // String Constant Pool
        //  --------------
        // | Hello        | <- String Original
        //  --------------
        // | Hello world  | <- String Modified
        //  --------------
        // |              |
        //  --------------
        // |              |
        //  --------------
        // |              |
        //  --------------
    }
}
