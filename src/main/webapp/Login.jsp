
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Iniciar Sesión </title>
        <link rel="stylesheet" type="text/css" href="css/login_styles.css">
</head>
<body>
    <header>
        <img src=`logotipo.png` alt="Logotipo de la empresa">
        <h1>Iniciar Sesión</h1>
    </header>

    <section id="contenido">
        <form action="SvLogin" method="POST">
            <p><label for="correo">Correo Electrónico:</label></p>
            <input type="email" id="correo" name="correo" required>

            <p><label for="contrasena">Contraseña:</label></p>
            <input type="password" id="contrasena" name="contrasena" required>

            <button type="submit">Ingresar</button>
        </form>

        <button class="registrarse" onclick="window.location.href='registrar.jsp'">Registrarse</button>
        <button class="olvidar-contrasena" onclick="window.location.href='olvide_contraseña.jsp'">Olvidé mi contraseña</button>

        <button class="ingresar-con">
            Ingresar con:
        </button>
        
        <img class="google-image" src=`google.png` alt="Ingresar con Google">

        <button class="regresar" onclick="window.location.href='Login.jsp'">Regresar</button>
        <p>Explora la interfaz principal del sistema</p>
    </section>
</body>
</html>

