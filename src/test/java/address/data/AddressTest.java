package address.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressTest {
    private Address address;
    @Before
    public void initialize() {
        address = new Address("Av. Universidad Veracruzana", "Coatzacoalcos", "Veracruz", "96400");
    }

    @Test
    public void testGetStreet() {
        assertEquals("Av. Universidad Veracruzana", address.getStreet());
    }

    @Test
    public void testSetStreet() {
        address.setStreet("Revolucion");
        assertEquals("Revolucion", address.getStreet());
    }

    @Test
    public void testGetCity() {
        assertEquals("Coatzacoalcos", address.getCity());
    }

    @Test
    public void testSetCity() {
        address.setCity("Minatitlan");
        assertEquals("Minatitlan", address.getCity());
    }

    @Test
    public void testGetState() {
        assertEquals("Veracruz", address.getState());
    }

    @Test
    public void testSetState() {
        address.setState("Tamaulipas");
        assertEquals("Tamaulipas", address.getState());
    }

    @Test
    public void testGetZipCode() {
        assertEquals("96400", address.getZipCode());
    }

    @Test
    public void testSetZipCode() {
        address.setZipCode("96480");
        assertEquals("96480", address.getZipCode());
    }
}
