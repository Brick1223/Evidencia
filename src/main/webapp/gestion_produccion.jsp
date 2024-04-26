
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestión de Producción - Sitio Web de Gestión</title>
    <link rel="stylesheet" type="text/css" href="css/gestion_produccion.css">
</head>
<body>
    <header>
    <img src="logotipo.png" alt="Logotipo de la empresa"> 
    <h1>Gestión de Producción</h1>
</header>

<nav>
    
</nav>

<section id="contenido">
    <h2>Información de Producción:</h2>
    
    <form action="SvProduccion" method="POST">
        <div class="production-info">
            <div class="table-container">
                <div class="table-header">
                    <h3>Cantidad Producida:</h3>
                </div>
                <div class="table-row">
                    <div class="table-cell"><input type="text" name="cantidad_producida" value="100,000 unidades"></div>
                    <div class="table-cell"><input type="text" name="cantidad_producida2" value="10,000 unidades"></div>
                    <div class="table-cell"><input type="text" name="cantidad_producida3" value="200,000 unidades"></div>
                </div>
            </div>
        </div>

        <div class="production-info">
            <div class="table-container">
                <div class="table-header">
                    <h3>Productos Producidos:</h3>
                </div>
                <div class="table-row">
                    <div class="table-cell"><input type="text" name="producto1" value="Producto 1"></div>
                    <div class="table-cell"><input type="text" name="producto2" value="Producto 2"></div>
                    <div class="table-cell"><input type="text" name="producto3" value="Producto 3"></div>
                </div>
            </div>
        </div>

        <div class="production-info">
            <div class="table-container">
                <div class="table-header">
                    <h3>Descripción de la Producción:</h3>
                </div>
                <div class="table-row">
                    <div class="table-cell"><textarea name="descripcion_produccion" rows="4">Aquí se proporcionará una descripción detallada de la producción de alimentos y bebidas de la empresa.</textarea></div>
                    <div class="table-cell"><textarea name="descripcion_produccion2" rows="4">Aquí se proporcionará una descripción detallada de la producción de alimentos y bebidas de la empresa.</textarea></div>
                    <div class="table-cell"><textarea name="descripcion_produccion3" rows="4">Aquí se proporcionará una descripción detallada de la producción de alimentos y bebidas de la empresa.</textarea></div>
                </div>
            </div>
        </div>

        <div class="production-info">
            <input type="submit" value="Guardar Cambios">
        </div>
    </form>

    <div class="production-info">
        <a href="dashboard.jsp" style="text-decoration: none;">
            <input type="button" class="return-button" value="REGRESAR">
        </a>
    </div>
</section>

<footer>
    
</footer>


    <script src=" "></script>
</body>
</html>
