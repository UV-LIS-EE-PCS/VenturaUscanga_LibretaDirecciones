package address;

import address.data.Address;

/**
 * Class used to display the menu.
 * @author Julian Ventura
 */
public class Menu {
    /**
     * Displays the main menu containing the basic operations of the address book.
     */
    public static void displayMenu() {
        System.out.println("===========================");
        System.out.println("Elige una opción del menú");
        System.out.println("a) Cargar desde archivo");
        System.out.println("b) Agregar");
        System.out.println("c) Eliminar");
        System.out.println("d) Buscar");
        System.out.println("e) Mostrar");
        System.out.println("f) Guardar y salir");
        System.out.println("===========================");
    }
}
