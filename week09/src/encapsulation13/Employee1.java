package encapsulation13;

public class Employee1 extends Employee {
    public static void main(String[] args) {
        Employee x = new Employee();
        x.setEmplpyee_id(21);
        x.setEmployee_name("John");
        System.out.println("Employee ID :- "+ x.getEmplpyee_id());
        System.out.println("Employee Name :- "+ x.getEmployee_name());
        System.out.println("Employee Salary :- £ "+ x.getformattedEmployee_salary(20000));


    }
}
