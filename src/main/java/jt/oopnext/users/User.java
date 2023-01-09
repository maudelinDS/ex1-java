package jt.oopnext.users;

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
        this.firstName = firstName;
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
}
