package encapsulation13;
/*13. Write a Java program to create a class called Employee with private instance variables
employee_id, employee_name, and employee_salary. Provide public getter and setter
methods to access and modify the id and name variables, but provide a getter method
for the salary variable that returns a formatted string.*/
public class Employee {
    private int emplpyee_id;
    private String employee_name;
    private double employee_salary;

    public int getEmplpyee_id() {
        return emplpyee_id;
    }

    public void setEmplpyee_id(int emplpyee_id) {
        this.emplpyee_id = emplpyee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getformattedEmployee_salary(double employee_salary) {
        return String.format("%.2f",employee_salary);
    }



}
