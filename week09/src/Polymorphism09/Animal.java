package Polymorphism09;
/*Write a Java program to create a base class Animal with methods move() and
makeSound(). Create two subclasses Bird and Panthera. Override the move() method
in each subclass to describe how each animal moves. Also, override the makeSound()
method in each subclass to make a specific sound for each animal.*/
public class Animal {
    public void move(String Monkey){
        System.out.println("Monkey's Move :- "+ Monkey);

    }
    public void Sound(String Monkey){
        System.out.println("Monkey's Sound :- "+ Monkey);
    }

    public static void main(String[] args) {
       Animal x1 = new Animal();
       x1.move("Jump Jump");
       x1.Sound("Hop Hop");

    }
}
