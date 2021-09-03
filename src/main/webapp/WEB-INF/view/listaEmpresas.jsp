<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/entrada" var="linkEntradaServlet"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:import url="logout-parcial.jsp"></c:import>
	Usuario Logado: ${usuarioLogado.login}<br><br>
	Lista de empresas: <br>
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>
				${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
				<a href="${linkEntradaServlet}?acao=MostraEmpresa&id=${empresa.id}">editar</a> 
				<a href="${linkEntradaServlet}?acao=RemoveEmpresa&id=${empresa.id}">remover</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>