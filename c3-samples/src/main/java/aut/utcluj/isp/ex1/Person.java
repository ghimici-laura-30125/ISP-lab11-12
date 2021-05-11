package aut.utcluj.isp.ex1;

public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName) {
        this.firstName = firstName;
        this.lastName = "";
<<<<<<< HEAD
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
=======
        this.firstName= firstName;
    }

    public Person(String firstName, String lastName) {
        this.firstName= firstName;
        this.lastName=lastName;
>>>>>>> 8ca524bde9dd887504f28776b491f43c3254c107
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
