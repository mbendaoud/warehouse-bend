<div id="logoutForm">
            <c:if test="${pageContext.request.userPrincipal.name != null}">
                <form id="logoutForm" method="POST" action="${contextPath}/logout">
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                </form>
                Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a>
            </c:if>
    <a href="${pageContext.request.contextPath}/"><img class="logo" src="${contextPath}/resources/img/Linux-icon.png"></a>
</div>

<nav>
	<ul id="menu">
	   <li><a href="${pageContext.request.contextPath}/">Home</a></li>
       <li><a href="${pageContext.request.contextPath}/products">Products</a></li>
       <li><a href="${pageContext.request.contextPath}/categories/list">Categories</a></li>
       <li><a href="${pageContext.request.contextPath}/clients/list">Clients</a></li>
       <li><a href="${pageContext.request.contextPath}/suppliers/list">Suppliers</a></li>
       <li><a href="${pageContext.request.contextPath}/users/list">Users</a></li>
       <li><a href="${pageContext.request.contextPath}/contactus">Contact Us</a></li>
	</ul>
</nav>