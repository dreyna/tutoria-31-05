<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tutoría</title>
<link rel="stylesheet" href="recursos/css/bootstrap.min.css" media="all" />
</head>
<body>
	<div class="container">
		<form action="uc" method="post">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Usuario" name="username"/>
			</div>
			<div class="form-group">
				<input type="password" class="form-control" placeholder="Password" name="password"/>
			</div>
			<input type="submit" value="Enviar" class="btn btn-primary">
		</form>
	</div>
	<script src="recursos/js/jquery.js"></script>
	<script src="recursos/js/bootstrap.min.js"></script>
</body>
</html>