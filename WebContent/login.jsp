<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Login</title>
</head>
<body>
	<div class="container" align="center">
		<h1 class="row">Bienvenido a Banco Platinium</h1>
		<br>
		<h3> Ingreso </h3>
		<form  action="LoginServlet" method="post" > 
			<table>
				<tr><td>Usuario:</td>
				<td><input id="username" type="text" name="username"/></td></tr>
				
				<tr><td>Contraseña:</td>
				<td><input id="password" type="password" name="password"/></td></tr>					
			</table>
			
			<br>
			<input type="submit" value="Ingresar" id="Ingresar"/>  
			<input type="reset" value="Limpiar"/>		  
		</form>  
	</div>
</body>
</html>