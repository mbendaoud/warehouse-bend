<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div id="tabs">
  <ul>
    <li><a href="#listProduct"><span>Products list</span></a></li>
    <li><a href="#addProduct"><span>Add Product</span></a></li>
  </ul>

<div id="listProduct">
<table id="listProductTable">

    <thead>
    <tr>
      <th>Id product</th>
      <th>Id category</th>
      <th>bar code</th>
      <th>description</th>
      <th>photo</th>
      <th>price</th>
      <th>quantity</th>
      <th>delete</th>
    </tr>
    </thead>

    <tbody>

      <c:forEach items="${products}" var="current">
        <tr>
          <td><c:out value="${current.idProduit}" />  </td>
          <td><c:out value="${current.categorie.idCategorie}" />  </td>
          <td><c:out value="${current.codeBare}" /> </td>
          <td><c:out value="${current.designation}" />  </td>
          <td><c:out value="${current.photo}" />        </td>
          <td><c:out value="${current.prix}" />     </td>
          <td><c:out value="${current.quantite}" />     </td>
          <td> <a href="${pageContext.request.contextPath}/categories/deleteCategory?id=${current.categorie.idCategorie}">
          <img class="icone" src="${contextPath}/resources/img/delete.png"/></a></td>
        </tr>
      </c:forEach>

    </tbody>

</table>

</div>

<div id="addProduct">
IN RROGRESS
</div>


</div>


<script type="text/javascript">
    $(document).ready( function () {
        $('#listProductTable').DataTable();
    } );
    $( "#tabs" ).tabs();
</script>

