<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Inventario de equipos</title>
    <link rel="stylesheet" href="css/estilos.css">
</head>
<body>
<h1>Inventario de equipos – Telecom Andina</h1>

<%-- Ejercicio 3: combobox de sedes --%>
<form method="get" action="equipos">
    <label for="idsede">Sede:</label>
    <select name="idsede" id="idsede">
        <option value="0">Todas las sedes</option>
        <%-- TODO 3: una opción por cada sede; la sede elegida debe quedar seleccionada --%>
    </select>
    <button type="submit">Filtrar</button>
</form>

<%-- TODO 4: botón "Descargar PDF" que invoque a equipos?accion=pdf&idsede=X --%>

<%-- Ejercicio 3: listado --%>
<table>
    <thead>
    <tr>
        <th>Modelo</th>
        <th>Tipo</th>
        <th>Sede</th>
        <th>Precio (S/)</th>
        <th>Cantidad</th>
        <th>Soporte mensual (S/)</th>
    </tr>
    </thead>
    <tbody>
    <%-- TODO 3: una fila por equipo y una última fila con el total (montos con 2 decimales) --%>
    </tbody>
</table>
</body>
</html>
