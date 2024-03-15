package example;

import java.io.Serializable;

public class Participant implements Serializable { // Class ini mengimplementasikan interface Serializable
    // Properti, atribut
    private final String firstName;
    private final String lastName;
    private int age;

    // Method with 3 params, this merujuk pada properti/atribut dari class
    public Participant(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Setter & getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + " tahun)";
    }
}
