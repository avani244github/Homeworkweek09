package polymorphism06;
/*Write a Java program to create a base class Animal (Animal Family) with a method
        called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
        each subclass to make a specific sound for each animal.*/
public class Cat extends Animal {
    @Override
    public void Sound(String Cat) {
        System.out.println("Cat Sound :- "+Cat);
    }

    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.Sound("mew mew");
    }
}
