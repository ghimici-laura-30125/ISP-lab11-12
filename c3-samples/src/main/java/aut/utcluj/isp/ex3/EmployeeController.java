package aut.utcluj.isp.ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author stefan
 */
public class EmployeeController {
    /**
     * Add new employee to the list of employees
     *
     * @param employee - employee information
     */
    List <Employee> employees = new ArrayList<>();
    
    public void addEmployee(final Employee employee) {
        employees.add(new Employee());
    }

    /**
     * Get employee by cnp
     *
     * @param cnp - unique cnp
     * @return found employee or null if not found
     */
    public Employee getEmployeeByCnp(final String cnp) {
        for(Employee empl:employees)
            if(empl.getCnp().equals(cnp))
                return empl;
        return null;
    }

    /**
     * Update employee salary by cnp
     *
     * @param cnp    - unique cnp
     * @param salary - salary
     * @return updated employee
     */
    public Employee updateEmployeeSalaryByCnp(final String cnp, final Double salary) {
       for(Employee empl:employees)
         if(empl.getCnp().equals(cnp))
         { empl.setSalary(salary);
             return empl;}
       return null;
              
    }

    /**
     * Delete employee by cnp
     *
     * @param cnp - unique cnp
     * @return deleted employee or null if not found
     */
    public Employee deleteEmployeeByCnp(final String cnp) {
         for(Employee empl:employees)
            if(empl.getCnp().equals(cnp))
            {employees.remove(empl);
            return empl;
            }
         return null;
    }

    /**
     * Return current list of employees
     *
     * @return current list of employees
     */
    public List<Employee> getEmployees() {
       return employees;
    }

    /**
     * Get number of employees
     *
     * @return - number of registered employees
     */
    public int getNumberOfEmployees() {
        return employees.size();
    }
}
