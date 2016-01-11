<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <script type="text/javascript" src="resources/jquery-1.12.0.js"></script>
 <script src="//code.jquery.com/jquery-1.12.0.min.js"></script>
 <script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <script type="text/javascript">
    function finalizaAgora() {
    	 alert("teste");
    
     // $.post("finalizaTarefa", {'id' : id}, function() {
    	  $.post("finalizaTarefa", function() {
        // selecionando o elemento html através da 
        // ID e alterando o HTML dele 
        //$("#tarefa_"+id).html("Finalizado");
       
      });
    }
  </script>

<c:forEach var="tarefas" items="${listaDeTarefas}"> <%-- listaDeContatos veio da TarefasController.java --%>
<tr>
	<td>
		<a href="removeTarefa" onClick="finalizaAgora()">${tarefas.descricao}</a>
	
	</td>
</tr>
</c:forEach>

</body>
</html>