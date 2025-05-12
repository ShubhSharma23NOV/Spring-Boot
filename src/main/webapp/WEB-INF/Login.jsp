<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<center>
	<form action="/Login-Handle" method="post">
		<table>
			<tr>
			<td>Id: </td> 
			<td><input type="text"  name="id" placeholder="ENTER NAME"></td>
			</tr>
			<tr>
			<td>UserName: </td> 
			<td><input type="text"  name="userName" placeholder="ENTER USERNAME"></td>
			</tr>
			
			<tr>
			<td>Password: </td> 
			<td><input type="text"  name="password" placeholder="ENTER PASSWORD"></td>
			</tr>
			
			<tr>
			<th colspan="2"><input type="submit" value="Login"></th>
			</tr>
		</table>
	</form>
	</center>
</body>
</html>