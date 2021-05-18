package aut.utcluj.isp.ex2;

/**
 * @author stefan
 */
public class Employee {
    private Double salary;
    Person person;
    public Employee(String firstName, String lastName, Double salary) {
        person.setFirstName(firstName);
        person.setLastName(lastName);
        this.salary=salary;
    }

    public Double getSalary() {
        return salary;
    }

    /**
     * Show employee information
     * @return employee information (Firstname: firstname Lastname: lastname Salary: salary)
     */

    public String showEmployeeInfo() {
        return "Employee: " + "Firstname: "+ person.getFirstName()+ " Lastname: " + person.getLastName()+ " Salary: "+salary;
    }
}
