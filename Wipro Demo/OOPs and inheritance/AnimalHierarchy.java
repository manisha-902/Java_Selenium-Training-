package day3;
import java.util.Scanner;

class Animal {
 protected String name;
 protected int age;

 public Animal(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public void displayInfo() {
     System.out.println("\nAnimal: " + name);
     System.out.println("Age: " + age + " years");
 }

 public void makeSound() {
     System.out.println("This animal makes a sound.");
 }
}

class Bird extends Animal {
 private boolean canFly;

 public Bird(String name, int age, boolean canFly) {
     super(name, age);
     this.canFly = canFly;
 }

 public void displayInfo() {
     super.displayInfo();
     System.out.println("Type: Bird");
     System.out.println("Can Fly: " + (canFly ? "Yes" : "No"));
 }

 public void makeSound() {
     System.out.println("Chirp Chirp!");
 }
}

class Mammal extends Animal {
 private String habitat;

 public Mammal(String name, int age, String habitat) {
     super(name, age);
     this.habitat = habitat;
 }

 public void displayInfo() {
     super.displayInfo();
     System.out.println("Type: Mammal");
     System.out.println("Habitat: " + habitat);
 }

 public void makeSound() {
     System.out.println("Roar or Growl depending on mammal.");
 }
}
public class AnimalHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Select Animal Type:\n1. Bird\n2. Mammal");
        int choice = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Animal Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); 
        
        Animal animal;

        switch (choice) {
            case 1:
                System.out.print("Can it fly? (true/false): ");
                boolean canFly = sc.nextBoolean();
                animal = new Bird(name, age, canFly);
                break;

            case 2:
                System.out.print("Enter Habitat (e.g. Forest, Zoo): ");
                String habitat = sc.nextLine();
                animal = new Mammal(name, age, habitat);
                break;


            default:
                System.out.println("Invalid option.");
                sc.close();
                return;
        }

        animal.displayInfo();
        animal.makeSound();
        sc.close();
	}

}
