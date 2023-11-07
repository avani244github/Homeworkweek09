package encapsulation11;
/*11. Write a Java program to create a class called Person with private instance variables
name, age. and country. Provide public getter and setter methods to access and modify
these variables.*/
public class Person1 extends Person {
    public static void main(String[] args) {
        Person1 t = new Person1();
        t.set_name("Avani");
        t.set_age(29);
        t.set_country("India");
        System.out.println(t.get_name());
        System.out.println(t.get_age());
        System.out.println(t.get_country());

    }

}
