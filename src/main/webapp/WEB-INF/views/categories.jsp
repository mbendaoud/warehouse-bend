<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>




<div class="container" id="formCat">

<h1>gestion des categoreis</h1>
<f:form modelAttribut="categorie" action="saveCat" method="post">
<table>


<tr>
<td> idCategorie</td>
<td> <f:input path="idCategorie"/></td>
<td> <f:errors  path="idCategorie"/></td>
<td> idCategorie</td>
</tr>
<tr>
   <td> nom Categorie</td>
   <td> <f:input path="nomCategorie"/></td>
   <td> <f:errors  path="nomCategorie"/></td>

   </tr>


   <tr>
      <td> description</td>
      <td> <f:input path="description"/></td>
      <td> <f:errors  path="description"/></td>

      </tr>

      <tr>
      <td>
      <input type="submit" value="Save"/>
      </td>
      </tr>

</table>
<table>
<tr><th>ID</th> <th>nomCategorie</th> <th>description</th> </tr>
<c:forEach items="${categories}" var ="cat">
<tr>
<td> ${
cat.idCategorie}</td>
<td> ${cat.nomCategoriee}</td>
<td> ${cat.description}</td>
</tr>
</c:forEach>

</table>

</f:form>


</div>
<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
