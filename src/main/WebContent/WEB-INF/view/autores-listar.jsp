<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Autores</title>
</head>
<body>
 
<h1>Autores</h1>
 
<!-- Botón para agregar un nuevo autor -->

<button onclick="window.location.href='/ismac-libreria-matutino-web/autores/findOne?opcion=1'; return false;">Agregar</button>
 
<table border="1">
    <thead>
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>País</th>
            <th>Dirección</th>
            <th>Teléfono</th>
            <th>Correo</th>
            <th>Acciones</th>
        </tr>
    </thead>
    <tbody>
        <!-- Iterar sobre la lista de autores y mostrar los datos -->
        <c:forEach var="autor" items="${autores}">
            <tr>
                <td>${autor.id_autor}</td>
                <td>${autor.nombre}</td>
                <td>${autor.apellido}</td>
                <td>${autor.pais}</td>
                <td>${autor.direccion}</td>
                <td>${autor.telefono}</td>
                <td>${autor.correo}</td>
                <td>
                    <!-- Botones para editar o eliminar -->
                    <button onclick="window.location.href='/autores/findOne?idAutor=${autor.id_autor}&opcion=1'; return false;">Editar</button>
                    <button onclick="window.location.href='/autores/findOne?idAutor=${autor.id_autor}&opcion=2'; return false;">Eliminar</button>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
 
</body>
</html>