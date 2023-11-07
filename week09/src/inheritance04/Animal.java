package inheritance04;
/*Write a Java program to create a class called Animal with a method named move().
Create a subclass called Cheetah that overrides the move() method to run.*/
public class Animal {
    public void move(){
        String animal_move;
        System.out.println("Animal move:- serpentine");

    }

    public static void main(String[] args) {
        Animal x1 = new Animal();
        x1.move();

    }
}
