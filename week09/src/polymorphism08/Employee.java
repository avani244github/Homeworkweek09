package polymorphism08;

/*Write a Java program to create a class Employee with a method called
calculateSalary(). Create two subclasses Manager and Programmer. In each subclass,
override the calculateSalary() method to calculate and return the salary based on their
specific roles.*/
public class Employee {

    public void calculateSalary(int Basicsalary) {

        double HRA = .09 * Basicsalary;
        double FBP = 0.04 * Basicsalary;
        double Bonus = .01 * Basicsalary;
        double TotalSalary = Basicsalary + HRA + FBP + Bonus;
        System.out.println(TotalSalary);


    }
    public static void main(String[] args) {
        Employee r1 = new Employee();
        r1.calculateSalary(50000);
    }


}
