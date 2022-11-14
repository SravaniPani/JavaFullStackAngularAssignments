<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><br><br>
<h1>Login Page</h1><br><br>
<form action="login" method="post">
<h1>
Username:<input type="text" name="username"><br><br>
Password:<input type="password" name="password"><br><br>
<input type="submit" value="Login">
<input type="reset" value="Cancel">
</h1>
</form>
<h5 style="color:red"> ${error}</h5>
</body>
</html>