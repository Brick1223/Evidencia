
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Olvidé la Contraseña - Sitio Web de Gestión</title>
    <link rel="stylesheet" type="text/css" href="css/olvide_contraseña.css">
</head>
<body>
    <header>
        <img src="logotipo.png" alt="Logotipo de la empresa"> 
        <h1>Olvidé la Contraseña</h1>
    </header>

    <section id="contenido">
 <form action="SvContraseña" method="POST">

            <label for="correo">Correo Electrónico:</label>
            <input type="text" id="correo" name="correo" required>

            <input type="submit" value="Restablecer Contraseña">
        </form>

        <div>
            <a href="dashboard.jsp" class="return-button">Regresar</a>
        </div>
    </section>

    <script src=" "></script>
</body>
</html>

