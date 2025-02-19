<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Agregar o Editar Autor</title>
</head>
<body>
 
<h1>Gestionar Autor</h1>
 
<form action="${pageContext.request.contextPath}/autores/add" method="POST">
    <input type="hidden" name="idAutor" value="${autor.idAutor}" />
 
    Nombre: <input type="text" name="nombre" value="${autor.nombre}" required /><br/>
    Apellido: <input type="text" name="apellido" value="${autor.apellido}" required /><br/>
    País: <input type="text" name="pais" value="${autor.pais}" required /><br/>
    Dirección: <input type="text" name="direccion" value="${autor.direccion}" required /><br/>
    Teléfono: <input type="text" name="telefono" value="${autor.telefono}" required /><br/>
    Correo: <input type="email" name="correo" value="${autor.correo}" required /><br/>
 
    <button type="submit">Guardar</button>
    <button onclick="window.location.href='/ismac-libreria-matutino-web/autores/findAll'; return false;">Cancelar</button>
</form>
 
</body>
</html>