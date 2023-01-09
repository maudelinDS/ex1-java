package jt.oopnext.users;

public class Address {
    private int npa;
    private String street;
    private int number;
    private String city;

    public Address(int npa, String street, int number, String city) {
        this.npa = npa;
        this.street = street;
        this.number = number;
        this.city = city;
    }

    public void setAddressFromString(String address) {
        var splitted = address.split("-");

        npa = Integer.parseInt(splitted[2]);
        street = splitted[0];
        number = Integer.parseInt(splitted[1]);
        city = splitted[3];
    }

    public Address(String longAddress) {
        setAddressFromString(longAddress);
    }

    @Override
    public String toString() {
        return "Address{" +
                "npa=" + npa +
                ", street='" + street + '\'' +
                ", number=" + number +
                ", city='" + city + '\'' +
                '}';
    }
}
