
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Configuración del documento -->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Título de la página y enlace al archivo CSS -->
    <title>Olvidé la Contraseña - Sitio Web de Gestión</title>
    <link rel="stylesheet" type="text/css" href="css/olvide_contraseña.css">
</head>
<body>
    <!-- Encabezado de la página -->
    <header>
        <!-- Logotipo de la empresa -->
        <img src="img/logotipo.png" alt="Logotipo de la empresa"> 
        <!-- Título de la sección "Olvidé la Contraseña" -->
        <h1>Olvidé la Contraseña</h1>
    </header>

    <!-- Contenido principal -->
    <section id="contenido">
        <!-- Formulario para restablecer la contraseña -->
        <form action="SvContraseña" method="POST">
            <!-- Etiqueta y campo para ingresar el correo electrónico -->
            <label for="correo">Correo Electrónico:</label>
            <input type="text" id="correo" name="correo" required>

            <!-- Botón para restablecer la contraseña -->
            <input type="submit" value="Restablecer Contraseña">
        </form>

        <!-- Enlace para regresar al dashboard -->
        <div>
            <a href="dashboard.jsp" class="return-button">Regresar</a>
        </div>
    </section>

    <!-- Script de JavaScript (por completar) -->
    <script src=" "></script>
</body>
</html>

