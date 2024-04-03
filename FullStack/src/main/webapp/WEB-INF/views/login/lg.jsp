<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>This is Login Page</h1>

<h2>${notLoginMsg}</h2>

<form action="/FullStack/login/verify" method="post">
	
	EnterUserName:
	<input type="text" name="username"  /><br><br>
	
	EnterPassword:
	<input type="text" name="password"  /><br><br>

	<input type="submit" name="btnSave" value="Login">
</form>

</body>
</html>