package address.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressEntryTest {
    private AddressEntry entry;

    @Before
    public void initialize() {
        entry = new AddressEntry("Julian","Ventura","Calle","Ciudad","Estado","12345","julian@gmail.com","123453215");
    }


    @Test
    public void testGetFirstName() {
        assertEquals("Julian", entry.getFirstName());
    }

    @Test
    public void testSetFirstName() {
        entry.setFirstName("Jose");
        assertEquals("Jose", entry.getFirstName());
    }

    @Test
    public void testGetLastName() {
        assertEquals("Ventura", entry.getLastName());
    }

    @Test
    public void testSetLastName() {
        entry.setLastName("Uscanga");
        assertEquals("Uscanga", entry.getLastName());
    }

    @Test
    public void testGetAddress() {
        assertEquals("Calle", entry.getAddress().getStreet());
        assertEquals("Ciudad", entry.getAddress().getCity());
        assertEquals("Estado", entry.getAddress().getState());
        assertEquals("12345", entry.getAddress().getZipCode());
    }

    @Test
    public void testSetAddress() {
        entry.setAddress(new Address("Argentina", "Coatzacoalcos", "Veracruz", "96480"));
        assertEquals("Argentina", entry.getAddress().getStreet());
        assertEquals("Coatzacoalcos", entry.getAddress().getCity());
        assertEquals("Veracruz", entry.getAddress().getState());
        assertEquals("96480", entry.getAddress().getZipCode());
    }

    @Test
    public void testGetEmail() {
        assertEquals("julian@gmail.com", entry.getEmail());
    }

    @Test
    public void testSetEmail() {
        entry.setEmail("jose@gmail.com");
        assertEquals("jose@gmail.com", entry.getEmail());
    }

    @Test
    public void testGetPhoneNumber() {
        assertEquals("123453215", entry.getPhoneNumber());
    }

    @Test
    public void testSetPhoneNumber() {
        entry.setPhoneNumber("9213024843");
        assertEquals("9213024843", entry.getPhoneNumber());
    }
}
