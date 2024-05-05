## README del Proyecto "Gestión Empresarial SysteShot"

¡Bienvenido al proyecto de Gestión Empresarial SysteShot! Este README proporciona una descripción detallada de las características internas y externas del proyecto, incluyendo una visión general, instrucciones de configuración, detalles de implementación y mucho más. ¡Vamos a sumergirnos!

### Visión General

El proyecto "Gestión Empresarial SysteShot" es una aplicación web diseñada para ofrecer una solución integral para la gestión de producción, contabilidad, servicio al cliente y más de una empresa. La aplicación está desarrollada utilizando tecnologías web modernas, incluyendo Java Servlets, JSP, Spring Framework, y más.

### Características Principales

1. **Gestión de Producción**: Permite gestionar información sobre la producción de la empresa, incluyendo cantidad producida, productos producidos y descripción de la producción.

2. **Contabilidad**: Ofrece funcionalidades para llevar un registro preciso de las finanzas de la empresa.

3. **Servicio al Cliente**: Facilita la comunicación con los clientes, proporcionando información de contacto y otros enlaces relevantes.

4. **Dashboard**: Proporciona una interfaz principal del sistema donde los usuarios pueden acceder a las diferentes secciones del proyecto.

### Estructura del Proyecto

El proyecto se organiza en diferentes paquetes y clases para una mejor modularidad y mantenimiento:

#### Paquetes

1. **com.mycompany.evidencia.servlets**: Contiene los servlets que gestionan las solicitudes HTTP y las respuestas para las diferentes funcionalidades del sistema.
2. **Controladores**: Contiene las clases que actúan como controladores para interactuar con la base de datos y realizar operaciones relacionadas con clientes, contabilidad, pedidos, productos y usuarios.
3. **configuracion**: Contiene la configuración de la base de datos y la clase para establecer la conexión.
4. **Otros paquetes**: Existen otros paquetes que no se mencionan aquí, pero que contienen clases adicionales para diferentes funcionalidades del sistema.

#### Clases Principales

1. **SvCliente.java**: Servlet para gestionar las solicitudes relacionadas con los clientes, como registro, actualización y eliminación.
2. **SvContabilidad.java**: Servlet para gestionar las solicitudes relacionadas con la contabilidad, como registro de gastos.
3. **SvPedido.java**: Servlet para gestionar las solicitudes relacionadas con los pedidos, como registro y actualización.
4. **SvProducto.java**: Servlet para gestionar las solicitudes relacionadas con los productos, como registro y actualización.
5. **Usuario.java**: Clase para autenticar y gestionar usuarios en el sistema.

#### Configuración de la Base de Datos

La conexión a la base de datos MySQL está configurada en la clase `conexionDB.java` dentro del paquete `configuracion`. Se proporcionan credenciales de conexión y métodos para establecer y cerrar la conexión.

#### Filtrado de Solicitudes HTTP

Se utiliza un filtro llamado `LoggingFilter.java` para registrar mensajes antes y después de que se ejecuten los servlets, proporcionando un mecanismo de registro para el sistema.

### Requisitos

- Java Development Kit (JDK)
- Apache Tomcat o algún otro contenedor web compatible con Java EE
- MySQL Database

### Instalación y Configuración

Para configurar y ejecutar el proyecto en tu entorno local, sigue estos pasos:

1. Clonar el Repositorio: Clona este repositorio en tu máquina local utilizando el siguiente comando:

git clone https://github.com/Brick1223/Proyecto.git

2. Importar en el IDE: Importa el proyecto en tu IDE preferido.

3. Configurar la Base de Datos: Asegúrate de tener una base de datos MySQL instalada y configurada. Utiliza el script de creación de tablas proporcionado en la carpeta sql para crear las tablas necesarias en tu base de datos.

4. Configurar la Conexión a la Base de Datos: En el archivo application.properties dentro de la carpeta resources, configura la conexión a tu base de datos MySQL.

5. Ejecutar el Proyecto: Ejecuta la aplicación desde tu IDE. La aplicación estará disponible en http://localhost:8080.

### Uso

Una vez desplegado en el servidor, acceder a la aplicación a través del navegador web. Se proporcionan diferentes URL para acceder a las funcionalidades proporcionadas por los servlets.

### Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir al proyecto, puedes hacer un fork del repositorio, realizar tus cambios y enviar un pull request.

### Problemas y Sugerencias

Si encuentras algún problema o tienes alguna sugerencia para mejorar el proyecto, no dudes en abrir un issue en el repositorio. Estare encantado de ayudarte.

### Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para obtener más información.

---

¡Gracias por tu interés en el proyecto "Gestión Empresarial SysteShot"! Esperamos que esta guía te haya proporcionado toda la información que necesitas para comenzar. Si tienes alguna pregunta, no dudes en ponerte en contacto con nosotros. ¡Feliz codificación!

