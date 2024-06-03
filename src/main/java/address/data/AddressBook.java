package address.data;

import java.io.*;
import java.util.*;

/**
 * Class used to create a new address book and contains its essential operations.
 * @author Julian Ventura
 */
public class AddressBook {
    private final SortedMap<String, AddressEntry> ADDRESS_BY_NAME;
    private static final String FILE_RESOURCE_PATH = "src/main/resources/";


    public AddressBook() {
        ADDRESS_BY_NAME = new TreeMap<>();
    }

    public void add(AddressEntry addressEntry) {
        String fullName = addressEntry.getLastName() + ',' + addressEntry.getFirstName();
        ADDRESS_BY_NAME.putIfAbsent(fullName, addressEntry);
    }


    public void remove(String fullName) {
        ADDRESS_BY_NAME.remove(fullName);
    }


    public void list() {
        int index = 1;
        for (AddressEntry addressEntry : ADDRESS_BY_NAME.values()) {
            System.out.println(index + ": " + addressEntry);
            index++;
        }
    }


    public ArrayList<String> search(String targetLastName) {
        ArrayList<String> matchingNames = new ArrayList<>();

        for (String currentFullName : ADDRESS_BY_NAME.keySet()) {
            String currentLastName = currentFullName.substring(0, currentFullName.lastIndexOf(','));

            if (addressMatchesLastName(currentLastName, targetLastName))
                matchingNames.add(currentFullName);

        }

        return matchingNames;
    }


    private boolean addressMatchesLastName(String currentLastName, String targetLastName) {
        return currentLastName.matches("^" + targetLastName + ".*");
    }


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


    public boolean isEmpty() {
        return ADDRESS_BY_NAME.isEmpty();
    }


    public AddressEntry getAddress(String fullName) {
        return ADDRESS_BY_NAME.get(fullName);
    }
}
