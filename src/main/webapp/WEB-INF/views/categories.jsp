<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>


<div class="container" id="formCat">

<h1>gestion des categoreis</h1>

Here are all categories!:
    <table>
      <TH>Id</th>
      <TH>Name</th>
      <TH>description</th>
      <TH>photo</th>
      <TH>nomPhoto</th>
      <c:forEach items="${categories}" var="current">
        <tr>
          <td><c:out value="${current.idCategorie}" /><td>
          <td><c:out value="${current.nomCategorie}" /><td>
          <td><c:out value="${current.description}" /><td>
          <td><c:out value="${current.photo}" /><td>
          <td><c:out value="${current.nomPhoto}" /><td>
        </tr>
      </c:forEach>
    </table>
  </body>


</div>

</body>
</html>
