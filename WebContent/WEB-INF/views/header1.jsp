<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<title>ProxibanqueV2</title>
</head>

<body style="background-color: gray">
	<div class=header>
		<nav class="navbar navbar-expand-lg navbar-light bg-dark">
			<div class="roundedImage"></div>
			<img id="logo" src="images/headerv2-logo.png" />
			<h1 style="color: white">ProxiBanque</h1>
			<div id="username">
				<a id="userStatut" href="#">${sessionScope.conseiller}</a>
				<div id="disconect">


					<!-- TODO mettre le lien pour l'icone logout -->


					<a href="#"><img id="logout" src="images/logout-icon.png"
						alt="se déconnecter" title="se déconnecter" /></a>
				</div>
			</div>
		</nav>
	</div>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<ul class="nav">
			<li class="nav-item"><a class="nav-link active" href="#">Clients</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="#">Comptes</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Opérations</a>
			</li>
		</ul>
	</nav>
=======
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <title>Document</title>
</head>

<body style="background-color: gray">
    <div class=header>
        <nav class="navbar navbar-expand-lg navbar-light bg-dark">
            <h1 style="color: white">ProxiBanque</h1> 
            <div id="username">		
			<a href="#">${sessionScope.conseiller.nom}</a>
			<a href="<c:url value="/logout" />">se déconnecter</a>
			</div>                                 
        </nav>
    </div>
>>>>>>> 9b3b4701ed8abfcca747d39fd3bf748d91706a70
