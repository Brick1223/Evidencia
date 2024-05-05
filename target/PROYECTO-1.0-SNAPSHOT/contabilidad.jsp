
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <!-- Título de la página -->
    <title>Contabilidad - Sitio Web de Gestión</title>
    <!-- Enlace al archivo CSS de estilos de contabilidad -->
    <link rel="stylesheet" type="text/css" href="css/contabilidad_styles.css">
</head>
<body>
    <!-- Encabezado de la página -->
    <header>
        <!-- Logotipo de la empresa -->
        <img src="img/logotipo.png" alt="Logotipo de la empresa"> 
        <!-- Título de la sección de contabilidad -->
        <h1>Contabilidad</h1>
    </header>

    <!-- Barra de navegación (por completar) -->
    <nav>

    </nav>

    <!-- Contenido principal -->
    <section id="contenido">
        <!-- Título de la sección de registro de gastos -->
        <h2>Registro de Gastos</h2>
        <!-- Formulario de registro de gastos -->
        <div class="form-container">
            <form id="registroForm" action="SvContabilidad" method="POST">
                <label for="concepto">Concepto:</label>
                <!-- Campo de entrada para el concepto del gasto -->
                <input type="text" id="concepto" name="concepto" required>

                <label for="monto">Monto:</label>
                <!-- Campo de entrada para el monto del gasto -->
                <input type="text" id="monto" name="monto" required>

                <!-- Botón para enviar el formulario de registro -->
                <button type="submit">Registrar Gasto</button>
            </form>

        </div>

        <!-- Tabla para mostrar los gastos registrados -->
        <table class="outer-table">
            <tr>
                <td>
                    <!-- Tabla interna para el concepto del gasto -->
                    <table class="inner-table">
                        <tr>
                            <th class="inner-th">Concepto:</th>
                        </tr>
                        <tr>
                            <!-- Celda para mostrar el concepto del gasto -->
                            <td id="conceptoOutput" class="inner-td"></td>
                        </tr>
                    </table>
                </td>
                
                <td>
                    <!-- Tabla interna para el monto del gasto -->
                    <table class="inner-table">
                        <tr>
                            <th class="inner-th">Monto:</th>
                        </tr>
                        <tr>
                            <!-- Celda para mostrar el monto del gasto -->
                            <td id="montoOutput" class="inner-td"></td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>

        <!-- Sección destacada con enlace de regreso y mensaje informativo -->
        <div class="destacado">
            <!-- Enlace para regresar al dashboard -->
            <li><a href="dashboard.jsp">Regresar</a></li>
            <!-- Mensaje informativo -->
            <p>Explora la interfaz principal del sistema</p>
        </div>
    </section>

    <!-- Pie de página (por completar) -->
    <footer>
       
    </footer>

    <!-- Script de JavaScript para contabilidad -->
    <script src="contabilidad_script.js"></script>
</body>
</html>

