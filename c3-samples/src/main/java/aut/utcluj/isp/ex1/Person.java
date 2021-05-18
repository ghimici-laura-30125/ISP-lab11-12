package aut.utcluj.isp.ex1;

public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName) {
        this.firstName = firstName;
        this.lastName="";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName= lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
