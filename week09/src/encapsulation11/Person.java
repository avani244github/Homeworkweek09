package encapsulation11;
/*11. Write a Java program to create a class called Person with private instance variables
name, age. and country. Provide public getter and setter methods to access and modify
these variables.*/
public class Person {
    private String name;
    private int age;
    private String country;
    public String get_name(){
        return name;
    }
    public void set_name(String name){
       this.name = name;}
    public int get_age(){
        return age;
    }
    public void set_age(int age){
        this.age = age;}
    public String get_country(){
        return country;
    }
    public void set_country(String country){
        this.country = country;}
    }



