<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
<title>User Management Application</title>
</head>
<body>

	<h1>Adicionar novo usuário</h1>
	<c:import url="/templates/header.jsp" />
	<div align="center">
		<form action="insert" method="post">

			<table border="1" cellpadding="5">
				<tr>
					<th>Nome:</th>
					<td><input type="text" name="nome" size="45" /></td>
				</tr>
				<tr>
					<th>Idade:</th>
					<td><input type="text" name="idade" size="2" /></td>
				</tr>

				<tr>
					<th>Email:</th>
					<td><input type="email" name="email" size="45" /></td>
				</tr>
				<tr>
				<td colspan="2" align="center"><input type="submit"
						value="cadastrar" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>