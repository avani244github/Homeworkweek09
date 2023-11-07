package polymorphism06;
/*Write a Java program to create a base class Animal (Animal Family) with a method
        called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
        each subclass to make a specific sound for each animal.*/
public class Bird extends Animal {
    @Override
    public void Sound(String Bird) {
        System.out.println("Bird's Sound :- "+Bird);
    }

    public static void main(String[] args) {
        Bird c1 = new Bird();
        c1.Sound("Tweet Tweet");
    }
}
