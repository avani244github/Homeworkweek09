package Polymorphism09;
/*Write a Java program to create a base class Animal with methods move() and
 makeSound(). Create two subclasses Bird and Panthera. Override the move() method
 in each subclass to describe how each animal moves. Also, override the makeSound()
 method in each subclass to make a specific sound for each animal.*/
public class Panthera extends Animal{
    @Override
    public void move(String Panther) {
        System.out.println("Move of Panthera :- "+Panther);
    }

    @Override
    public void Sound(String Panther) {
        System.out.println("Sound of Panther :- "+Panther);
    }

    public static void main(String[] args) {
        Panthera x1 = new Panthera();
        x1.move("Slinking and Crouching");
        x1.Sound("Roar");

    }
}
