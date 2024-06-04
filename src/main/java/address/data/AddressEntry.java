package address.data;

/**
 * Class to create address entries.
 * @author Julian Ventura
 */
public class AddressEntry {
    /**
     * Contact's first name.
     */
    private String firstName;
    /**
     * Contact's last name.
     */
    private String lastName;
    /**
     * Contact's address.
     */
    private Address address;
    /**
     * Contact's email.
     */
    private String email;
    /**
     * Contact's phone number.
     */
    private String phoneNumber;

    /**
     * An empty constructor to create an address entry.
     */
    public AddressEntry() {
    }

    /**
     * Creates an address entry using each variable.
     * @param firstName Contact's first name.
     * @param lastName Contact's last name.
     * @param street Contact's street.
     * @param city Contact's city.
     * @param state Contact's state.
     * @param zip Contact's zip code.
     * @param email Contact's email.
     * @param phoneNumber Contact's phone number.
     */
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


    /**
     * Used to get a CSV format of the data contained in the address entry.
     * @return a string in CSV format containing the data of the address entry.
     */
    public String toCSVFormat() {
        return firstName + ',' + lastName + ',' + address.toCSVFormat() + ',' + email + ',' + phoneNumber + '\n';
    }


    /**
     * Used to get an address entry's first name.
     * @return the first name of an address entry.
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     * Used to change an address entry's first name.
     * @param firstName new first name of the address entry.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /**
     * Used to get an address entry's last name.
     * @return the last name of the address entry.
     */
    public String getLastName() {
        return lastName;
    }


    /**
     * Used to change the address entry's last name.
     * @param lastName the new last name of the address entry.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * Used to get the address entry's address.
     * @return the address of the address entry.
     */
    public Address getAddress() {
        return address;
    }


    /**
     * Used to change the address entry's address.
     * @param address the new address for the address entry.
     */
    public void setAddress(Address address) {
        this.address = address;
    }


    /**
     * Used to get address entry's email
     * @return the address entry's email
     */
    public String getEmail() {
        return email;
    }


    /**
     * Used to change the address entry's email.
     * @param email new email for the address entry.
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Used to get the address entry's phone number.
     * @return the address entry's phone number.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Used to change the address entry's phone number.
     * @param phoneNumber new phone number for the address entry.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
