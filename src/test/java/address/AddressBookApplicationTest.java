package address;

import address.data.AddressEntry;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import static address.AddressBookApplication.addressBook;

public class AddressBookApplicationTest {
    private AddressEntry addressEntry;

    @Before
    public void initialize() {
        addressEntry = new AddressEntry("Julian", "Uscanga", "J", "J", "J", "12345", "j@gmail.com", "1234567890");
    }
}
