
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Codificación de caracteres y declaración de documento -->
    <meta charset="UTF-8">
    <!-- Compatibilidad con Internet Explorer -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Configuración de la vista para dispositivos móviles -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Título de la página -->
    <title>Gestión de Producción - Sitio Web de Gestión</title>
    <!-- Enlace al archivo CSS de estilos de gestión de producción -->
    <link rel="stylesheet" type="text/css" href="css/gestion_produccion.css">
</head>
<body>
    <!-- Encabezado de la página -->
    <header>
        <!-- Logotipo de la empresa -->
        <img src="img/logotipo.png" alt="Logotipo de la empresa"> 
        <!-- Título de la sección de gestión de producción -->
        <h1>Gestión de Producción</h1>
    </header>

    <!-- Barra de navegación (por completar) -->
    <nav>
        
    </nav>

    <!-- Contenido principal -->
    <section id="contenido">
        <!-- Título de la sección de información de producción -->
        <h2>Información de Producción:</h2>
        
        <!-- Formulario de información de producción -->
        <form action="SvProduccion" method="POST">
            <!-- Contenedor de información de producción -->
            <div class="production-info">
                <!-- Contenedor de tabla para cantidad producida -->
                <div class="table-container">
                    <!-- Encabezado de la tabla -->
                    <div class="table-header">
                        <!-- Título de la cantidad producida -->
                        <h3>Cantidad Producida:</h3>
                    </div>
                    <!-- Fila de la tabla -->
                    <div class="table-row">
                        <!-- Celdas para ingresar la cantidad producida -->
                        <div class="table-cell"><input type="text" name="cantidad_producida" value="100,000 unidades"></div>
                        <!-- Comentario: Segunda celda para ingresar la cantidad producida -->
                        <div class="table-cell"><input type="text" name="cantidad_producida2" value="10,000 unidades"></div>
                        <!-- Comentario: Tercera celda para ingresar la cantidad producida -->
                        <div class="table-cell"><input type="text" name="cantidad_producida3" value="200,000 unidades"></div>
                    </div>
                </div>
            </div>

            <!-- Contenedor de información de productos producidos (por completar) -->
            <div class="production-info">
                <!-- Contenedor de tabla para productos producidos -->
                <div class="table-container">
                    <!-- Encabezado de la tabla -->
                    <div class="table-header">
                        <!-- Título de los productos producidos -->
                        <h3>Productos Producidos:</h3>
                    </div>
                    <!-- Fila de la tabla -->
                    <div class="table-row">
                        <!-- Celdas para ingresar los productos producidos -->
                        <div class="table-cell"><input type="text" name="producto1" value="Producto 1"></div>
                        <div class="table-cell"><input type="text" name="producto2" value="Producto 2"></div>
                        <div class="table-cell"><input type="text" name="producto3" value="Producto 3"></div>
                    </div>
                </div>
            </div>

            <!-- Contenedor de información de descripción de producción (por completar) -->
            <div class="production-info">
                <!-- Contenedor de tabla para descripción de producción -->
                <div class="table-container">
                    <!-- Encabezado de la tabla -->
                    <div class="table-header">
                        <!-- Título de la descripción de producción -->
                        <h3>Descripción de la Producción:</h3>
                    </div>
                    <!-- Fila de la tabla -->
                    <div class="table-row">
                        <!-- Celdas para ingresar la descripción de producción -->
                        <div class="table-cell"><textarea name="descripcion_produccion" rows="4">Aquí se proporcionará una descripción detallada de la producción de alimentos y bebidas de la empresa.</textarea></div>
                        <div class="table-cell"><textarea name="descripcion_produccion2" rows="4">Aquí se proporcionará una descripción detallada de la producción de alimentos y bebidas de la empresa.</textarea></div>
                        <div class="table-cell"><textarea name="descripcion_produccion3" rows="4">Aquí se proporcionará una descripción detallada de la producción de alimentos y bebidas de la empresa.</textarea></div>
                    </div>
                </div>
            </div>

            <!-- Contenedor de botón de envío del formulario -->
            <div class="production-info">
                <!-- Botón para enviar el formulario -->
                <input type="submit" value="Guardar Cambios">
            </div>
        </form>

        <!-- Contenedor de botón de regreso al dashboard -->
        <div class="production-info">
            <!-- Enlace para regresar al dashboard -->
            <a href="dashboard.jsp" style="text-decoration: none;">
                <!-- Botón para regresar al dashboard -->
                <input type="button" class="return-button" value="REGRESAR">
            </a>
        </div>
    </section>

    <!-- Pie de página (por completar) -->
    <footer>
        
    </footer>


    <!-- Script de JavaScript (por completar) -->
    <script src=" "></script>
</body>
</html>
