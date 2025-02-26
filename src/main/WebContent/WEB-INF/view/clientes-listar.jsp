<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ventas - Biblioteca</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap-table.min.css" />
	<!-- Font Awesome -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
	<style>
		/* Estilo interactivo para el botón Agregar */
		#btnAgregar {
			font-size: 18px; /* Tamaño del texto */
			padding: 10px 20px; /* Espaciado dentro del botón */
			cursor: pointer;
			transition: all 0.3s ease; /* Transición suave */
		}

		/* Estilo cuando se pasa el cursor sobre el botón */
		#btnAgregar:hover {
			background-color: purple; /* Cambia el color de fondo */
			color: white; /* Cambia el color del texto */
			transform: scale(1.1); /* Aumenta ligeramente el tamaño del botón */
		}

		/* Estilo cuando el botón es presionado */
		#btnAgregar:active {
			background-color: #218838; /* Color más oscuro al hacer clic */
			transform: scale(1); /* Mantiene el tamaño original al hacer clic */
		}
	</style>
</head>
<body>
<nav>
</nav>

<section>
	<div class="container" style="padding-top: 5px;">
		<h1>Clientes</h1>
	</div>

	<div class="container" style="text-align: center;">
		<!-- Botón de Agregar con ícono Font Awesome -->
		<button class="btn btn-primary" id="btnAgregar">
			<i class="fas fa-plus"></i> <i class="fa-solid fa-user"></i>
		</button>
	</div>
	
	<div class="table-responsive">
		<table id="tabla1" name="tabla1" data-search="True" data-pagination="True" class="table table-striped table-sm">
			<thead>
				<tr>
					<th data-sortable="True"> idCliente</th>
					<th data-sortable="True"> Cedula</th>
					<th data-sortable="True"> Nombre</th>
					<th data-sortable="True"> Apellido</th>
					<th data-sortable="True"> Direccion</th>
					<th data-sortable="True"> Telefono</th>
					<th data-sortable="True"> Correo</th>
					<th> Acciones</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${clientes}">
					<tr>
						<td class="idCliente">${item.idCliente}</td>
						<td>${item.cedula}</td>
						<td>${item.nombre}</td>
						<td>${item.apellido}</td>
						<td>${item.direccion}</td>
						<td>${item.telefono}</td>
						<td>${item.correo}</td>
						<td>
							<button class="btn btn-success actualizar-btn"><i class="fa-solid fa-pen"></i> Actualizar</button>
							<button class="btn btn-danger borrar-btn"><i class="fa-solid fa-trash"></i> Borrar</button>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</section>

<footer></footer>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-3.7.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap-table.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap-table-es-MX.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		// Inicializar tabla bootstrap
		var $tabla1 = $('#tabla1');
		$tabla1.bootstrapTable({
			sortReset: true
		});

		// Evento para el botón de "Agregar"
		$('#btnAgregar').on('click', function() {
			window.location.href = '${pageContext.request.contextPath}/clientes/findOne?opcion=1';
			return false; // Evitar recarga de la página
		});

		// Evento para el botón de "Actualizar"
		$(document).on("click", ".actualizar-btn", function() {
			var row = $(this).closest("tr");
			var idCliente = row.find(".idCliente").text().trim();
			if (idCliente && !isNaN(idCliente)) {
				var opcion = 1;
				window.location.href = '${pageContext.request.contextPath}/clientes/findOne?idCliente=' + idCliente + '&opcion=' + opcion;
			} else {
				console.error("El idCliente no es válido.");
			}
		});

		// Evento para el botón de "Borrar"
		$(document).on("click", ".borrar-btn", function() {
			var row = $(this).closest("tr");
			var idCliente = row.find(".idCliente").text().trim();
			if (idCliente && !isNaN(idCliente)) {
				var opcion = 2;
				window.location.href = '${pageContext.request.contextPath}/clientes/findOne?idCliente=' + idCliente + '&opcion=' + opcion;
			} else {
				console.error("El idCliente no es válido.");
			}
		});
	});
</script>
</body>
</html>
