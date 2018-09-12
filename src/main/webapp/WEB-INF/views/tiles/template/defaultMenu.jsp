<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<div id="logoutForm">
            <security:authorize access="isAuthenticated()">
                <form id="logoutForm" method="POST" action="${contextPath}/logout">
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                </form>
                Welcome <security:authentication property="principal.username" /> |
                AS
                <security:authorize access="hasAnyRole('ADMIN')">
                          ADMIN
                </security:authorize>
                <security:authorize access="hasAnyRole('USER')">
                           USER
                </security:authorize>
                <security:authorize access="hasAnyRole('DEVELOPER')">
                           DEVELOPER
                 </security:authorize> |
                <a onclick="document.forms['logoutForm'].submit()">Logout</a>

            </security:authorize>


    <a href="${pageContext.request.contextPath}/"><img class="logo" src="${contextPath}/resources/img/Linux-icon.png"></a>
</div>

<nav>
	<ul id="menu">
	   <li><a href="${pageContext.request.contextPath}/">Home</a></li>
       <li><a href="${pageContext.request.contextPath}/products/list">Products</a></li>
       <li><a href="${pageContext.request.contextPath}/categories/list">Categories</a></li>
       <li><a href="${pageContext.request.contextPath}/clients/list">Clients</a></li>
       <li><a href="${pageContext.request.contextPath}/suppliers/list">Suppliers</a></li>
       <li><a href="${pageContext.request.contextPath}/users/list">Users</a></li>
       <li><a href="${pageContext.request.contextPath}/contactus">Contact Us</a></li>
	</ul>
</nav>