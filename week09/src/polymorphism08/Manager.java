package polymorphism08;

/*Write a Java program to create a class Employee with a method called
calculateSalary(). Create two subclasses Manager and Programmer. In each subclass,
override the calculateSalary() method to calculate and return the salary based on their
specific roles.*/
public class Manager extends Employee {

    public static void main(String[] args) {
        Manager x1 = new Manager();
        x1.calculateSalary(45000);

    }

    @Override
    public void calculateSalary(int Basicsalary) {
        double HRA = .09 * Basicsalary;
        double FBP = 0.07 * Basicsalary;
        double Bonus = .09 * Basicsalary;
        double TotalSalary = Basicsalary + HRA + FBP + Bonus;
        System.out.println("Salary of the Manager : " + TotalSalary);









        }
    }


