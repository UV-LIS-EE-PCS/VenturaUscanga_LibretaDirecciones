package address.data;

import java.io.*;
import java.util.*;

/**
 * Class used to create a new address book and contains its essential operations.
 * @author Julian Ventura
 */
public class AddressBook {
    /**
     * Constant sorted map used for storing the addresses as values and the person's full name
     * as key. The sorted map implementation allows the data to be stored in alphabetical order.
     */
    private final SortedMap<String, AddressEntry> ADDRESS_BY_NAME;
    /**
     * Constant string variable used to store the relative path of the project's resources.
     */
    private final String FILE_RESOURCE_PATH = "src/main/resources/";


    /**
     * Empty constructor.
     */
    public AddressBook() {
        ADDRESS_BY_NAME = new TreeMap<>();
    }


    /**
     * Adds an address entry into the map if it's absent.
     * @param addressEntry entry wished to be added.
     */
    public void add(AddressEntry addressEntry) {
        String fullName = addressEntry.getLastName() + ',' + addressEntry.getFirstName();
        ADDRESS_BY_NAME.putIfAbsent(fullName, addressEntry);
    }


    /**
     * Removes an address entry from the map.
     * @param fullName key used to remove the element from the map.
     */
    public void remove(String fullName) {
        ADDRESS_BY_NAME.remove(fullName);
    }


    /**
     * Lists all the entries of the address book
     */
    public void list() {
        int index = 1;
        for (AddressEntry addressEntry : ADDRESS_BY_NAME.values()) {
            System.out.println(index + ": " + addressEntry);
            index++;
        }
    }


    /**
     * Get all the matching names (keys) given a target last name.
     * @param targetLastName the last name wished to be searched.
     * @return a list of matching names.
     */
    public ArrayList<String> search(String targetLastName) {
        ArrayList<String> matchingNames = new ArrayList<>();

        for (String currentFullName : ADDRESS_BY_NAME.keySet()) {
            String currentLastName = currentFullName.substring(0, currentFullName.lastIndexOf(','));

            if (addressMatchesLastName(currentLastName, targetLastName))
                matchingNames.add(currentFullName);

        }

        return matchingNames;
    }


    /**
     * Checks if a last name matches other last name.
     * @param currentLastName the last name wished to be compared.
     * @param targetLastName the last name used for comparing.
     * @return true if the current last name matches the target.
     */
    private boolean addressMatchesLastName(String currentLastName, String targetLastName) {
        return currentLastName.matches("^" + targetLastName + ".*");
    }


    /**
     * Adds address entries from a file.
     * @param fileName the name of the file containing the address entries.
     */
    public void addFromFile(String fileName) {
        File file = new File(FILE_RESOURCE_PATH + fileName);

        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                AddressEntry entry = getAddressEntryFromLine(line);

                if (entry != null)
                    add(entry);
            }
        } catch (FileNotFoundException fnfe) {
            System.err.print("No se encontró el archivo:" + fnfe.getMessage());
        }

    }


    /**
     * Get the data contained in a line of the file containing the address entries.
     * @param line the line to be read.
     * @return an address entry.
     */
    public AddressEntry getAddressEntryFromLine(String line) {
        try (Scanner data = new Scanner(line).useDelimiter(",")) {
            String firstName = data.next();
            String lastName = data.next();
            String street = data.next();
            String city = data.next();
            String state = data.next();
            String zipCode = data.next();
            String email = data.next();
            String phoneNumber = data.next();

            return new AddressEntry(firstName, lastName, street, city, state, zipCode, email, phoneNumber);
        } catch (NoSuchElementException nsee) {
            System.err.println("Número de campos insuficientes en la línea " + line);
            return null;
        }
    }


    /**
     * Generates a .txt file with the current address entries stored in the address book.
     * @param fileName the name of the file where the address entries are going to be written.
     */
    public void saveEntriesToFile(String fileName) {
        try (FileWriter fileWriter = new FileWriter(FILE_RESOURCE_PATH + fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            for (AddressEntry addressEntry : ADDRESS_BY_NAME.values()) {
                bufferedWriter.write(addressEntry.toCSVFormat());
            }
        } catch (IOException ioe) {
            System.err.println("Error al escribir el archivo:" + ioe.getMessage());
        }

    }


    /**
     * Checks if the address book is empty.
     * @return true if it is empty.
     */
    public boolean isEmpty() {
        return ADDRESS_BY_NAME.isEmpty();
    }


    /**
     * Retrieves the address entry (value) given a full name (key).
     * @param fullName the key to retrieve the address entry.
     * @return the address entry of the key.
     */
    public AddressEntry getAddress(String fullName) {
        return ADDRESS_BY_NAME.get(fullName);
    }
}
