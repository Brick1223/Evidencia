
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Contabilidad - Sitio Web de Gestión</title>
    <link rel="stylesheet" type="text/css" href="css/contabilidad_styles.css">
</head>
<body>
    <header>
        <img src="logotipo.png" alt="Logotipo de la empresa"> 
        <h1>Contabilidad</h1>
    </header>

    <nav>

    </nav>

    <section id="contenido">
        <h2>Registro de Gastos</h2>
        <div class="form-container">
          <form id="registroForm" action="SvContabilidad" method="POST">
    <label for="concepto">Concepto:</label>
    <input type="text" id="concepto" name="concepto" required>

    <label for="monto">Monto:</label>
    <input type="text" id="monto" name="monto" required>

    <button type="submit">Registrar Gasto</button>
</form>

        </div>

        <table class="outer-table">
            <tr>
                <td>
                    <table class="inner-table">
                        <tr>
                            <th class="inner-th">Concepto:</th>
                        </tr>
                        <tr>
                            <td id="conceptoOutput" class="inner-td"></td>
                        </tr>
                    </table>
                </td>
                
                <td>
                    <table class="inner-table">
                        <tr>
                            <th class="inner-th">Monto:</th>
                        </tr>
                        <tr>
                            <td id="montoOutput" class="inner-td"></td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>

        <div class="destacado">
            <li><a href="dashboard.jsp">Regresar</a></li>
            <p>Explora la interfaz principal del sistema</p>
        </div>
    </section>

    <footer>
       
    </footer>

    <script src="contabilidad_script.js"></script>
</body>
</html>

