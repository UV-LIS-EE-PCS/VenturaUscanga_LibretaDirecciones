package address;

import java.util.ArrayList;

import address.data.AddressBook;
import address.data.AddressEntry;

import java.util.Scanner;

/**
 * Class used to run the application, manage input by the user and call
 * the right methods of the implemented classes.
 * @author Julian Ventura
 */
public class AddressBookApplication {
    /**
     * Address book instantiation for storing address entries.
     */
    public static AddressBook addressBook = new AddressBook();
    /**
     * Scanner instantiation for capturing user input in console.
     */
    private static final Scanner INPUT = new Scanner(System.in);


    /**
     * Used to add an address entry into the address book.
     */
    public static void addAddressEntry() {
        AddressEntry addressEntry = promptAddressEntry();
        addressBook.add(addressEntry);
    }


    /**
     * Displays and gets the requested user input for creating a new address entry input by the user.
     * @return an address entry created by the user.
     */
    public static AddressEntry promptAddressEntry() {
        String firstName = prompt("Nombre:");
        String lastName = prompt("Apellido:");
        String street = prompt("Calle:");
        String city = prompt("Ciudad:");
        String state = prompt("Estado:");
        String zipCode = prompt("Código postal: ");

        while (!zipCode.matches("\\d{5}")) {
            zipCode = prompt("Ingresa un CP válido:");
        }

        String email = prompt("Email:");


        String phoneNumber = prompt("Telefono:");

        while (!phoneNumber.matches("\\d{10}")) {
            phoneNumber = prompt("Ingresa un número válido:");
        }

        return new AddressEntry(firstName, lastName, street, city, state, zipCode, email, phoneNumber);
    }


    /**
     * Used to prompt the user to input a string.
     * @param message the message wished to be prompt in console.
     * @return the string input by the user.
     */
    private static String prompt(String message) {
        System.out.println(message);
        return INPUT.nextLine().trim();
    }


    /**
     * Displays and gets the requested user input for removing an address entry
     * and uses the remove method from the AddressBook class.
     */
    public static void removeAddressEntry() {
        if (addressBook.isEmpty())
            System.out.println("La libreta de direcciones está vacía");
        else {
            String lastNameToRemove = prompt("Ingrese el apellido completo o las primeras letras del contacto a eliminar: ");

            ArrayList<String> namesToRemove = addressBook.search(lastNameToRemove);

            for (String name : namesToRemove) {
                System.out.println("\nEl siguiente contacto fue encontrado:");
                System.out.println(addressBook.getAddress(name));
                System.out.print("¿Eliminar contacto? ");

                if (promptConfirmation()) {
                    addressBook.remove(name);
                    System.out.println("Contacto eliminado exitosamente");
                }
            }

        }
    }


    /**
     * Displays and gets the requested user input for searching an address entry
     * in the address book using the search method implemented in AddressBook. Then
     * shows the matching addresses.
     */
    public static void searchForAddressEntry() {
        if (addressBook.isEmpty())
            System.out.println("La libreta de contactos está vacía.");
        else {
            String targetLastName = prompt("Ingrese el apellido completo o las primeras letras de los contactos a buscar:");

            ArrayList<String> matchingNames = addressBook.search(targetLastName);

            if (matchingNames.isEmpty()) {
                System.out.println("No se encontraron apellidos coincidentes.");
            } else {
                System.out.println("\nSe encontraron " + matchingNames.size() + " contactos.");

                int index = 1;
                for (String name : matchingNames) {
                    System.out.println(index + ": " + addressBook.getAddress(name));
                    index++;
                }
            }
        }
    }


    /**
     * Displays a prompt confirmation (yes or no) and reads the input by the user.
     * @return true if the input equals "y".
     */
    private static boolean promptConfirmation() {
        String decision;

        do {
            decision = prompt("(y/n)").toLowerCase();

            if (!(decision.equals("y") || decision.equals("n"))) {
                System.out.print("Entrada inválida.");
            }

        } while ( !(decision.equals("y") || decision.equals("n")) );

        return decision.equals("y");
    }


    /**
     * Gets the name of the file and calls the method addFromFile
     * from AddressBook.
     */
    public static void addEntriesFromFile() {
        String fileName = prompt("Ingrese el nombre del archivo: ");
        addressBook.addFromFile(fileName);
    }


    /**
     * Main method for the execution of the application.
     * @param args optional arguments
     */
    public static void main(String[] args) {
        Menu.displayMenu();

        String option = INPUT.nextLine();
        while (true) {
            System.out.println();

            switch (option) {
                case "a":
                    addEntriesFromFile();
                    break;
                case "b":
                    addAddressEntry();
                    break;
                case "c":
                    removeAddressEntry();
                    break;
                case "d":
                    searchForAddressEntry();
                    break;
                case "e":
                    if (addressBook.isEmpty())
                        System.out.println("La libreta de direcciones está vacía.");
                    else
                        addressBook.list();
                    break;
                case "f":
                    addressBook.saveEntriesToFile("input_addresses.txt");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
            System.out.println();
            Menu.displayMenu();
            option = INPUT.nextLine();
        }
    }
}
