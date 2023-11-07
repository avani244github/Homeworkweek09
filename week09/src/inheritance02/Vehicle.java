package inheritance02;
/*Write a Java program to create a class called Vehicle with a method called drive().
Create a subclass called Car that overrides the drive() method to print "Repairing a
car".*/
public class Vehicle {
    public void drive(){
        System.out.println("Repairing a Scooter");
    }

    public static void main(String[] args) {
        Vehicle s1 = new Vehicle();
        s1.drive();
    }
}
