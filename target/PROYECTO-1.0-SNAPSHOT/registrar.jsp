
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Configuración del documento -->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Título de la página y enlace al archivo CSS -->
    <title>Registro - Sitio Web de Gestión</title>
    <link rel="stylesheet" type="text/css" href="css/registro_styles.css">
</head>
<body>
    <!-- Encabezado de la página -->
    <header>
        <!-- Logotipo de la empresa -->
        <img src="img/logotipo.png" alt="Logotipo de la empresa"> 
        <!-- Título de la sección "Registro" -->
        <h1>Registro</h1>
    </header>

    <!-- Contenido principal -->
    <section id="contenido">
        <!-- Formulario de registro -->
        <form action="SvRegistrar" method="POST">
            <!-- Etiqueta y campo para ingresar el nombre -->
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre" required>

            <!-- Etiqueta y campo para ingresar el apellido -->
            <label for="apellido">Apellido:</label>
            <input type="text" id="apellido" name="apellido" required>

            <!-- Etiqueta y campo para ingresar el correo electrónico -->
            <label for="correo">Correo Electrónico:</label>
            <input type="text" id="correo" name="correo" required>

            <!-- Etiqueta y campo para ingresar la contraseña -->
            <label for="contrasena">Contraseña:</label>
            <input type="password" id="contrasena" name="contrasena" required>

            <!-- Botón para enviar el formulario de registro -->
            <input type="submit" value="Registrar">
        </form>

        <!-- Enlace para regresar al dashboard -->
        <div>
            <a href="dashboard.jsp" class="return-button">Regresar</a>
        </div>
    </section>
</body>
</html>

