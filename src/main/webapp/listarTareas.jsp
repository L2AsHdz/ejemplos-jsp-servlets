<%@ page import="java.util.List" %>
<%@ page import="com.ipc2.holamundoservlet.model.Tarea, com.ipc2.holamundoservlet.datos.TareaDB" %>

<!DOCTYPE html>
<html>
<head>
    <%@page contentType="text/html" pageEncoding="utf-8" %>
    <title>Lista de Tareas</title>
    <link rel="stylesheet" type="text/css" href="estilosLista.css">
</head>
<body>
<h1>Lista de Tareas</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Título</th>
        <th>Descripción</th>
        <th>Fecha</th>
        <th>Estado</th>
        <th>Acciones</th>
    </tr>
    <%
        TareaDB tareaDB = new TareaDB();
        List<Tarea> tareas = tareaDB.getTareas();
        for (Tarea tarea : tareas) {
    %>
    <tr>
        <td><%= tarea.getId() %></td>
        <td><%= tarea.getTitulo() %></td>
        <td><%= tarea.getDescripcion() %></td>
        <td><%= tarea.getFecha() %></td>
        <td><%= tarea.getEstado() %></td>
        <td>
            <a href="#">Editar</a>
            <a href="#">Eliminar</a>
        </td>
    </tr>
    <%
        }
    %>
</table>
<br>
<a class="btn" href="#">Agregar tarea</a>
<a class="btn btn-danger" href="#">Eliminar todas las tareas</a>
</body>
</html>