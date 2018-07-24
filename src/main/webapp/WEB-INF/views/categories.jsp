<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Create an account</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<div class="container" id="listCat">

<h1>Liste des categories</h1>

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

<div class="container" id="formCat">
       <h3>Saisie de categorie</h3>
           <form:form method="POST"
             action="/adminCat/addCategory" modelAttribute="categorie">
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
<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>