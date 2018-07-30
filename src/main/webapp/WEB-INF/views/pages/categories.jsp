<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="container" id="listCat">
<table id="listCategory">

    <thead>
    <tr>
      <th>Id</th>
      <th>Name</th>
      <th>description</th>
      <th>photo</th>
      <th>nomPhoto</th>
    </tr>
    </thead>

    <tbody>

      <c:forEach items="${categories}" var="current">
        <tr>
          <td><c:out value="${current.idCategorie}" />  </td>
          <td><c:out value="${current.nomCategorie}" /> </td>
          <td><c:out value="${current.description}" />  </td>
          <td><c:out value="${current.photo}" />        </td>
          <td><c:out value="${current.nomPhoto}" />     </td>
        </tr>
      </c:forEach>
    </tbody>

</table>
</div>

<!--
<div class="container" id="formCat">
       <h3>Saisie de categorie</h3>
           <form:form method="POST"
             action="/categories/addCategory" modelAttribute="categorie">
                <table>
                   <tr>
                       <td><form:label path="nomCategorie">Nom de categorie</form:label></td>
                       <td><form:input path="nomCategorie"/></td>
                   </tr>
                   <tr>
                       <td><form:label path="idCategorie">Id categorie</form:label></td>
                       <td><form:input path="idCategorie"/></td>
                   </tr>
                   <tr>
                       <td><input type="submit" value="Submit"/></td>
                   </tr>
               </table>
           </form:form>

</div>

-->


<script type="text/javascript">
    $(document).ready( function () {
        $('#listCategory').DataTable();
    } );
</script>

