package address.data;

public class AddressEntry {
    private String firstName;
    private String lastName;
    private Address address;
    private String email;
    private String phoneNumber;

    public AddressEntry() {
    }

    public AddressEntry(String firstName, String lastName, String street, String city, String state, String zip, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = new Address(street, city, state, zip);
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName + '\n' + address.toString() + '\n' + email + '\n' + phoneNumber + '\n';
    }

    public String toCSVFormat() {
        return firstName + ',' + lastName + ',' + address.toCSVFormat() + ',' + email + ',' + phoneNumber + '\n';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
