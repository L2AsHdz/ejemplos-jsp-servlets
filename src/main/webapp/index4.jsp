<!DOCTYPE html>
<html>
<head>
    <%@page contentType="text/html" pageEncoding="utf-8" %>
    <title>Formulario</title>
    <link rel="stylesheet" type="text/css" href="estilos.css">
</head>
<body>
<form action="" method="POST">
    <label for="nombre">Nombre:</label>
    <input type="text" id="nombre" name="nombre"><br>
    <label for="contraseña">Contraseña:</label>
    <input type="password" id="contraseña" name="contraseña"><br>

    <label for="sexo">Sexo:</label>
    <input type="radio" id="hombre" name="sexo" value="hombre">
    <label for="hombre">Hombre</label>
    <input type="radio" id="mujer" name="sexo" value="mujer">
    <label for="mujer">Mujer</label><br>

    <label for="idiomas">Idiomas:</label>
    <input type="checkbox" id="español" name="idiomas[]" value="español">
    <label for="español">Español</label>
    <input type="checkbox" id="ingles" name="idiomas[]" value="ingles">
    <label for="ingles">Inglés</label>
    <input type="checkbox" id="frances" name="idiomas[]" value="frances">
    <label for="frances">Francés</label><br>

    <label for="fecha_nacimiento">Fecha de nacimiento:</label>
    <input type="date" id="fecha_nacimiento" name="fecha_nacimiento"><br>

    <label for="pais">País:</label>
    <select id="pais" name="pais">
        <option value="guatemala">Guatemala</option>
        <option value="brasil">Brasil</option>
        <option value="chile">Chile</option>
    </select><br>

    <input type="submit" value="Enviar">
</form>

    <% String mensaje = "Hola Mundo!";%>
<h1><%= mensaje %></h1>

<%
    if (request.getParameter("nombre") != null) {
        String nombre = request.getParameter("nombre");
        out.println("Hola, " + nombre);
    }
%>