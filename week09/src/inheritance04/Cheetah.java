package inheritance04;

/*Write a Java program to create a class called Animal with a method named move().
Create a subclass called Cheetah that overrides the move() method to run.*/
public class Cheetah extends Animal {
    @Override
    public void move() {
        System.out.println("Cheetah move:- Slinking motion");
    }

    public static void main(String[] args) {
Cheetah x1 =new Cheetah();
x1.move();
    }
}
