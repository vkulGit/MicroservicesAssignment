<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
 integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
 crossorigin="anonymous">
</head>
<body>
<div class="navbar-collapse">
     <ul class="nav navbar-nav navbar-right">
     	<li><h5>Welcome ${userName }</h5></li>
         <li><a href="/logout">Logout</a></li>
     </ul>
 </div>
</body>
</html>