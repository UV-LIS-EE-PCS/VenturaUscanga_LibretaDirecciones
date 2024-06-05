package address.data;


/**
 * Class used to create an address
 * @author Julian Ventura
 */
public class Address {
    /**
     * Street of the address
     */
    private String street;
    /**
     * City of the address
     */
    private String city;
    /**
     * State of the address
     */
    private String state;
    /**
     * Zip code of the address
     */
    private String zipCode;


    /**
     * Creates a new address
     * @param street Name of the street
     * @param city Name of the city
     * @param state Name of the state
     * @param zipCode Zip code
     */
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    @Override
    public String toString() {
        String abbreviatedState = state;

        if (abbreviatedState.length() >= 3)
            abbreviatedState = abbreviatedState.substring(0, 3) + '.';

        return street + '\n' + city + ", " + abbreviatedState + " " + zipCode;
    }


    /**
     * Used to get a CSV format of the data contained in the address.
     * @return a string in CSV format containing the data of the address.
     */
    protected String toCSVFormat() {
        return street + ',' + city + "," + state + "," + zipCode;
    }


    /**
     * Used to get the street of an address.
     * @return the street's name.
     */
    public String getStreet() {
        return street;
    }


    /**
     * Used to change the street of an address.
     * @param street name of the new street.
     */
    public void setStreet(String street) {
        this.street = street;
    }


    /**
     * Used to get the city of an address.
     * @return the city's name.
     */
    public String getCity() {
        return city;
    }


    /**
     * Used to change the city of an address.
     * @param city name of the new city.
     */
    public void setCity(String city) {
        this.city = city;
    }


    /**
     * Used to get the state of an address.
     * @return the state's name.
     */
    public String getState() {
        return state;
    }


    /**
     * Used to change the state of an address.
     * @param state name of the new state.
     */
    public void setState(String state) {
        this.state = state;
    }


    /**
     * Used to get the zip of an address
     * @return the zip's code
     */
    public String getZipCode() {
        return zipCode;
    }


    /**
     * Used to change the zip of an address.
     * @param zipCode code of the new zip.
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
