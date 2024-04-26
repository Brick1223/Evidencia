# Proyecto de Gestión Empresarial

Este proyecto de Gestión Empresarial es una aplicación web desarrollada en Java utilizando el framework Java EE (Enterprise Edition). Proporciona funcionalidades para gestionar clientes, contabilidad, pedidos, productos y usuarios.

## Estructura del Proyecto

El proyecto se organiza en diferentes paquetes y clases para una mejor modularidad y mantenimiento:

### Paquetes

1. **com.mycompany.evidencia.servlets**: Contiene los servlets que gestionan las solicitudes HTTP y las respuestas para las diferentes funcionalidades del sistema.
2. **Controladores**: Contiene las clases que actúan como controladores para interactuar con la base de datos y realizar operaciones relacionadas con clientes, contabilidad, pedidos, productos y usuarios.
3. **configuracion**: Contiene la configuración de la base de datos y la clase para establecer la conexión.
4. Otros paquetes: Existen otros paquetes que no se mencionan aquí, pero que contienen clases adicionales para diferentes funcionalidades del sistema.

### Clases Principales

1. **SvCliente.java**: Servlet para gestionar las solicitudes relacionadas con los clientes, como registro, actualización y eliminación.
2. **SvContabilidad.java**: Servlet para gestionar las solicitudes relacionadas con la contabilidad, como registro de gastos.
3. **SvPedido.java**: Servlet para gestionar las solicitudes relacionadas con los pedidos, como registro y actualización.
4. **SvProducto.java**: Servlet para gestionar las solicitudes relacionadas con los productos, como registro y actualización.
5. **Usuario.java**: Clase para autenticar y gestionar usuarios en el sistema.

### Configuración de la Base de Datos

La conexión a la base de datos MySQL está configurada en la clase `conexionDB.java` dentro del paquete `configuracion`. Se proporcionan credenciales de conexión y métodos para establecer y cerrar la conexión.

### Filtrado de Solicitudes HTTP

Se utiliza un filtro llamado `LoggingFilter.java` para registrar mensajes antes y después de que se ejecuten los servlets, proporcionando un mecanismo de registro para el sistema.

### Nomenclatura y Funcionalidades

- **Nomenclatura de Variables, Métodos y Clases**: Se ha seguido una nomenclatura descriptiva y coherente en todas las clases y métodos.
- **Funcionalidades**: El proyecto proporciona funcionalidades básicas de inserción, consulta, actualización y eliminación para clientes, contabilidad, pedidos, productos y usuarios.

## Requisitos

- Java Development Kit (JDK)
- Apache Tomcat o algún otro contenedor web compatible con Java EE
- MySQL Database

## Instalación y Configuración

1. Clonar o descargar el proyecto desde el repositorio.
2. Configurar la base de datos MySQL con el script proporcionado.
3. Configurar las credenciales de la base de datos en `conexionDB.java`.
4. Desplegar el proyecto en el servidor web.

## Uso

Una vez desplegado en el servidor, acceder a la aplicación a través del navegador web. Se proporcionan diferentes URL para acceder a las funcionalidades proporcionadas por los servlets.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir al proyecto, puedes hacer un fork del repositorio, realizar tus cambios y enviar un pull request.

## Licencia

Este proyecto está bajo la Licencia [MIT](LICENSE).

