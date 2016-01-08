<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import ="com.joao.entidade.contato" %>
<html>
  <body>
  	
  	<c:import url="cabecalho.jsp"></c:import>
  
    Bem vindo
    <% out.println("Usando scriptlet"); %>
    <br>

    <% contato c = new contato(); 
    	c.setNome("teste");
    	out.println(c.getNome());%>
    	
    <br>
    
    <jsp:useBean id = "contato" class="com.joao.entidade.contato"" />
    ${contato.nome}
    
    <br>
    <br>
    <table>
    <c:forEach var="contatos" items="${contato.lista}">
    <tr> 
   	    <td>${contatos.id}</td>
    	<td>${contatos.nome}</td>
    </tr>
    </c:forEach>
    </table>
  </body>    
</html>