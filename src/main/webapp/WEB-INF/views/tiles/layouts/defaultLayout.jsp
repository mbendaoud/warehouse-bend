<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="fr">

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<head>
	<title><tiles:getAsString name="title" /></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link href="${contextPath}/resources/css/app.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/bootstrap.css" rel="stylesheet">
    <!--link href="${contextPath}/resources/css/common.css" rel="stylesheet"-->
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
     <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">
     <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>
</head>

<body>
		<header id="header">
			<tiles:insertAttribute name="header" />
		</header>
	
		<section id="sidemenu">
			<tiles:insertAttribute name="menu" />
		</section>
			
		<section id="site-content">
			<tiles:insertAttribute name="body" />
		</section>
		
		<footer id="footer">
			<tiles:insertAttribute name="footer" />
		</footer>
</body>
</html>