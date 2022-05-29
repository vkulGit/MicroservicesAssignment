<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
 integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
 crossorigin="anonymous">
</head>
<body>
<div class = "container">
  <div class = "row">
  <div class = "col-md-6 col-md-offset-3">
	 <h1> User Login Page </h1>
	 <div><h5><c:if test="${not empty error}">${error}</c:if></h5></div>
		<form action="/login" method="post">
			<div class="form-group">
				 <label for ="username"> UserName </label> : 
				 <input type="text" name="userName" value="" class = "form-control" required="required">
			</div>
			<div class = "form-group">
				 <label for="password">Password</label>:
		 	 	<input type="password" name="password" value=""  class = "form-control" required="required">
		 	</div>
			<div class = "form-group">
				<input type="submit" value="Login"  class="form-control btn btn-primary" style="background-color:lime;">
				<input type="button" value="Register"  class="form-control btn btn-primary" onclick="goToRegisterPage()" style="background-color:orange;">
			</div>
		</form>
		</div>
	</div>
</div>
</body>
</html>

<script type="text/javascript">
function goToRegisterPage()
{
	window.location.href="/register";
}
</script>