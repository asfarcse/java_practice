package oops;
//Define a superclass
class Animal {
 public void makeSound() {
     System.out.println("The animal makes a sound");
 }
}

//Define a subclass that overrides the makeSound() method
class Dog extends Animal {
 @Override
 public void makeSound() {
     System.out.println("The dog barks");
 }
}

//Define another subclass that also overrides the makeSound() method
class Cat extends Animal {
 @Override
 public void makeSound() {
     System.out.println("The cat meows");
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     Animal animal = new Animal();
     Animal dog = new Animal();
     Animal cat = new Cat();
     
     animal.makeSound(); // The animal makes a sound
     dog.makeSound(); // The dog barks
     cat.makeSound(); // The cat meows
 }
 
 void add (int a,int a)
 
}
