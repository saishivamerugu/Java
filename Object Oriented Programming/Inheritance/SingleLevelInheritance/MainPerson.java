// Create a class Person with a method displayDetails(), and a class Student that inherits from Person. 
// Add a method showGrade() in Student. 
// Demonstrate single-level inheritance using both methods.

class Person{
    String name;
    int age;
    
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void displayDetails(){
        System.out.println("Name of person : "+name);
        System.out.println("Age of person : "+age);
    }
}

class Student extends Person{

    double grade;
    public Student(String name, int age,double grade) {
        super(name,age);
        this.grade=grade;
    }
    public void printGrade(){
        System.out.println("The grade of the Student is : "+grade);
    }
}

public class MainPerson{
    public static void main(String[] args) {
        Student s1=new Student("Sai",20,9.0);
        s1.displayDetails();
        s1.printGrade();
    }
}
