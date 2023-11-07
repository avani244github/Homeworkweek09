package Polymorphism09;
/*Write a Java program to create a base class Animal with methods move() and
        makeSound(). Create two subclasses Bird and Panthera. Override the move() method
        in each subclass to describe how each animal moves. Also, override the makeSound()
        method in each subclass to make a specific sound for each animal.*/
public class Bird extends Animal{
    @Override
    public void Sound(String Peacock) {
        System.out.println("Peacock Sound :- " + Peacock);
    }

    @Override
    public void move(String Peacock) {
        System.out.println("Peacock Move :- " + Peacock);
    }

    public static void main(String[] args) {
        Bird m1 = new Bird();
        m1.move("chap chap");
        m1.Sound("Tehuk Tehuk");

    }
}
