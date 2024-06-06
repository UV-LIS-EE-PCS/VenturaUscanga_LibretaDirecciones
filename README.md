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
https://htmlpreview.github.io/?https://github.com/julianvent/VenturaUscanga_LibretaDirecciones/blob/main/target/site/apidocs/index.html
## UML
![image](https://github.com/julianvent/VenturaUscanga_LibretaDirecciones/assets/127433986/c441de95-3b84-47f4-a1d2-0c9cac79acdd)
<br>

## Capturas de pantalla del sistema
### Evidencia 1: Entradas de archivo
Desde la consola:<br>
![image](https://github.com/julianvent/VenturaUscanga_LibretaDirecciones/assets/127433986/66b9d328-0e28-49f2-9d51-d25f7badc676)
<br>
Contenido del archivo<br>
![image](https://github.com/julianvent/VenturaUscanga_LibretaDirecciones/assets/127433986/e71a1055-ea5d-4e31-851b-5b09d4ccc6c7)<br>
<br>
### Evidencia 2: Agregar contacto<br>
![image](https://github.com/julianvent/VenturaUscanga_LibretaDirecciones/assets/127433986/457108a7-051a-4f5d-a568-77cf3367c049)<br>
<br>
### Evidencia 3: Eliminar contacto<br>
![image](https://github.com/julianvent/VenturaUscanga_LibretaDirecciones/assets/127433986/eacc2b20-554f-4ad4-b773-c5aa9d2c790d)<br>
![image](https://github.com/julianvent/VenturaUscanga_LibretaDirecciones/assets/127433986/75574985-a5a7-48cc-bd42-e55acacec824)<br>
<br>
### Evidencia 4: Buscar contacto<br>
![image](https://github.com/julianvent/VenturaUscanga_LibretaDirecciones/assets/127433986/e8e26c62-b195-4bf6-ba29-84d9d998566b)<br>
<br>
