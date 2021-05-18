package aut.utcluj.isp.ex1;

public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName) {
        this.firstName = firstName;
<<<<<<< HEAD
        this.lastName="";
=======
        this.lastName = "";
>>>>>>> ba66fb5c13c97dfb649007abd54f88bd9e581356
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
<<<<<<< HEAD
        this.lastName= lastName;
=======
        this.lastName = lastName;
   
>>>>>>> ba66fb5c13c97dfb649007abd54f88bd9e581356
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
