package jt.oopnext.users;

import java.util.Objects;

public class User {

    private String email;
    private String birthday;
    private String firstName;
    private String lastName;
    private Address address;

    // je creer un constructor avec les des parametre.
    public User(String email, String birthday, String firstName, String lastName, Address address) {
        this.email = email;
        this.birthday = birthday;
        setFirstName(firstName);
        this.lastName = lastName;
        this.address = address;

    }

    @Override
    public String toString() {
        return "User{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        Objects.requireNonNull(firstName);
        if (firstName.length() > 5) {
            throw new RuntimeException("Le firstName est trop long");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
