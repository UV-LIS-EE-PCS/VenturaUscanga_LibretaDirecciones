package address;

import address.data.AddressEntry;
import org.junit.Before;

public class AddressBookApplicationTest {
    private AddressEntry addressEntry;

    @Before
    public void initialize() {
        addressEntry = new AddressEntry("Julian", "Uscanga", "J", "J", "J", "12345", "j@gmail.com", "1234567890");
    }
}
