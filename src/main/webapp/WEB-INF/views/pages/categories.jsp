<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div id="tabs">
  <ul>
    <li><a href="#listCat"><span>Categories list</span></a></li>
    <li><a href="#addCat"><span>Add Category</span></a></li>
    <li><a href="#deletecat"><span>Delete category</span></a></li>
  </ul>

<div id="listCat">
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

<div id="addCat">
           <form:form method="POST"
             action="/categories/addCategory" modelAttribute="categorie">
                <table>
                   <tr>
                       <td><form:label path="nomCategorie">Category name</form:label></td>
                       <td><form:input path="nomCategorie"/></td>
                   </tr>
                   <tr>
                       <td><form:label path="description">Category description</form:label></td>
                       <td><form:input path="description"/></td>
                   </tr>
                   <tr>
                        <td><form:label path="photo">Category photo</form:label></td>
                        <td><form:input path="photo"/></td>
                   </tr>
                   <tr>
                        <td><form:label path="nomPhoto">Category photo name</form:label></td>
                        <td><form:input path="nomPhoto"/></td>
                   </tr>

                   <tr>
                       <td><input type="submit" value="Submit"/></td>
                   </tr>
               </table>
           </form:form>

</div>

<div id="deletecat">
Delete a category
</div>

</div>


<script type="text/javascript">
    $(document).ready( function () {
        $('#listCategory').DataTable();
    } );
    $( "#tabs" ).tabs();
</script>

