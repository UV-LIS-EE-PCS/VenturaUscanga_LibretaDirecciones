package address.data;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class AddressBookTest {
    private AddressEntry addressEntry;
    private final AddressBook addressBook = new AddressBook();
    private final AddressBook addressBook2 = new AddressBook();
    
    @Before
    public void initialize() {
        addressEntry = new AddressEntry("Julian", "Uscanga", "J", "J", "J", "12345", "j@gmail.com", "1234567890");
    }

    @Test
    public void testSearchSucceed() {
        addressBook.add(addressEntry);
        ArrayList<String> names = addressBook.search("Usc");
        assertTrue(names.contains(addressEntry.getLastName() + ',' + addressEntry.getFirstName()));
    }

    @Test
    public void testSearchFails() {
        addressBook.add(addressEntry);
        ArrayList<String> names = addressBook.search("Vent");
        assertFalse(names.contains(addressEntry.getLastName()));
    }

    @Test
    public void testRemoveSucceed() {
        addressBook.add(addressEntry);
        addressBook.remove(addressEntry.getLastName() + ',' + addressEntry.getFirstName());
        assertTrue(addressBook.isEmpty());
    }

    @Test
    public void testRemoveFails() {
        addressBook.add(addressEntry);
        addressBook.remove("apellido,nombre");
        assertFalse(addressBook.isEmpty());
    }

    @Test
    public void testAdd() {
        addressBook.add(addressEntry);
        assertFalse(addressBook.isEmpty());
    }


    @Test
    public void testAddFromFile() {
        addressBook.addFromFile("addresses.txt");
        assertFalse(addressBook.isEmpty());
    }

    @Test
    public void testSaveEntriesToFile() {
        addressBook.addFromFile("addresses.txt");
        addressBook.saveEntriesToFile("input_addresses.txt");
        addressBook2.addFromFile("input_addresses.txt");
        assertFalse(addressBook2.isEmpty());
    }
}
