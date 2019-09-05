<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Ver usuário ${user.nome}</title>
</head>
<body>
	<h1>Usuário - Informações</h1>
	<c:import url="/templates/header.jsp" />
	<div align="center">
		<table border="1" cellpadding="5">
			<tr>
				<th>Nome:</th>
				<td>${user.nome}</td>
			</tr>
			<tr>
				<th>Idade:</th>
				<td>${user.idade}</td>
			</tr>

			<tr>
				<th>Email:</th>
				<td>${user.email}</td>
			</tr>
		</table>

	</div>
</body>
</html>