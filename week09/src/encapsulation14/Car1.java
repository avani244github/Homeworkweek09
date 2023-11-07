package encapsulation14;
/*Write a Java program to create a class called Car with private instance variables
company_name, model_name, year, and mileage. Provide public getter and setter
methods to access and modify the company_name, model_name, and year variables.
However, only provide a getter method for the mileage variable.*/

public class Car1 extends Car {
    public static void main(String[] args) {
        Car1 v = new Car1();
        v.setCompany_name("BMW");
        v.setModel_name("Bm546");
        v.setModel_year(2017);
        System.out.println("Company name :- "+ v.getCompany_name());
        System.out.println("Model name :- "+ v.getModel_name());
        System.out.println("Model year :- "+ v.getModel_year());
        System.out.println("Mileage per mile :- " + v.getMileage());

    }
}
