<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<% String ctxPath = request.getContextPath(); %>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title>Authentification</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
  	<link href="css/signin.css" rel="stylesheet" />
</head>

<body>

  <div class="container">
    <div class="row vertical-offset-100 justify-content-center">
    	<div class="col-4">
    		<div class="card text-center">
			  	<div class="card-header">
			    	<h3 class="card-title">Se connecter</h3>
			 	</div>
			  	<div class="card-body">
			    	<form  role="form" method="post" action="<c:url value="/auth" />" >
			    	<span class="alert alert-danger" role="alert">${erreur}</span>			    	
                    <fieldset>
			    	  	<div class="form-group">
			    		    <input class="form-control" placeholder="Identifiant" required name="login" type="text">
			    		</div>
			    		<div class="form-group">
			    			<input class="form-control" placeholder="Password" required name="password" type="password">
			    		</div>
			    		<input class="btn btn-lg btn-success btn-block" type="submit" value="Login">
			    	</fieldset>
			      	</form>
			    </div>
			</div>
		</div>
	</div>
		
</div>
</body>
</html>