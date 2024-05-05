<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <!-- Definición de la codificación de caracteres -->
    <meta charset="UTF-8">
    <!-- Configuración de la vista para dispositivos móviles -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Título de la página -->
    <title> Iniciar Sesión </title>
    <!-- Enlace al archivo CSS de estilos de inicio de sesión -->
    <link rel="stylesheet" type="text/css" href="css/login_styles.css">
</head>
<body>
    <header>
        <!-- Logotipo de la empresa -->
        <img src="img/logotipo.png" alt="Logotipo de la empresa">
        <!-- Título de la página de inicio de sesión -->
        <h1>Iniciar Sesión</h1>
    </header>

    <section id="contenido">
        <!-- Formulario de inicio de sesión -->
        <form action="SvLogin" method="POST">
            <!-- Campo de entrada para el correo electrónico -->
            <p><label for="correo">Correo Electrónico:</label></p>
            <input type="email" id="correo" name="correo" required>

            <!-- Campo de entrada para la contraseña -->
            <p><label for="contrasena">Contraseña:</label></p>
            <input type="password" id="contrasena" name="contrasena" required>

            <!-- Botón para enviar el formulario -->
            <button type="submit">Ingresar</button>
        </form>

        <!-- Botón para redirigir a la página de registro -->
        <button class="registrarse" onclick="window.location.href='registrar.jsp'">Registrarse</button>
        <!-- Botón para redirigir a la página de recuperación de contraseña -->
        <button class="olvidar-contrasena" onclick="window.location.href='olvide_contraseña.jsp'">Olvidé mi contraseña</button>

        <!-- Imagen de Google como hipervínculo para ingresar -->
        <a href="https://google.com">
            <img class="google-image" src="img/google.png" alt="Ingresar con Google">
        </a>

        <!-- Botón para regresar a la página de inicio de sesión -->
        <button class="regresar" onclick="window.location.href='Login.jsp'">Regresar</button>
        <!-- Mensaje informativo -->
        <p>Explora la interfaz principal del sistema</p>
    </section>
</body>
</html>


