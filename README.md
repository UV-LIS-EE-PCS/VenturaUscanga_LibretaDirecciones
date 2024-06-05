# AddressBookApplication
## Descripción
### Estado del sistema
El sistema se considera como funcional, ya que no se han detectado errores hasta la fecha.
### Lista de clases

#### AddressBookApplication
Esta clase se encarga del funcionamiento principal de la lista de contactos. Recibe la entrada de datos del usuario y la procesa, llamando los métodos adecuados de la clase AddressBook. Hace uso de una instancia de AddressBook para guardar los contactos guardados durante la ejecución del programa.
#### Menu
Se encarga de mostrar el menú de operaciones que puede realizar el usuario.
#### AddressBook
Contiene los métodos principales de la lista de contactos, tales como agregar, remover, buscar y listar los contactos. Para almacenar los contactos, se optó por utilizar un mapa ordenado, que almacena el nombre completo del contacto como llave, y una instancia de AddressEntry que contiene los datos de cada contacto. Como se trata de un mapa ordenado, dicha estructura guarda las llaves en orden alfabético, por lo que no se requiere de un método que ordene los contactos de la lista. Cada vez que un nuevo contacto es agregado, el mapa ordena automáticamente el contacto nuevo y los existentes. Bajo este sentido, para recuperar una dirección de la lista de contactos, es necesario conocer el nombre completo de cada uno de ellos.\
Tanto para agregar y remover contactos, se utilizan los métodos ya proporcionados por el mapa utilizado. Para buscar contactos, se hace uso de expresiones regulares para evaluar si el patrón de búsqueda coincide con algún contacto de la lista. Para listar los contactos, simplemente se recorre el mapa creado de la lista de contactos.

#### AddressEntry
Es la clase que se encarga de almacenar los datos básicos de cada contacto como su primer nombre, apellidos y dirección. Hace uso de la clase Address, para guardar los datos de la dirección de los contactos.
#### Address
Contiene los siguientes atributos: calle, ciudad, estado y código postal. Sirve para almacenar los datos de la dirección de los contactos.


## JavaDoc

## UML


## Capturas de pantalla del sistema
### Evidencia 1: Entradas de archivo
Desde la consola:<br>

Contenido del archivo<br>

<br>
### Evidencia 2: Agregar contacto<br>

<br>
### Evidencia 3: Eliminar contacto<br>

<br>
### Evidencia 4: Buscar contacto<br>

<br>
