<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib
uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <%@ page
import="java.util.ArrayList"%>

<html>
<head>
<title>Lista de Usuários</title>
</head>
<body>

	<h1>Lista de usuários</h1>
	<c:import url="/templates/header.jsp" />
	<div align="center">
		<table border="1" cellpadding="5">
			<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>Email</th>
				<th>Idade</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>

			<% ArrayList eList = (ArrayList) session.getAttribute("lsa");
			request.setAttribute("ListUser", eList); %>
			<c:forEach var="user" items="${listUser}">
				<tr>
					<td><c:out value="${user.id}" /></td>
					<td><c:out value="${user.nome}" /></td>
					<td><c:out value="${user.email}" /></td>
					<td><c:out value="${user.idade}" /></td>
					<td><a href="ver?id=<c:out value='${user.id}' />">Ver</a>
						&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><a href="edit?id=<c:out value='${user.id}' />">Editar</a>
						&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><a href="delet?id=<c:out value='${user.id}' />">Deletar</a>
						&nbsp;&nbsp;&nbsp;&nbsp;</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>