<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Eliminar Autor</title>
</head>
<body>
 
<h1>Eliminar Autor</h1>
 
<form action="/autores/del" method="GET">
    <input type="hidden" name="idAutor" value="${autor.id_autor}" />
    <strong>¿Estás seguro de que quieres eliminar al autor: ${autor.nombre} ${autor.apellido}?</strong><br/><br/>
 
    <button type="submit">Confirmar eliminación</button>
<button onclick="window.location.href='/ismac-libreria-matutino-web/autores/findAll'; return false;">Cancelar</button>
</form>
 
</body>
</html>