
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro - Sitio Web de Gestión</title>
    <link rel="stylesheet" type="text/css" href="css/registro_styles.css">
</head>
<body>
    <header>
        <img src="logotipo.png" alt="Logotipo de la empresa"> 
        <h1>Registro</h1>
    </header>

    <section id="contenido">
   <form action="SvRegistrar" method="POST">


            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre" required>

            <label for="apellido">Apellido:</label>
            <input type="text" id="apellido" name="apellido" required>

            <label for="correo">Correo Electrónico:</label>
            <input type="text" id="correo" name="correo" required>

            <label for="contrasena">Contraseña:</label>
            <input type="password" id="contrasena" name="contrasena" required>

            <input type="submit" value="Registrar">
        </form>

        <div>
            <a href="dashboard.jsp" class="return-button">Regresar</a>
        </div>
    </section>
</body>
</html>
