package MultiLevelInheritance;

// Create a class Animal, extended by Mammal, 
// which is further extended by Human. 
// Each class should have a unique method. 
// Show how the Human class can access all methods.


class Animal{
    String species;

    public Animal(String species){
        this.species=species;
        System.out.println("Animal constructor called.");
    }

    public void eat(){
        System.out.println(species +" eats food.");
    }
}

class Mammal extends Animal{
    String type;

    public Mammal(String species,String type) {
        super(species); 
        this.type=type;
        System.out.println("Mammal constructor is been called");
    }

    public void walk() {
        System.out.println(type + "walks on the  land");
    }
}

class Human extends Mammal{
    String name;

    public Human(String species, String type, String name) {
        super(species, type); 
        this.name = name;
        System.out.println("Human constructor is been called.");
    }

    public void speak() {
        System.out.println(name +" speaks languages");
    }

    public void showAllDetails() {
        System.out.println("\n--- Details ---");
        System.out.println("Species: "+species); 
        System.out.println("Type: "+type);       
        System.out.println("Name: "+name);       
        eat();   
        walk();
        speak(); 
    }
}

// Main class
public class TestClass1 {
    public static void main(String[] args) {
        Human human = new Human("Homo sapiens", "Primate", "Alice");
        human.showAllDetails();
    }
}
