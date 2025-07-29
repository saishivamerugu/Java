package Basics;

import java.lang.String;


class StringCreation{
    public static void main(String[] args){
        
        //creating the String
        //It can be created in two ways 

        //1.String Constant Pool - (SCP)
        String str1="Hello";

        //2.Using new Keyword String created at Heap memory
        String str2=new String("Java");

        System.out.println("The first String is : "+str1);
        System.out.println("The second String is : "+str2);
        
    }
}