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
https://htmlpreview.github.io/?https://github.com/julianvent/Ventura_LibretaDirecciones/blob/main/javadoc/index.html
## UML
![image](https://github.com/julianvent/Ventura_LibretaDirecciones/assets/127433986/1263d70a-2e4a-4960-b8cf-a09cc9bacfae)
<br>

## Capturas de pantalla del sistema
### Evidencia 1: Entradas de archivo
Desde la consola:<br>
![image](https://github.com/julianvent/Ventura_LibretaDirecciones/assets/127433986/4df3fb63-3212-404e-b41c-3670743f4073)
<br>
Contenido del archivo<br>
![image](https://github.com/julianvent/Ventura_LibretaDirecciones/assets/127433986/1a4b6e7b-001b-47dc-8c50-0f98e4cbb53b)<br>
<br>
### Evidencia 2: Agregar contacto<br>
![image](https://github.com/julianvent/Ventura_LibretaDirecciones/assets/127433986/1e6c8886-30a4-47ee-9170-4fba4318dec8)<br>
<br>
### Evidencia 3: Eliminar contacto<br>
![image](https://github.com/julianvent/Ventura_LibretaDirecciones/assets/127433986/1da90f4d-3ec2-4a87-b8e7-d2a563b0d952)<br>
![image](https://github.com/julianvent/Ventura_LibretaDirecciones/assets/127433986/4060616a-e8a9-455f-b558-08f69f82baae)<br>
<br>
### Evidencia 4: Buscar contacto<br>
![image](https://github.com/julianvent/Ventura_LibretaDirecciones/assets/127433986/bda5a9ac-3cec-4968-9034-69ebe581480b)<br>
<br>
