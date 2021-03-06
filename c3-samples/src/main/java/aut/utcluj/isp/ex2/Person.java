package aut.utcluj.isp.ex2;

import aut.utcluj.isp.ex1.*;

/**
 * @author stefan
 */
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName) {
        this.lastName = "";
        this.firstName= firstName;
    }

    public Person(String firstName, String lastName) {
        this.firstName= firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
