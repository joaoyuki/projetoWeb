<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import ="com.joao.entidade.contato" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:import url="cabecalho.jsp"></c:import>

<%-- <jsp:useBean id = "contato" class="entidade.contato" /> não é interessante instanciar objetos na camada view --%>

<c:forEach var="contatos" items="${contatos}"> <%-- contatos veio da ListaContatosLogic.java --%>
<tr>
	<td>
		${contatos.id}
		${contatos.nome}
		<a href="mvc?logica=RemoveContatoLogic&id=${contatos.id}">Remover</a>
	</td>
</tr>
</c:forEach>

</body>
</html>