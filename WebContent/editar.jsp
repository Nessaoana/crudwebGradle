<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Editar usuário</h1>
	<!-- Menu -->
	<c:import url="/templates/header.jsp" />
	<div align="center">

	<!-- Formulário para edição  -->
		<form action="update" method="post">

			<table border="1" cellpadding="5">
				<h2>Editar Usuário</h2>
				<tr>
					<th>Nome:</th>
					<td><input type="text" name="nome" size="45" value="<c:out value='${user.name}' />" ></td>
				</tr>
				<tr>
					<th>Idade:</th>
					<td><input type="text" name="idade" size="2" value="<c:out value='${user.idade}' />" /></td>
				</tr>

				<tr>
					<th>Email:</th>
					<td><input type="email" name="email" size="45" value="<c:out value='${user.email}' />"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Salvar" /></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>