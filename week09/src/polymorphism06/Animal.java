package polymorphism06;
/*Write a Java program to create a base class Animal (Animal Family) with a method
        called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
        each subclass to make a specific sound for each animal.*/
public class Animal {
    public void Sound(String Dog){
        System.out.println("Dog's Sound :- "+Dog);
    }

    public static void main(String[] args) {
        Animal i = new Animal();
        i.Sound("Bow Bow");

    }
}
